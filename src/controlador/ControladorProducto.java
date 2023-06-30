/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

//import com.mysql.jdbc.Connection;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloPersona;
import modelo.ModeloProducto;
import modelo.Producto;
import vista.VistaPersona;
import vista.VistaProducto;

/**
 *
 * @author ariel
 */
public class ControladorProducto {
    private ModeloProducto modelo;
    private VistaProducto vista;
    private Producto metodos;
//    Connection con;
    String[] datosproductod = {"IDProducto", "Nombre", "Precio", "Categoria", "Stock", "Descripciom"};
    List<Producto> productos = new ArrayList<Producto>();
    DefaultTableModel tabla = null; 
    public  String modform;
    String idselect;
    int cod;
    public ControladorProducto(ModeloProducto modelo, VistaProducto vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        mostrarproductos(vista.getTable_pro());
        mostrartablap(vista.getTable_pro());
        seleccionar();
        validar();
        
               
    }

    public ControladorProducto() {
    }
    
    public void iniciarControlador() {
        vista.getBtnConsultar().addActionListener(l->buscarproduc());
        vista.getMOSTRART().addActionListener(l->mostrartablap(vista.getTable_pro()));
        vista.getBtnCrear().addActionListener(l->abrirform(modform = "CREAR"));
        vista.getBtnEditar().addActionListener(l->abrirform(modform = "EDITAR"));
        vista.getBotonSalir().addActionListener(l->salirform());
             vista.getBotonConfirmar().addActionListener(c -> {
            ingresar();
            if (modform == "CREAR") {
                if (modelo.crearProducto()) {
                 JOptionPane.showMessageDialog(null, "REGISTRO CORRECTO");
                 mostrartablap(vista.getTable_pro());
                 salirform();
                }else{
                   JOptionPane.showMessageDialog(null, "REGISTRO INCORRECTO"); 
                }
            } else {                
                modificarp();
                JOptionPane.showMessageDialog(null, "MODIFICADO CORRECTAMENTE"); 
            }
            ; 
        });
//        vista.getBotonConfirmar().addActionListener(l->{
//            
//             ingresar();
//             modelo.crearProducto();
//             salirform();
//        });
        
        vista.getBtEliminar().addActionListener(l->confirmareliminacion());
        
        
        
        
       
    }
    
    
    
    
    
