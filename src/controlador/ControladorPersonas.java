
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionPG;
import modelo.ModeloPersona;
import modelo.ModeloProducto;
import modelo.Persona;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import vista.VistaPersona;



public class ControladorPersonas {
    private ModeloPersona modelo;
    private VistaPersona vista;
    private Persona metodos;
    private ModeloProducto listarp;
    Connection con;
//    private ConexionPG conmsql; 
    String[] datospersona = {"Cedula", "Nombre", "Apellido", "Fecha nacimiento", "Telefono", " Sexo", "Sueldo", "Cupo","Correo"};
    List<Persona> personas = new ArrayList<Persona>();
    DefaultTableModel tabla = null; 
    public  String modform;
    String idselect;
    

    

    public ControladorPersonas(ModeloPersona modelo, VistaPersona vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
//        vista.setLocationRelativeTo(null);
        mostrarpersonas();
        mostrartabla();
        seleccionar();
        validar();       
    }  
    public void iniciarControlador() {
        vista.getBtnConsultar().addActionListener(C -> buscarperso());
        vista.getMOSTRART().addActionListener(C -> mostrartabla());
        vista.getBtnRemover().addActionListener(C -> confirmareliminacion());
//        vista.getBotonregistrar().addActionListener(c->ingresar() );
        vista.getBtnCrear().addActionListener(C -> abrirform(modform = "CREAR"));
        vista.getBtnEditar().addActionListener(C -> abrirform(modform = "EDITAR"));
        vista.getBtnImprimir().addActionListener(l->printReport());
        vista.getBtnImprimirP().addActionListener(l->printparametros());
        vista.getBotonConfirmar().addActionListener(c -> {
            ingresar();
            if (modform == "CREAR") {
                if (modelo.crearPersona()) {
                 JOptionPane.showMessageDialog(null, "REGISTRO CORRECTO");
                 mostrartabla();
                 salirform();
                }else{
                   JOptionPane.showMessageDialog(null, "REGISTRO INCORRECTO"); 
                }
            } else {                
                modificar();
                JOptionPane.showMessageDialog(null, "MODIFICADO CORRECTAMENTE"); 
            }
            ; 
        });
         
        vista.getBtnSalir().addActionListener(C-> salirform());
       
    }
     
