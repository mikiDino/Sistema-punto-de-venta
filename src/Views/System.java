/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Library.Objects;
import ViewModels.ClientesVM;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Miguel
 */
public class System extends javax.swing.JFrame {
    private ImageIcon logo;
    private Icon icono;
    /**
     * Creates new form System
     */
    public System() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        ajustarImagenLabel(this.LabelIcon, "src/Resources/logo.jpg");
        ajustarImagenIcono(this.BtnRegistroCliente, "src/Resources/registroCliente.png");
        ajustarImagenIcono(this.BtnCliente_Agregar, "src/Resources/btnAgregar.png");
        ajustarImagenIcono(this.BtnCliente_Cancelar, "src/Resources/btnEliminar.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TabbedPanePrincipal = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FieldBuscarCliente = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPaneCliente = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        LabelCliente_Nombre = new javax.swing.JLabel();
        FieldCliente_Nombre = new javax.swing.JTextField();
        FieldCliente_CI_NIT = new javax.swing.JTextField();
        LabelCliente_CI_NIT = new javax.swing.JLabel();
        FieldCliente_Apellidos = new javax.swing.JTextField();
        LabelCliente_Apellidos = new javax.swing.JLabel();
        LabelCliente_Email = new javax.swing.JLabel();
        FieldCliente_Email = new javax.swing.JTextField();
        LabelCliente_Telefono_Celular = new javax.swing.JLabel();
        FieldCliente_Telefono_Celular = new javax.swing.JTextField();
        LabelCliente_Direccion = new javax.swing.JLabel();
        FieldCliente_Direccion = new javax.swing.JTextField();
        BtnCliente_Cancelar = new javax.swing.JButton();
        BtnCliente_Agregar = new javax.swing.JButton();
        LabelIcon = new javax.swing.JLabel();
        LabelFondoCliente = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        BtnRegistroCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(8, 193, 149));
        jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Punto De Venta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        TabbedPanePrincipal.setBackground(new java.awt.Color(255, 255, 255));
        TabbedPanePrincipal.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1313, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        TabbedPanePrincipal.addTab("ventas", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(70, 106, 124));
        jLabel2.setText("Clientes");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(70, 106, 124));
        jLabel3.setText("Buscar");

        FieldBuscarCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(142, 142, 142)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FieldBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(763, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(FieldBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTabbedPaneCliente.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPaneCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(70, 106, 124));
        jLabel4.setText("Informacion del Cliente");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 7, -1, -1));

        LabelCliente_Nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelCliente_Nombre.setForeground(new java.awt.Color(70, 106, 124));
        LabelCliente_Nombre.setText("Nombre");
        jPanel6.add(LabelCliente_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 152, -1, -1));

        FieldCliente_Nombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        FieldCliente_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCliente_NombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldCliente_NombreKeyTyped(evt);
            }
        });
        jPanel6.add(FieldCliente_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 177, 163, -1));

        FieldCliente_CI_NIT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        FieldCliente_CI_NIT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCliente_CI_NITKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldCliente_CI_NITKeyTyped(evt);
            }
        });
        jPanel6.add(FieldCliente_CI_NIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 177, 163, -1));

        LabelCliente_CI_NIT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelCliente_CI_NIT.setForeground(new java.awt.Color(70, 106, 124));
        LabelCliente_CI_NIT.setText("Ci / NIT");
        jPanel6.add(LabelCliente_CI_NIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 152, -1, -1));

        FieldCliente_Apellidos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        FieldCliente_Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCliente_ApellidosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldCliente_ApellidosKeyTyped(evt);
            }
        });
        jPanel6.add(FieldCliente_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 235, 163, -1));

        LabelCliente_Apellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelCliente_Apellidos.setForeground(new java.awt.Color(70, 106, 124));
        LabelCliente_Apellidos.setText("Apellidos");
        jPanel6.add(LabelCliente_Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 210, -1, -1));

        LabelCliente_Email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelCliente_Email.setForeground(new java.awt.Color(70, 106, 124));
        LabelCliente_Email.setText("Email");
        jPanel6.add(LabelCliente_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 210, -1, -1));

        FieldCliente_Email.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        FieldCliente_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCliente_EmailKeyReleased(evt);
            }
        });
        jPanel6.add(FieldCliente_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 235, 163, -1));

        LabelCliente_Telefono_Celular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelCliente_Telefono_Celular.setForeground(new java.awt.Color(70, 106, 124));
        LabelCliente_Telefono_Celular.setText("Telefono / Celular");
        jPanel6.add(LabelCliente_Telefono_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 268, -1, -1));

        FieldCliente_Telefono_Celular.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        FieldCliente_Telefono_Celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCliente_Telefono_CelularKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldCliente_Telefono_CelularKeyTyped(evt);
            }
        });
        jPanel6.add(FieldCliente_Telefono_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 293, 163, -1));

        LabelCliente_Direccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelCliente_Direccion.setForeground(new java.awt.Color(70, 106, 124));
        LabelCliente_Direccion.setText("Direccion");
        jPanel6.add(LabelCliente_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 268, -1, -1));

        FieldCliente_Direccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        FieldCliente_Direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCliente_DireccionKeyReleased(evt);
            }
        });
        jPanel6.add(FieldCliente_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 293, 163, -1));

        BtnCliente_Cancelar.setBackground(new java.awt.Color(204, 255, 255));
        BtnCliente_Cancelar.setForeground(new java.awt.Color(70, 60, 126));
        BtnCliente_Cancelar.setBorder(null);
        BtnCliente_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCliente_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCliente_CancelarActionPerformed(evt);
            }
        });
        jPanel6.add(BtnCliente_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 326, 76, 51));

        BtnCliente_Agregar.setBackground(new java.awt.Color(204, 255, 255));
        BtnCliente_Agregar.setForeground(new java.awt.Color(70, 60, 126));
        BtnCliente_Agregar.setBorder(null);
        BtnCliente_Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCliente_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCliente_AgregarActionPerformed(evt);
            }
        });
        jPanel6.add(BtnCliente_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 326, 76, 51));

        LabelIcon.setBackground(new java.awt.Color(204, 255, 255));
        LabelIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(LabelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 37, 203, 109));

        LabelFondoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/fondoCliente.jpg"))); // NOI18N
        jPanel6.add(LabelFondoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 370, 430));

        jTabbedPaneCliente.addTab("Clientes", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPaneCliente.addTab("Pagos", jPanel7);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneCliente)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneCliente)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 854, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabbedPanePrincipal.addTab("clientes", jPanel3);

        BtnRegistroCliente.setBackground(new java.awt.Color(204, 255, 255));
        BtnRegistroCliente.setForeground(new java.awt.Color(70, 60, 126));
        BtnRegistroCliente.setBorder(null);
        BtnRegistroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistroClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(TabbedPanePrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(BtnRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabbedPanePrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private ClientesVM cliente;
    private void BtnRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistroClienteActionPerformed
        ArrayList<JLabel> label = new ArrayList();
        label.add(LabelCliente_Nombre);
        label.add(LabelCliente_CI_NIT);
        label.add(LabelCliente_Apellidos);
        label.add(LabelCliente_Email);
        label.add(LabelCliente_Telefono_Celular);
        label.add(LabelCliente_Direccion);
        
        ArrayList<JTextField> textField = new ArrayList();
        textField.add(FieldCliente_Nombre);
        textField.add(FieldCliente_CI_NIT);
        textField.add(FieldCliente_Apellidos);
        textField.add(FieldCliente_Email);
        textField.add(FieldCliente_Telefono_Celular);
        textField.add(FieldCliente_Direccion);
        
        Object[] listaObjects = {};
        cliente = new ClientesVM(listaObjects, label, textField); 
        
        TabbedPanePrincipal.setSelectedIndex(1);//1 es la la posicion de los tabbed's 
    }//GEN-LAST:event_BtnRegistroClienteActionPerformed

    private void BtnCliente_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCliente_AgregarActionPerformed
        cliente.RegistrarCliente();
    }//GEN-LAST:event_BtnCliente_AgregarActionPerformed

    private void BtnCliente_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCliente_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCliente_CancelarActionPerformed

    private void FieldCliente_NombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCliente_NombreKeyReleased
        if(FieldCliente_Nombre.getText().equals("")) {
            LabelCliente_Nombre.setForeground(new Color(70, 106, 124));
        }else{
            LabelCliente_Nombre.setText("Nombre");
            LabelCliente_Nombre.setForeground(new Color(0, 153, 51)); 
        }
    }//GEN-LAST:event_FieldCliente_NombreKeyReleased

    private void FieldCliente_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCliente_NombreKeyTyped
        Objects.events.textKeyPress(evt);
    }//GEN-LAST:event_FieldCliente_NombreKeyTyped

    private void FieldCliente_CI_NITKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCliente_CI_NITKeyReleased
        if(FieldCliente_CI_NIT.getText().equals("")) {
            LabelCliente_CI_NIT.setForeground(new Color(70, 106, 124));
        }else{
            LabelCliente_CI_NIT.setText("CI / NIT");
            LabelCliente_CI_NIT.setForeground(new Color(0, 153, 51)); 
        }
    }//GEN-LAST:event_FieldCliente_CI_NITKeyReleased

    private void FieldCliente_CI_NITKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCliente_CI_NITKeyTyped
        Objects.events.numberKeyPress(evt);
    }//GEN-LAST:event_FieldCliente_CI_NITKeyTyped

    private void FieldCliente_ApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCliente_ApellidosKeyReleased
        if(FieldCliente_Apellidos.getText().equals("")) {
            LabelCliente_Apellidos.setForeground(new Color(70, 106, 124));
        }else{
            LabelCliente_Apellidos.setText("Apellidos");
            LabelCliente_Apellidos.setForeground(new Color(0, 153, 51)); 
        }
    }//GEN-LAST:event_FieldCliente_ApellidosKeyReleased

    private void FieldCliente_ApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCliente_ApellidosKeyTyped
        Objects.events.textKeyPress(evt);
    }//GEN-LAST:event_FieldCliente_ApellidosKeyTyped

    private void FieldCliente_EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCliente_EmailKeyReleased
        if(FieldCliente_Email.getText().equals("")) {
            LabelCliente_Email.setForeground(new Color(70, 106, 124));
        }else{
            LabelCliente_Email.setText("Email");
            LabelCliente_Email.setForeground(new Color(0, 153, 51)); 
        }
    }//GEN-LAST:event_FieldCliente_EmailKeyReleased

    private void FieldCliente_Telefono_CelularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCliente_Telefono_CelularKeyReleased
        if(FieldCliente_Telefono_Celular.getText().equals("")) {
            LabelCliente_Telefono_Celular.setForeground(new Color(70, 106, 124));
        }else{
            LabelCliente_Telefono_Celular.setText("Telefono/Celular");
            LabelCliente_Telefono_Celular.setForeground(new Color(0, 153, 51)); 
        }
    }//GEN-LAST:event_FieldCliente_Telefono_CelularKeyReleased

    private void FieldCliente_Telefono_CelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCliente_Telefono_CelularKeyTyped
        Objects.events.numberKeyPress(evt);
    }//GEN-LAST:event_FieldCliente_Telefono_CelularKeyTyped

    private void FieldCliente_DireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCliente_DireccionKeyReleased
        if(FieldCliente_Direccion.getText().equals("")) {
            LabelCliente_Direccion.setForeground(new Color(70, 106, 124));
        }else{
            LabelCliente_Direccion.setText("Direccion");
            LabelCliente_Direccion.setForeground(new Color(0, 153, 51)); 
        }
    }//GEN-LAST:event_FieldCliente_DireccionKeyReleased
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new System().setVisible(true);
            }
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Action Event"> 
    private void ajustarImagenLabel(JLabel lbl, String ruta){
        this.logo = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.logo.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
        lbl.setIcon(this.icono);
        this.repaint();
    }
      private void ajustarImagenIcono(JButton btn, String ruta){
        this.logo = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.logo.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH));
        btn.setIcon(this.icono);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCliente_Agregar;
    private javax.swing.JButton BtnCliente_Cancelar;
    private javax.swing.JButton BtnRegistroCliente;
    private javax.swing.JTextField FieldBuscarCliente;
    private javax.swing.JTextField FieldCliente_Apellidos;
    private javax.swing.JTextField FieldCliente_CI_NIT;
    private javax.swing.JTextField FieldCliente_Direccion;
    private javax.swing.JTextField FieldCliente_Email;
    private javax.swing.JTextField FieldCliente_Nombre;
    private javax.swing.JTextField FieldCliente_Telefono_Celular;
    private javax.swing.JLabel LabelCliente_Apellidos;
    private javax.swing.JLabel LabelCliente_CI_NIT;
    private javax.swing.JLabel LabelCliente_Direccion;
    private javax.swing.JLabel LabelCliente_Email;
    private javax.swing.JLabel LabelCliente_Nombre;
    private javax.swing.JLabel LabelCliente_Telefono_Celular;
    private javax.swing.JLabel LabelFondoCliente;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JTabbedPane TabbedPanePrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPaneCliente;
    // End of variables declaration//GEN-END:variables
}