     public void mostrarproductos(JTable t) {    
     tabla=new DefaultTableModel(null, datosproductod); 
     t.setModel(tabla);
    }
    public void mostrartablap(JTable t) {
        DefaultTableModel model = (DefaultTableModel) t.getModel();
        model.setRowCount(0);
        productos = modelo.listarProductos("");
        productos.stream().forEach(tipos -> {
            Object[] filaNueva = {tipos.getIdproducto(), tipos.getNombrepro(),
                tipos.getPreciopro(),
                tipos.getCategoriapro(), tipos.getStock(), tipos.getDescripcionpro()};
            tabla.addRow(filaNueva);
        });
        t.setModel(tabla);
    }
     private void buscarproduc() {
        if (vista.getTxtBuscar().getText().equals("")) {
         
        }else{
         
        DefaultTableModel model = (DefaultTableModel) vista.getTable_pro().getModel();
        model.setRowCount(0);
        String nompro = vista.getTxtBuscar().getText();
        System.out.println(nompro);
        productos = modelo.listarProductos(nompro);
        System.out.println(productos.toString());
        productos.stream().forEach(tipos -> {
        Object[] filaNueva = {tipos.getIdproducto(), tipos.getNombrepro()
        , tipos.getPreciopro(),tipos.getCategoriapro(),tipos.getStock(),tipos.getDescripcionpro()};
        tabla.addRow(filaNueva);
        });
        vista.getTable_pro().setModel(tabla); 
        }
    }
     public void abrirform( String mod){
         System.out.println(mod);
         vista.getFormulariopro().setLocation(vista.getLocation().x+594, vista.getLocation().y+55);
         vista.getFormulariopro().setSize(495, 650);
         vista.getFormulariopro().setVisible(true);
         if (mod.equals("CREAR")) {           
//             VACIAR();
         }else{
              llenarPerfil();
              System.out.println("llenar ");
         }       
     }
     public void salirform(){
         vista.getFormulariopro().setVisible(false);     
     }
       public void seleccionar(){
        vista.getTable_pro().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    idselect = vista.getTable_pro().getValueAt(vista.getTable_pro().getSelectedRow(), 0).toString();   
                }
            }
        });
    }
       private void ingresar() {
        if (vista.getTxtnombres().getText().isEmpty()
                || vista.getTxtprecio().getText().isEmpty()
                || vista.getTxtstock().getText().isEmpty()
                || vista.getTxtcategoria().getText().isEmpty()
                || vista.getTxtdescripcion().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todo");
        } else {
            try {
                modelo.setIdproducto(cod);
                modelo.setNombrepro(vista.getTxtnombres().getText());
                modelo.setPreciopro(Double.parseDouble(vista.getTxtprecio().getText()));
                modelo.setStock(Integer.parseInt(vista.getTxtstock().getText()));             
                modelo.setCategoriapro(vista.getTxtcategoria().getText());
                modelo.setDescripcionpro(vista.getTxtdescripcion().getText());            

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "INGRESE LOS DATOS CORRECTOS");
            }

        }

    }
         private void confirmareliminacion() {

        if (JOptionPane.showConfirmDialog(null, 
                "¿Está seguro de que desea eliminar el registro seleccionado?",
                "Eliminar registro", JOptionPane.YES_NO_OPTION, 
                JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            System.out.println("si");
            try {
                seleccionar();
                modelo.eliminarproducto(idselect);
                mostrartablap(vista.getTable_pro());
                JOptionPane.showMessageDialog(null, "ELIMINADO CORRECTAMENTE");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "¡Ningun registro seleccionado!");
            }

        } else {
            
        }

    }
         public void llenarPerfil(){
        productos = modelo.listarProductos(idselect);
        System.out.println(idselect);
        
         
        if (!productos.isEmpty()) {
            vista.getLabelcodigo().setText(""+productos.get(0).getIdproducto());
            vista.getTxtnombres().setText(productos.get(0).getNombrepro());
            vista.getTxtprecio().setText(""+productos.get(0).getPreciopro());
            vista.getTxtcategoria().setText(productos.get(0).getCategoriapro());
            vista.getTxtdescripcion().setText(productos.get(0).getDescripcionpro());
            vista.getTxtstock().setText(""+productos.get(0).getStock());
            
        }
        
    }
           private void modificarp() {
        if (vista.getTxtnombres().getText().isEmpty()
                || vista.getTxtprecio().getText().isEmpty()
                || vista.getTxtstock().getText().isEmpty()
                || vista.getTxtcategoria().getText().isEmpty()
                || vista.getTxtdescripcion().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todo");
        } else {
            try {
                modelo.setIdproducto(Integer.parseInt(vista.getLabelcodigo().getText()));
                modelo.setNombrepro(vista.getTxtnombres().getText());
                modelo.setPreciopro(Double.parseDouble(vista.getTxtprecio().getText()));
                modelo.setStock(Integer.parseInt(vista.getTxtstock().getText()));             
                modelo.setCategoriapro(vista.getTxtcategoria().getText());
                modelo.setDescripcionpro(vista.getTxtdescripcion().getText());  
                modelo.updateProducto();
                mostrartablap(vista.getTable_pro());
                salirform();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "INGRESE LOS DATOS CORRECTOS");
            }

        }
         

    }
             
    public void validar() {
//        
        vista.getTxtnombres().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras(vista.getTxtnombres(), 25);
            }
        });
         vista.getTxtcategoria().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras_espacios(vista.getTxtcategoria(), 20);
            }
        });
          vista.getTxtdescripcion().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras_espaciosTEXTAREA(vista.getTxtdescripcion(), 100);
            }
        });
        vista.getTxtstock().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.numero(vista.getTxtstock(), 3);
            }
        });
//        vista.getTxtcupoform().addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                Validar.numero(vista.getTxtcupoform(), 3);
//            }
//        });
        vista.getTxtprecio().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.dinero(vista.getTxtprecio(), 4);
            }
        });
//        
//        vista.getTxttelefonoform().addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                Validar.numero(vista.getTxttelefonoform(), 10);
//            }
//        });
//        
//        vista.getTxtsexoform().addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                Validar.letras(vista.getTxtsexoform(), 9);
//            }
//        });

    }
    
    
}