    public void validar() {
        
        vista.getTxtnombresform().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras(vista.getTxtnombresform(), 20);
            }
        });
         vista.getTxtapellidosform().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras_espacios(vista.getTxtapellidosform(), 30);
            }
        });
        vista.getTxtcedulaform().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.numero(vista.getTxtcedulaform(), 10);
            }
        });
        vista.getTxtcupoform().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.numero(vista.getTxtcupoform(), 3);
            }
        });
        vista.getTxtsueldoform().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.dinero(vista.getTxtsueldoform(), 7);
            }
        });
        
        vista.getTxttelefonoform().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.numero(vista.getTxttelefonoform(), 10);
            }
        });
        
        vista.getTxtsexoform().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras(vista.getTxtsexoform(), 9);
            }
        });

    }
    private void buscarperso() {
        if (vista.getTxtBuscar().getText().equals("")) {
         
        }else{
         
        DefaultTableModel model = (DefaultTableModel) vista.getT_personas().getModel();
        model.setRowCount(0);
        String idpet = vista.getTxtBuscar().getText();
        System.out.println(idpet);
        personas = modelo.listarPersonas(idpet);
        System.out.println(personas.toString());
        personas.stream().forEach(tipos -> {
        Object[] filaNueva = {tipos.getIdPersona(), tipos.getNombrePersona()
        , tipos.getApellidoPersona() 
        ,String.valueOf(tipos.getEdad(tipos.getFechanacimineto())),
        tipos.getTelefono(), tipos.getSexo(), 
        String.valueOf(tipos.getSueldo()), tipos.getCupo(), tipos.getCorreo()};
        tabla.addRow(filaNueva);
        });
        vista.getT_personas().setModel(tabla); 
        }
    }
    public void mostrarpersonas() {    
     tabla=new DefaultTableModel(null, datospersona); 
     vista.getT_personas().setModel(tabla);
    }
    public void mostrartabla() {
        DefaultTableModel model = (DefaultTableModel) vista.getT_personas().getModel();
        model.setRowCount(0);
        personas = modelo.listarPersonas("");
        personas.stream().forEach(tipos -> {
            Object[] filaNueva = {tipos.getIdPersona(), tipos.getNombrePersona(),
                tipos.getApellidoPersona(), 
                String.valueOf(tipos.getEdad(tipos.getFechanacimineto())),
                 tipos.getTelefono(), tipos.getSexo(), String.valueOf(tipos.getSueldo()),
                tipos.getCupo(), tipos.getCorreo()};
            tabla.addRow(filaNueva);
        });
        vista.getT_personas().setModel(tabla);
    }
    
    private void confirmareliminacion() {

        if (JOptionPane.showConfirmDialog(null, 
                "¿Está seguro de que desea eliminar el registro seleccionado?",
                "Eliminar registro", JOptionPane.YES_NO_OPTION, 
                JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            System.out.println("si");
            try {
                idselect = vista.getT_personas().getValueAt(vista.getT_personas().getSelectedRow()
                        , 0).toString();
                modelo.eliminarperso(idselect);
                mostrartabla();
                JOptionPane.showMessageDialog(null, "ELIMINADO CORRECTAMENTE");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "¡Ningun registro seleccionado!");
            }

        } else {
            
        }

    }
    private void ingresar() {
        if (vista.getTxtnombresform().getText().isEmpty() 
                || vista.getTxtapellidosform().getText().isEmpty() 
                || vista.getTxtcedulaform().getText().isEmpty() 
                || vista.getTxttelefonoform().getText().isEmpty()
                || vista.getTxtcorreoform().getText().isEmpty() 
                || vista.getTxtsexoform().getText().isEmpty() 
                || vista.getTxtcupoform().getText().isEmpty() 
                || vista.getTxtsueldoform().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todo");
        } else {
            try {
                modelo.setNombrePersona(vista.getTxtnombresform().getText());
                modelo.setApellidoPersona(vista.getTxtapellidosform().getText());
                modelo.setIdPersona(vista.getTxtcedulaform().getText());
                Date xfec = vista.getTxtdatenaciform().getDate();
                Long d = xfec.getTime();
                java.sql.Date nac = new java.sql.Date(d);
                modelo.setFechanacimineto(nac);
                modelo.setTelefono(vista.getTxttelefonoform().getText());
                modelo.setCorreo(vista.getTxtcorreoform().getText());
                modelo.setSexo(vista.getTxtsexoform().getText());
                modelo.setCupo(vista.getTxtcupoform().getText());
                modelo.setSueldo(Double.parseDouble(vista.getTxtsueldoform().getText()));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "INGRESE LOS DATOS CORRECTOS");
            }

        }

    }
     public void abrirform( String mod){
         vista.getFormularioP().setLocation(vista.getLocation().x+594, vista.getLocation().y+55);
         vista.getFormularioP().setSize(440, 550);
         vista.getFormularioP().setVisible(true);
         if (mod.equals("CREAR")) {           
             VACIAR();
         }else{
              vista.getTxtcedulaform().setEditable(false);
              llenarPerfil();
         }       
     }
     public void salirform(){
         vista.getFormularioP().setVisible(false);     
     }
     public void llenarPerfil(){
        personas = modelo.listarPersonas(idselect);
        if (!personas.isEmpty()) {
            vista.getTxtcedulaform().setText(personas.get(0).getIdPersona());
            vista.getTxtnombresform().setText(personas.get(0).getNombrePersona());
            vista.getTxtapellidosform().setText(personas.get(0).getApellidoPersona());
            vista.getTxtdatenaciform().setDate(personas.get(0).getFechanacimineto());
            vista.getTxttelefonoform().setText(personas.get(0).getTelefono());
            vista.getTxtsexoform().setText(personas.get(0).getSexo());
            vista.getTxtsueldoform().setText("" + personas.get(0).getSueldo());
            vista.getTxtcupoform().setText("" + personas.get(0).getCupo());
            vista.getTxtcorreoform().setText(personas.get(0).getCorreo());
        }
        
    }
     public void seleccionar(){
        vista.getT_personas().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    idselect = vista.getT_personas().getValueAt(vista.getT_personas().getSelectedRow(), 0).toString();   
                }
            }
        });
    }
       public void VACIAR(){
        vista.getTxtcedulaform().setEditable(true);
        vista.getTxtcedulaform().setText("");
        vista.getTxtnombresform().setText("");
        vista.getTxtapellidosform().setText("");
        vista.getTxtdatenaciform().setDate(null);
        vista.getTxttelefonoform().setText("");
        vista.getTxtsexoform().setText("");
        vista.getTxtsueldoform().setText("");
        vista.getTxtcupoform().setText("");
        vista.getTxtcorreoform().setText("");
    }
        private void modificar() {
        if (vista.getTxtnombresform().getText().isEmpty() || vista.getTxtapellidosform().getText().isEmpty() || vista.getTxtcedulaform().getText().isEmpty() || vista.getTxttelefonoform().getText().isEmpty()
                || vista.getTxtcorreoform().getText().isEmpty() || vista.getTxtsexoform().getText().isEmpty() || vista.getTxtcupoform().getText().isEmpty() || vista.getTxtsueldoform().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todo");
        } else {
            try {
                modelo.setNombrePersona(vista.getTxtnombresform().getText());
                modelo.setApellidoPersona(vista.getTxtapellidosform().getText());
                modelo.setIdPersona(vista.getTxtcedulaform().getText());
                Date xfec = vista.getTxtdatenaciform().getDate();
                Long d = xfec.getTime();
                java.sql.Date nac = new java.sql.Date(d);
                modelo.setFechanacimineto(nac);
                System.out.println(nac.toString());
                modelo.setTelefono(vista.getTxttelefonoform().getText());
                modelo.setCorreo(vista.getTxtcorreoform().getText());
                modelo.setSexo(vista.getTxtsexoform().getText());
                modelo.setCupo(vista.getTxtcupoform().getText());
                modelo.setSueldo(Double.parseDouble(vista.getTxtsueldoform().getText()));
                modelo.updatePersona();
                mostrartabla();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "INGRESE LOS DATOS CORRECTOS");
            }

        }
         

    }
    public void printReport() {
     try {
            ConexionPG conmsql=new ConexionPG();
            Map<String, Object> map = new HashMap<>();
            int minimo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el MINIMO DEL CUPO", null));
            int maximo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el MAXIMO DEL CUPO", null));
            map.put("MAX",minimo );
            map.put("MIN",maximo);
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/PRUEBAJ.jasper"));
            JasperPrint print = JasperFillManager.fillReport(jr, map, conmsql.conectar());
            JasperViewer pv = new JasperViewer(print, false);
            pv.setVisible(true);
            pv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } catch (JRException e) {
            e.printStackTrace();
        }
} 
   public void printparametros() {
        try {
            ConexionPG conmsql=new ConexionPG();
            Map<String, Object> map = new HashMap<>();
            String titulo = (JOptionPane.showInputDialog(null, "Ingrese el titulo del reporte:", null));
            String cedula = (JOptionPane.showInputDialog(null, "Ingrese la cedula que busca:", null));
            map.put("TITULO",titulo );
            map.put("cedula",cedula);
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/reppersonar.jasper"));
            JasperPrint print = JasperFillManager.fillReport(jr, map, conmsql.conectar());
            JasperViewer pv = new JasperViewer(print, false);
            pv.setVisible(true);
            pv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } catch (JRException e) {
            e.printStackTrace();
        }
    } 
    
}
