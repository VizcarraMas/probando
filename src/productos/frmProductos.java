/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Vizkarra
 */
public class frmProductos extends javax.swing.JFrame {
    ResultSet rs = null;
    productoss cl = new productoss();
    boolean registro = false;
    boolean prueba = false;
    boolean newRecord = false;
    int cantidad = 0;
    int mayor = 0;
  

    public frmProductos() {
        initComponents();
    }
     private void Bloquear(){
        txtId.setEnabled(false);
        txtNombre.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtPresentacion.setEnabled(false);}

    private void Desbloquear() {
        txtNombre.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtPresentacion.setEnabled(true);}

    private void Limpiar() {
        txtNombre.setText("");
        txtPrecio.setText("");
        txtPresentacion.setText("");}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPresentacion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("powewr");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 11, 122, -1));

        lblId.setText("Id");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, 18, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, -1, -1));

        jLabel5.setText("Presentación");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, -1, -1));

        txtPresentacion.setBackground(new java.awt.Color(240, 240, 240));
        txtPresentacion.setEnabled(false);
        txtPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPresentacionActionPerformed(evt);
            }
        });
        getContentPane().add(txtPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 156, 280, -1));

        txtPrecio.setBackground(new java.awt.Color(240, 240, 240));
        txtPrecio.setEnabled(false);
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 118, 75, -1));

        txtNombre.setBackground(new java.awt.Color(240, 240, 240));
        txtNombre.setEnabled(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 77, 280, -1));

        txtId.setBackground(new java.awt.Color(240, 240, 240));
        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 36, 45, -1));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 203, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 203, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (newRecord == true) {
            if (this.txtId.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe existir un id de productos", "AVISO DEL SISTEMA", 2);
            } else if (this.txtNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo nombre", "AVISO DEL SISTEMA", 2);
                this.txtNombre.requestFocus();
            } else if (this.txtPrecio.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo precio", "AVISO DEL SISTEMA", 2);
                this.txtPrecio.requestFocus();
            } else if (this. txtPresentacion.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo presentacion", "AVISO DEL SISTEMA", 2);
                this. txtPresentacion.requestFocus();
            }  
            cl.insertar(this.txtId.getText(), this.txtNombre.getText().toUpperCase(), this.txtPrecio.getText().toUpperCase(), this.txtPresentacion.getText().toUpperCase());
            JOptionPane.showMessageDialog(rootPane, "Registro guardado exitosamente!!", "AVISO DEL SISTEMA", 1);
                        Bloquear();
                        Limpiar();
                        this.txtId.setText("");
                        this.btnNuevo.setVisible(true);
                        this.btnCancelar.setVisible(false);
                        newRecord = false;
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
                rs = null;
        rs = cl.contarRegistros();
        try {
            while (rs.next()) {
                cantidad = rs.getInt(1);
                if (cantidad != 0) {
                    rs = null;
   
                    rs = cl.mayorRegistro();
                    while (rs.next()) {
                        mayor = rs.getInt(1) + 1;
                        
                        if (mayor < 10) {
                            txtId.setText("00" + mayor);
                        } else if (mayor < 100) {
                            this.txtId.setText("0" + mayor);
                        } else {
                            txtId.setText("" + mayor);
                        } 
                    }
                } else {
                    txtId.setText("00"+1);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
        Desbloquear();
        Limpiar();
        this.txtNombre.requestFocus();
        this.btnCancelar.setVisible(true);
        this.btnNuevo.setVisible(false);
        newRecord = true;      
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       Limpiar();
        Bloquear();
        this.btnNuevo.setVisible(true);
        this.btnCancelar.setVisible(false);
        this.btnGuardar.setVisible(true);        
        this.txtId.setText("");
        newRecord = false;
        prueba = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        Bloquear();
    }//GEN-LAST:event_formFocusGained

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusLost

    private void txtPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPresentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPresentacionActionPerformed

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
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPresentacion;
    // End of variables declaration//GEN-END:variables
}
