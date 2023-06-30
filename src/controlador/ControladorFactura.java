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
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Detalles;
import modelo.Encabezado;
import modelo.ModeloDetalle;
import modelo.ModeloEncabezado;
import modelo.ModeloPersona;
import modelo.ModeloProducto;
import modelo.Persona;
import modelo.Producto;
import vista.VistaProducto;
import vista.Vistafactura;

/**
 *
 * @author ariel
 */
public class ControladorFactura {
    private ModeloEncabezado modeloenca;
    private ModeloDetalle modelodeta;
    private Vistafactura vista;
    private ControladorProducto metpro;
    private ModeloProducto modelo2;
    private ModeloDetalle modelo3;
    private ModeloPersona modperso;

    public ControladorFactura(ModeloEncabezado modeloenca, ModeloDetalle modelodeta, Vistafactura vista, ControladorProducto metpro, ModeloProducto modelo2, ModeloDetalle modelo3, ModeloPersona modperso) {
        this.modeloenca = modeloenca;
        this.modelodeta = modelodeta;
        this.vista = vista;
        this.metpro = metpro;
        this.modelo2 = modelo2;
        this.modelo3 = modelo3;
        this.modperso = modperso;
        vista.setVisible(true);
        mostrardetalles(vista.getT_detalles());
        tabla3 = new DefaultTableModel(null, datosdetalle); 
        fechahoy();
        numfactu();
        MostrarDetalle(vista.getTable_enca());
        validar();
        
        
    }

    

   
//    Connection con;
    String[] datosproductod = {"IDProducto", "Nombre", "Precio", "Stock", "Categoria", "Descripcion"};
    String[] datosdetalle = {"IDProducto", "Nombre", "Precio", "Cantidad", "Total"};
    String[] datosencabe={"NUMERO FACTURA", "Cedula", "Feccha","Total"};
    String[] datodet={"Codigo detalle", "Codigo producto", "Numero de gactura","Subtotal","Cantidad"};

    List<Producto> productosf = new ArrayList<Producto>();
    List<Persona> listperso = new ArrayList<Persona>();
    List<Encabezado> listencab = new ArrayList<Encabezado>();
     List<Detalles> listadeta = new ArrayList<Detalles>();
    DefaultTableModel tabla; //paraelegiritem
    DefaultTableModel tabla2;//paradetalles 
    DefaultTableModel tabla3;//paradetalles 
    DefaultTableModel tabla4;//paradetalles 
    List<Integer> listaidpro = new ArrayList<>();
    public String modform;
    String idselect;
    int cod;
    int cod2=0;
    int countenca=0;
    
    Double total = 0.0;

    
      public void iniciarControlador() {
      vista.getAbrirlistadoprod().addActionListener(l->visualizarProductos(""));
      vista.getBuscarclie().addActionListener(l->buscarperso());
      vista.getAnadirdeta().addActionListener(l->seleccionaritem(vista.getT_prodelegir()));
      vista.getBotonCrearfac().addActionListener(l->crearfactura());
      vista.getSalirdetalle().addActionListener(l->salirproduct());
      vista.getBotonSalir().addActionListener(l->salirdefactura());
      vista.getBtnbuscarfac().addActionListener(l->visualizarFacturas());
     // eliminarencabez/////
      vista.getBtnEliminarfacr().addActionListener(l->eliminarencabez());
      vista.getSalirbusfacts().addActionListener(l->salirdebuscarfactura());
    }
    
