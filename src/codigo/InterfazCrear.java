/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Lorenzo
 */
public class InterfazCrear extends javax.swing.JFrame {

    /**
     * Creates new form InterfazCrear
     */
    public InterfazCrear() {
        initComponents();
    }

    public void crearFichero(String nombre) throws IOException {

        File fichero = new File(nombre);

        
        boolean existencia = false;
        existencia = fichero.createNewFile();
        if(existencia){
            ficheroCorrecto.setSize(345, 200);
            ficheroCorrecto.setVisible(true);
            jTextField1.setText("");
        }else{
            ficheroExiste.setSize(345, 200);
            ficheroExiste.setVisible(true);
        }
    }
    public void crearDirectorio(String nombre) throws IOException {

        File directorio = new File(nombre);

        
        boolean existencia2 = false;
        existencia2 = directorio.mkdir();
        if(existencia2){
            directorioCorrecto.setSize(345, 200);
            directorioCorrecto.setVisible(true);
            jTextField2.setText("");
        }else{
            directoExiste.setSize(345, 200);
            directoExiste.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ficheroCorrecto = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        ficheroExiste = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        directorioCorrecto = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        directoExiste = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fichero creado");

        jButton3.setText("Aceptar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout ficheroCorrectoLayout = new javax.swing.GroupLayout(ficheroCorrecto.getContentPane());
        ficheroCorrecto.getContentPane().setLayout(ficheroCorrectoLayout);
        ficheroCorrectoLayout.setHorizontalGroup(
            ficheroCorrectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ficheroCorrectoLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(81, 81, 81))
            .addGroup(ficheroCorrectoLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ficheroCorrectoLayout.setVerticalGroup(
            ficheroCorrectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ficheroCorrectoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(41, 41, 41))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("El fichero ya existe");

        jButton4.setText("Aceptar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout ficheroExisteLayout = new javax.swing.GroupLayout(ficheroExiste.getContentPane());
        ficheroExiste.getContentPane().setLayout(ficheroExisteLayout);
        ficheroExisteLayout.setHorizontalGroup(
            ficheroExisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ficheroExisteLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(55, 55, 55))
            .addGroup(ficheroExisteLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ficheroExisteLayout.setVerticalGroup(
            ficheroExisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ficheroExisteLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(29, 29, 29))
        );

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Directorio creado");

        jButton5.setText("Aceptar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout directorioCorrectoLayout = new javax.swing.GroupLayout(directorioCorrecto.getContentPane());
        directorioCorrecto.getContentPane().setLayout(directorioCorrectoLayout);
        directorioCorrectoLayout.setHorizontalGroup(
            directorioCorrectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, directorioCorrectoLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(55, 55, 55))
            .addGroup(directorioCorrectoLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        directorioCorrectoLayout.setVerticalGroup(
            directorioCorrectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(directorioCorrectoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(29, 29, 29))
        );

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("El directorio ya existe");

        jButton6.setText("Aceptar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout directoExisteLayout = new javax.swing.GroupLayout(directoExiste.getContentPane());
        directoExiste.getContentPane().setLayout(directoExisteLayout);
        directoExisteLayout.setHorizontalGroup(
            directoExisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, directoExisteLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(55, 55, 55))
            .addGroup(directoExisteLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        directoExisteLayout.setVerticalGroup(
            directoExisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(directoExisteLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(29, 29, 29))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear fichero");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Crear directorio");

        jButton1.setText("Crear directorio");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jButton2.setText("Crear fichero");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(92, 92, 92))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        String nombreFichero = jTextField1.getText();
        try {
            crearFichero(nombreFichero);
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        String nombreDirectorio = jTextField2.getText();
        try {
            crearDirectorio(nombreDirectorio);
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
    

        ficheroCorrecto.setVisible(false);
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        ficheroExiste.setVisible(false);
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        directorioCorrecto.setVisible(false);
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        directoExiste.setVisible(false);
    }//GEN-LAST:event_jButton6MousePressed

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
            java.util.logging.Logger.getLogger(InterfazCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog directoExiste;
    private javax.swing.JDialog directorioCorrecto;
    private javax.swing.JDialog ficheroCorrecto;
    private javax.swing.JDialog ficheroExiste;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
