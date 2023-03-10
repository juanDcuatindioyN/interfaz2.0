/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz1;

import java.awt.Color;

/**
 *
 * @author JUAN DAVID
 */
public class main extends javax.swing.JFrame {
    int mouseX, mouseY;
    /**
     * Creates new form main
     */
    public main() {
        initComponents();
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
        barra = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        USUARIOS = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        EMAIL = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        SESION = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        entrar = new javax.swing.JPanel();
        ENTRARL = new javax.swing.JLabel();
        JUEGOS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setBackground(new java.awt.Color(204, 204, 204));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        X.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        X.setForeground(new java.awt.Color(255, 0, 0));
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("X");
        X.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        X.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(881, 881, 881)
                .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 430, 490));

        USUARIOS.setBackground(new java.awt.Color(148, 0, 0));

        jLabel3.setBackground(new java.awt.Color(20, 20, 20));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        jLabel3.setText("FRYNET GAMING");

        EMAIL.setBackground(new java.awt.Color(0, 0, 0));
        EMAIL.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        EMAIL.setText("USUARIO");

        usuario.setBackground(new java.awt.Color(153, 0, 0));
        usuario.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        usuario.setForeground(new java.awt.Color(204, 204, 204));
        usuario.setText("ingrese su nombre de usuario");
        usuario.setBorder(null);
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioMousePressed(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        SESION.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        SESION.setText("INICIAR SESION");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("CONTRASEÑA");

        contraseña.setBackground(new java.awt.Color(153, 0, 0));
        contraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(204, 204, 204));
        contraseña.setText("********");
        contraseña.setBorder(null);
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñaMousePressed(evt);
            }
        });
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GAMINGHOUSE.jpg"))); // NOI18N

        entrar.setBackground(new java.awt.Color(204, 0, 0));
        entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ENTRARL.setBackground(new java.awt.Color(213, 24, 24));
        ENTRARL.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ENTRARL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ENTRARL.setText("ENTRAR");
        ENTRARL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ENTRARLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ENTRARLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ENTRARLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout entrarLayout = new javax.swing.GroupLayout(entrar);
        entrar.setLayout(entrarLayout);
        entrarLayout.setHorizontalGroup(
            entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ENTRARL, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        entrarLayout.setVerticalGroup(
            entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ENTRARL, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        JUEGOS.setBackground(new java.awt.Color(204, 0, 0));
        JUEGOS.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        JUEGOS.setText("JUEGOS ");
        JUEGOS.setBorder(null);
        JUEGOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JUEGOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JUEGOSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JUEGOSMouseExited(evt);
            }
        });
        JUEGOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUEGOSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout USUARIOSLayout = new javax.swing.GroupLayout(USUARIOS);
        USUARIOS.setLayout(USUARIOSLayout);
        USUARIOSLayout.setHorizontalGroup(
            USUARIOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(USUARIOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(USUARIOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(USUARIOSLayout.createSequentialGroup()
                        .addGroup(USUARIOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(SESION, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseña)
                            .addComponent(usuario)
                            .addComponent(jSeparator2)
                            .addComponent(EMAIL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(USUARIOSLayout.createSequentialGroup()
                        .addGroup(USUARIOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(entrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JUEGOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        USUARIOSLayout.setVerticalGroup(
            USUARIOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(USUARIOSLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SESION, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(USUARIOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(USUARIOSLayout.createSequentialGroup()
                        .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JUEGOS, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel1.add(USUARIOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usuarioActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed
    
    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getXOnScreen();
        this.setLocation(x - mouseX,y - mouseY);
    }//GEN-LAST:event_barraMouseDragged

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XMouseClicked

    private void XMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseEntered
        X.setBackground(Color.red);
    }//GEN-LAST:event_XMouseEntered

    private void usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMousePressed
      if(usuario.getText().equals("ingrese su nombre de usuario")){
           usuario.setText("");
      }
      if (String.valueOf(contraseña.getPassword()).isEmpty()){
          contraseña.setText("********");
      }
    }//GEN-LAST:event_usuarioMousePressed

    private void contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMousePressed
        if (String.valueOf(contraseña.getPassword()).equals("********")){
          contraseña.setText("");
      }
      if(usuario.getText().isEmpty()){
           usuario.setText("ingrese su nombre de usuario"); 
      }
    }//GEN-LAST:event_contraseñaMousePressed

    private void ENTRARLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTRARLMouseExited
        entrar.setBackground(new Color(213,24,24));
    }//GEN-LAST:event_ENTRARLMouseExited

    private void ENTRARLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTRARLMouseEntered
        entrar.setBackground(new Color(153,0,0));
    }//GEN-LAST:event_ENTRARLMouseEntered

    private void ENTRARLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTRARLMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "intento de login con los datos: \nUsuarios:"+ usuario.getText() + "\nContraseña:" + String.valueOf(contraseña.getPassword()),"login", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_ENTRARLMouseClicked

    private void JUEGOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUEGOSActionPerformed
        interfaz2 n = new interfaz2();
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JUEGOSActionPerformed

    private void JUEGOSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JUEGOSMouseExited
       JUEGOS.setBackground(new Color(213,24,24));
    }//GEN-LAST:event_JUEGOSMouseExited

    private void JUEGOSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JUEGOSMouseEntered
       JUEGOS.setBackground(new Color(153,0,0));
    }//GEN-LAST:event_JUEGOSMouseEntered
                               
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EMAIL;
    private javax.swing.JLabel ENTRARL;
    private javax.swing.JButton JUEGOS;
    private javax.swing.JLabel SESION;
    private javax.swing.JPanel USUARIOS;
    private javax.swing.JLabel X;
    private javax.swing.JPanel barra;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JPanel entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