     public void mostrardetalles(JTable t) {    
     tabla2=new DefaultTableModel(null, datosdetalle); 
     t.setModel(tabla2);
    }
    public void visualizarProductos(String idpro) {
        vista.getBuscadorprod().setLocation(vista.getLocation().x + 594, vista.getLocation().y + 55);
        vista.getBuscadorprod().setSize(495, 400);
        vista.getBuscadorprod().setVisible(true);
        metpro.mostrarproductos(vista.getT_prodelegir());
        tabla2 = new DefaultTableModel(null, datosproductod);
        productosf = modelo2.listarProductos(idpro);
        productosf.stream().forEach(p -> tabla2.addRow(new Object[]{p.getIdproducto(), p.getNombrepro(), p.getPreciopro(),
        p.getStock(), p.getCategoriapro(), p.getDescripcionpro()}));
        vista.getT_prodelegir().setModel(tabla2);
        vista.getT_prodelegir().setRowHeight(30);
    }
    public void buscarperso() {
        if (vista.getTxtcedcli().getText().isEmpty()) {
            
        } else {
            String ced = vista.getTxtcedcli().getText();
            listperso = modperso.listarPersonas(ced);
            if (!listperso.isEmpty()) {
                vista.getTxtnombres().setText(listperso.get(0).getNombrePersona() + " " + listperso.get(0).getApellidoPersona());
                vista.getTxttelefono().setText(listperso.get(0).getTelefono());
                vista.getTxtcorreo().setText(listperso.get(0).getCorreo());

            }else{
              JOptionPane.showMessageDialog(null, "No se encuentra registrado");   
            }

        }

    }

