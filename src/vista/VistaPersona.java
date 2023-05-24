
package vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaPersona extends javax.swing.JFrame {

    public VistaPersona() {
        initComponents();
    }

    public JButton getBtnConsultar() {
        return btnConsultar;
    }

    public void setBtnConsultar(JButton btnConsultar) {
        this.btnConsultar = btnConsultar;
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public void setBtnCrear(JButton btnCrear) {
        this.btnCrear = btnCrear;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }

    public JButton getBtnRemover() {
        return btEliminar;
    }

    public void setBtnRemover(JButton btnRemover) {
        this.btEliminar = btnRemover;
    }

    public JTable getT_personas() {
        return t_personas;
    }

    public void setT_personas(JTable t_personas) {
        this.t_personas = t_personas;
    }

    
    public JLabel getLblPersonas() {
        return lblPersonas;
    }

    public void setLblPersonas(JLabel lblPersonas) {
        this.lblPersonas = lblPersonas;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JButton getMOSTRART() {
        return MOSTRART;
    }

    public void setMOSTRART(JButton MOSTRART) {
        this.MOSTRART = MOSTRART;
    }

    public JTextField getTxtapellidos() {
        return txtapellidos;
    }

    public void setTxtapellidos(JTextField txtapellidos) {
        this.txtapellidos = txtapellidos;
    }

    public JTextField getTxtcedula() {
        return txtcedula;
    }

    public void setTxtcedula(JTextField txtcedula) {
        this.txtcedula = txtcedula;
    }

    public JTextField getTxtcupo() {
        return txtcupo;
    }

    public void setTxtcupo(JTextField txtcupo) {
        this.txtcupo = txtcupo;
    }

    public JDateChooser getTxtdatenaci() {
        return txtdatenaci;
    }

    public void setTxtdatenaci(JDateChooser txtdatenaci) {
        this.txtdatenaci = txtdatenaci;
    }

    public JTextField getTxtnombres() {
        return txtnombres;
    }

    public void setTxtnombres(JTextField txtnombres) {
        this.txtnombres = txtnombres;
    }

    public JTextField getTxtsexo() {
        return txtsexo;
    }

    public void setTxtsexo(JTextField txtsexo) {
        this.txtsexo = txtsexo;
    }

    public JTextField getTxttelefono() {
        return txttelefono;
    }

    public void setTxttelefono(JTextField txttelefono) {
        this.txttelefono = txttelefono;
    }

    public JTextField getTxtcorreo() {
        return txtcorreo;
    }

    public void setTxtcorreo(JTextField txtcorreo) {
        this.txtcorreo = txtcorreo;
    }

    public JTextField getTxtsueldo() {
        return txtsueldo;
    }

    public void setTxtsueldo(JTextField txtsueldo) {
        this.txtsueldo = txtsueldo;
    }

    public JButton getBotonregistrar() {
        return botonregistrar;
    }

    public void setBotonregistrar(JButton botonregistrar) {
        this.botonregistrar = botonregistrar;
    }

    public JDialog getFormularioP() {
        return FormularioP;
    }

    public void setFormularioP(JDialog FormularioP) {
        this.FormularioP = FormularioP;
    }

    public JPanel getPvacio() {
        return pvacio;
    }

    public JButton getBotonConfirmar() {
        return botonConfirmar;
    }

    public JTextField getTxtapellidosform() {
        return txtapellidosform;
    }

    public JTextField getTxtcedulaform() {
        return txtcedulaform;
    }

    public JTextField getTxtcorreoform() {
        return txtcorreoform;
    }

    public JTextField getTxtcupoform() {
        return txtcupoform;
    }

    public JDateChooser getTxtdatenaciform() {
        return txtdatenaciform;
    }

    public JTextField getTxtnombresform() {
        return txtnombresform;
    }

    public JTextField getTxtsexoform() {
        return txtsexoform;
    }

    public JTextField getTxtsueldoform() {
        return txtsueldoform;
    }

    public JTextField getTxttelefonoform() {
        return txttelefonoform;
    }
    public JDateChooser gettxtxtdatenaciform() {
        return txtdatenaciform;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }
    
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormularioP = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        txtnombresform = new javax.swing.JTextField();
        txtapellidosform = new javax.swing.JTextField();
        txtcedulaform = new javax.swing.JTextField();
        txttelefonoform = new javax.swing.JTextField();
        txtsexoform = new javax.swing.JTextField();
        txtdatenaciform = new com.toedter.calendar.JDateChooser();
        txtcupoform = new javax.swing.JTextField();
        txtcorreoform = new javax.swing.JTextField();
        txtsueldoform = new javax.swing.JTextField();
        botonConfirmar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        MOSTRART = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblPersonas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_personas = new javax.swing.JTable();
        pvacio = new javax.swing.JPanel();
        botonregistrar = new javax.swing.JButton();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtsexo = new javax.swing.JTextField();
        txtdatenaci = new com.toedter.calendar.JDateChooser();
        txtcupo = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtsueldo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jPanel10.setBackground(new java.awt.Color(0, 204, 204));

        btnSalir.setBackground(new java.awt.Color(0, 204, 51));
        btnSalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtnombresform.setBackground(new java.awt.Color(51, 102, 255));
        txtnombresform.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtnombresform.setForeground(new java.awt.Color(255, 255, 255));
        txtnombresform.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Nombres:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtnombresform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombresformActionPerformed(evt);
            }
        });

        txtapellidosform.setBackground(new java.awt.Color(51, 102, 255));
        txtapellidosform.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtapellidosform.setForeground(new java.awt.Color(255, 255, 255));
        txtapellidosform.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Apellidos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtapellidosform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidosformActionPerformed(evt);
            }
        });

        txtcedulaform.setBackground(new java.awt.Color(51, 102, 255));
        txtcedulaform.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtcedulaform.setForeground(new java.awt.Color(255, 255, 255));
        txtcedulaform.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Cedula:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtcedulaform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaformActionPerformed(evt);
            }
        });

        txttelefonoform.setBackground(new java.awt.Color(51, 102, 255));
        txttelefonoform.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txttelefonoform.setForeground(new java.awt.Color(255, 255, 255));
        txttelefonoform.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Telefono:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txttelefonoform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoformActionPerformed(evt);
            }
        });

        txtsexoform.setBackground(new java.awt.Color(51, 102, 255));
        txtsexoform.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtsexoform.setForeground(new java.awt.Color(255, 255, 255));
        txtsexoform.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Sexo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtsexoform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsexoformActionPerformed(evt);
            }
        });

        txtdatenaciform.setBackground(new java.awt.Color(51, 51, 255));
        txtdatenaciform.setForeground(new java.awt.Color(51, 102, 255));
        txtdatenaciform.setDateFormatString("yyyy-MM-dd");

        txtcupoform.setBackground(new java.awt.Color(51, 102, 255));
        txtcupoform.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtcupoform.setForeground(new java.awt.Color(255, 255, 255));
        txtcupoform.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Cupo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtcupoform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcupoformActionPerformed(evt);
            }
        });

        txtcorreoform.setBackground(new java.awt.Color(51, 102, 255));
        txtcorreoform.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtcorreoform.setForeground(new java.awt.Color(255, 255, 255));
        txtcorreoform.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Correo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtcorreoform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoformActionPerformed(evt);
            }
        });

        txtsueldoform.setBackground(new java.awt.Color(51, 102, 255));
        txtsueldoform.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtsueldoform.setForeground(new java.awt.Color(255, 255, 255));
        txtsueldoform.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Sueldo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtsueldoform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsueldoformActionPerformed(evt);
            }
        });

        botonConfirmar.setBackground(new java.awt.Color(0, 204, 51));
        botonConfirmar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botonConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        botonConfirmar.setText("CONFIRMAR");
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcedulaform)
                    .addComponent(txtnombresform)
                    .addComponent(txtapellidosform)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txttelefonoform, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcorreoform, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtdatenaciform, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(botonConfirmar)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsexoform)
                            .addComponent(txtcupoform)
                            .addComponent(txtsueldoform)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 49, Short.MAX_VALUE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtnombresform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtapellidosform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtcedulaform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefonoform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsexoform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreoform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcupoform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsueldoform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdatenaciform, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout FormularioPLayout = new javax.swing.GroupLayout(FormularioP.getContentPane());
        FormularioP.getContentPane().setLayout(FormularioPLayout);
        FormularioPLayout.setHorizontalGroup(
            FormularioPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioPLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FormularioPLayout.setVerticalGroup(
            FormularioPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        btnConsultar.setText("BUSCAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnCrear.setText("CREAR");

        btEliminar.setText("REMOVER");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnImprimir.setText("IMPRIMIR");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        MOSTRART.setText("RECARGAR TABLA");
        MOSTRART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnConsultar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCrear)
                        .addGap(18, 18, 18)
                        .addComponent(btEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprimir)
                        .addGap(18, 18, 18)
                        .addComponent(MOSTRART)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btEliminar)
                    .addComponent(btnEditar)
                    .addComponent(btnImprimir)
                    .addComponent(MOSTRART))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtBuscar.getAccessibleContext().setAccessibleName("");

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));

        lblPersonas.setBackground(new java.awt.Color(51, 51, 255));
        lblPersonas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPersonas.setForeground(new java.awt.Color(255, 255, 255));
        lblPersonas.setText("Personas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        t_personas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        t_personas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(t_personas);

        pvacio.setBackground(new java.awt.Color(0, 204, 204));

        botonregistrar.setBackground(new java.awt.Color(0, 204, 51));
        botonregistrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botonregistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonregistrar.setText("REGISTRAR");
        botonregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregistrarActionPerformed(evt);
            }
        });

        txtnombres.setBackground(new java.awt.Color(51, 102, 255));
        txtnombres.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtnombres.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Nombres:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombresActionPerformed(evt);
            }
        });

        txtapellidos.setBackground(new java.awt.Color(51, 102, 255));
        txtapellidos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtapellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Apellidos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidosActionPerformed(evt);
            }
        });

        txtcedula.setBackground(new java.awt.Color(51, 102, 255));
        txtcedula.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtcedula.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Cedula:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });

        txttelefono.setBackground(new java.awt.Color(51, 102, 255));
        txttelefono.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txttelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Telefono:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        txtsexo.setBackground(new java.awt.Color(51, 102, 255));
        txtsexo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtsexo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Sexo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsexoActionPerformed(evt);
            }
        });

        txtdatenaci.setBackground(new java.awt.Color(51, 51, 255));
        txtdatenaci.setForeground(new java.awt.Color(51, 102, 255));
        txtdatenaci.setDateFormatString("yyyy-MM-dd");

        txtcupo.setBackground(new java.awt.Color(51, 102, 255));
        txtcupo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtcupo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Cupo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtcupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcupoActionPerformed(evt);
            }
        });

        txtcorreo.setBackground(new java.awt.Color(51, 102, 255));
        txtcorreo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtcorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Correo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        txtsueldo.setBackground(new java.awt.Color(51, 102, 255));
        txtsueldo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtsueldo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Sueldo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        txtsueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsueldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pvacioLayout = new javax.swing.GroupLayout(pvacio);
        pvacio.setLayout(pvacioLayout);
        pvacioLayout.setHorizontalGroup(
            pvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pvacioLayout.createSequentialGroup()
                .addGroup(pvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pvacioLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(botonregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pvacioLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcedula)
                            .addComponent(txtnombres)
                            .addComponent(txtapellidos)
                            .addGroup(pvacioLayout.createSequentialGroup()
                                .addGroup(pvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdatenaci, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsexo)
                                    .addComponent(txtcupo, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(txtsueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pvacioLayout.setVerticalGroup(
            pvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pvacioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(pvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(pvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(pvacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdatenaci, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(botonregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 0, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRO DE PERSONAS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(90, 90, 90))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pvacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(pvacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void MOSTRARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MOSTRARTActionPerformed

    private void botonregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonregistrarActionPerformed

    private void txtnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombresActionPerformed

    private void txtapellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidosActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsexoActionPerformed

    private void txtcupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcupoActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtsueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsueldoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtnombresformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombresformActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombresformActionPerformed

    private void txtapellidosformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidosformActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidosformActionPerformed

    private void txtcedulaformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaformActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaformActionPerformed

    private void txttelefonoformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoformActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoformActionPerformed

    private void txtsexoformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsexoformActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsexoformActionPerformed

    private void txtcupoformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcupoformActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcupoformActionPerformed

    private void txtcorreoformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoformActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoformActionPerformed

    private void txtsueldoformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsueldoformActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsueldoformActionPerformed

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog FormularioP;
    private javax.swing.JButton MOSTRART;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JButton botonregistrar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPersonas;
    private javax.swing.JPanel pvacio;
    private javax.swing.JTable t_personas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtapellidosform;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcedulaform;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcorreoform;
    private javax.swing.JTextField txtcupo;
    private javax.swing.JTextField txtcupoform;
    private com.toedter.calendar.JDateChooser txtdatenaci;
    private com.toedter.calendar.JDateChooser txtdatenaciform;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtnombresform;
    private javax.swing.JTextField txtsexo;
    private javax.swing.JTextField txtsexoform;
    private javax.swing.JTextField txtsueldo;
    private javax.swing.JTextField txtsueldoform;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttelefonoform;
    // End of variables declaration//GEN-END:variables
}