    public void seleccionaritem(JTable t) {
        boolean ingresa = true;
        int filat = vista.getT_detalles().getRowCount();
        String id_pro1 = t.getValueAt(t.getSelectedRow(), 0).toString();
        for (int i = 0; i < filat; i++) {
            String compara = vista.getT_detalles().getValueAt(i, 0).toString();
            System.out.println("" + id_pro1 + "=" + compara + "");
            if (compara.equals(id_pro1)) {
                ingresa = false;
                i = filat;
            } else {
                ingresa = true;

            }

        }
        System.out.println(ingresa);
        if (ingresa) {
            try {

                String id_pro = t.getValueAt(t.getSelectedRow(), 0).toString();
                listaidpro.add(Integer.valueOf(id_pro));
                String nombre_pro = t.getValueAt(t.getSelectedRow(), 1).toString();
                double precio_pro = Double.parseDouble(t.getValueAt(t.getSelectedRow(), 2).toString());
                int existencias = Integer.parseInt(t.getValueAt(t.getSelectedRow(), 3).toString());
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad:", 1));
                if (cantidad > 0 && cantidad <= existencias) {
                    Object detalle[] = {id_pro, nombre_pro, precio_pro, cantidad, precio_pro * cantidad};
                    tabla3.addRow(detalle);
                    vista.getT_detalles().setModel(tabla3);
                    total = total + precio_pro * cantidad;
                    vista.getSumadetalles().setText(String.valueOf(total));

                }
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un nuevo item");
        }

    }

    public void crearfactura() {
        ///crear encabezado
        if (vista.getTxtcedcli().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cliente no se encuentra ingresado");
        }
        if (vista.getT_detalles().getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese productos");
        }
        if (vista.getT_detalles().getRowCount() == 0 || vista.getTxtnombres().getText().isEmpty()) {

        } else {
            try {
                modeloenca.setIdpersona(vista.getTxtcedcli().getText());
                LocalDate localDate = LocalDate.now();
                Date dates = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
                Long d = dates.getTime();
                java.sql.Date nac = new java.sql.Date(d);
                System.out.println(nac);
                modeloenca.setFechafac(nac);
                modeloenca.setTotal(Double.parseDouble(vista.getSumadetalles().getText()));
                modeloenca.setEstado("ACTIVO");
                if (modeloenca.crearFacturaenca()) {
                    JOptionPane.showMessageDialog(null, "Factura creada exitosamente");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "INGRESE LOS DATOS CORRECTOS");
            }

        }
        ///////creardetalles
        int fila = vista.getT_detalles().getRowCount();
        for (int i = 0; i < fila; i++) {
            modelodeta.setEncabezado_id(Integer.parseInt(vista.getNumfact().getText()));
            modelodeta.setCodigoproducto(Integer.parseInt(vista.getT_detalles().getValueAt(i, 0).toString())); ///////CODIGO PRODUCTO
            modelodeta.setSubtotalpro(Double.parseDouble(vista.getT_detalles().getValueAt(i, 4).toString()));//subtotal
            modelodeta.setCantidad(Integer.parseInt(vista.getT_detalles().getValueAt(i, 3).toString()));//subtotal  
            modelodeta.crearFacturadetalles();

            vista.getBuscadorprod().setVisible(false);

        }

    }

    private void numfactu() {
        countenca = modeloenca.contadorencabe() + 1;
        vista.getNumfact().setText(String.valueOf(countenca));
    }

    public void fechahoy() {
        LocalDate fechahoy = LocalDate.now();
        vista.getLabelfechafac().setText(fechahoy.toString());

    }

    public void salirproduct() {
        vista.getBuscadorprod().setVisible(false);

    }

    public void salirdefactura() {
        vista.setVisible(false);

    }

    public void salirdebuscarfactura() {
        vista.getBuscadorFact().setVisible(false);

    }

    public void visualizarFacturas() {
        vista.getBuscadorFact().setLocation(vista.getLocation().x + 620, vista.getLocation().y + 100);
        vista.getBuscadorFact().setSize(600, 650);
        vista.getBuscadorFact().setVisible(true);
        visualizarencabezados();

    }

    public void visualizarencabezados() {
        tabla4 = new DefaultTableModel(null, datosencabe);
        listencab = modeloenca.listaEncabezados();
        listencab.stream().forEach(p -> tabla4.addRow(new Object[]{p.getCodigoenca(), p.getIdpersona(), p.getFechafac(),
            p.getTotal()}));
        vista.getTable_enca().setModel(tabla4);
        vista.getTable_enca().setRowHeight(25);
    }

    ////////////////////////////////////
    public void MostrarDetalle(JTable t) {
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    cod = Integer.parseInt(vista.getTable_enca().getValueAt(vista.getTable_enca().getSelectedRow(), 0).toString());
                    tabla4 = new DefaultTableModel(null, datodet);
                    listadeta = modelodeta.listarDETALLES(cod);
                    listadeta.stream().forEach(p -> tabla4.addRow(new Object[]{p.getIddetalle(), p.getCodigoproducto(), p.getEncabezado_id(), p.getSubtotalpro(), p.getCantidad()}));
                    vista.getTabel_detas().setModel(tabla4);
                    vista.getTabel_detas().setRowHeight(25);

                }
            }
        });
    }

    public void eliminarencabez() {
        ////////////////////////////
        if (JOptionPane.showConfirmDialog(null,
                "¿Está seguro de que desea eliminar el registro seleccionado?",
                "Eliminar registro", JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            System.out.println("si");
            try {
                cod2 = Integer.parseInt(vista.getTable_enca().getValueAt(vista.getTable_enca().getSelectedRow(), 0).toString());
                if (cod2 == 0) {
                    JOptionPane.showMessageDialog(null, "Selecciones un factura a eliminar");
                } else {

                    modeloenca.eliminarperso(cod);
                    visualizarencabezados();
                }
                cod2 = 0;
                JOptionPane.showMessageDialog(null, "ELIMINADO CORRECTAMENTE");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "¡Ningun registro seleccionado!");
            }

        } else {

        }

    }

    public void validar() {

        vista.getTxtcedcli().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.numero(vista.getTxtcedcli(), 10);
            }
        });

    }
//   public void printReport() {
//    try {
//        String reportPath = "path/to/report.jasper";
//        JasperPrint print = JasperFillManager.fillReport(reportPath, new HashMap<>(), getDatabaseConnection());
//        JasperPrintManager.printReport(print, true);
//    } catch (JRException e) {
//        e.printStackTrace();
//    }
//} 

}
