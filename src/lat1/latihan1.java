/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat1;

/**
 *
 * @author Hillal
 */
public class latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form latihan1
     */
    public latihan1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editnama = new javax.swing.JTextField();
        editkelas = new javax.swing.JTextField();
        editalamat = new javax.swing.JTextField();
        ButtonProses = new javax.swing.JButton();
        hasilnama = new javax.swing.JTextField();
        hasilkelas = new javax.swing.JTextField();
        hasilalamat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Data Isian");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(142, 27, 60, 14);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 60, 27, 14);

        jLabel3.setText("Kelas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 90, 25, 14);

        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 120, 33, 14);

        editnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editnamaActionPerformed(evt);
            }
        });
        getContentPane().add(editnama);
        editnama.setBounds(142, 59, 100, 20);

        editkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editkelasActionPerformed(evt);
            }
        });
        getContentPane().add(editkelas);
        editkelas.setBounds(140, 90, 100, 20);

        editalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editalamatActionPerformed(evt);
            }
        });
        getContentPane().add(editalamat);
        editalamat.setBounds(140, 120, 100, 20);

        ButtonProses.setText("Proses");
        getContentPane().add(ButtonProses);
        ButtonProses.setBounds(140, 150, 100, 23);
        getContentPane().add(hasilnama);
        hasilnama.setBounds(140, 190, 110, 20);

        hasilkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilkelasActionPerformed(evt);
            }
        });
        getContentPane().add(hasilkelas);
        hasilkelas.setBounds(140, 220, 110, 20);

        hasilalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilalamatActionPerformed(evt);
            }
        });
        getContentPane().add(hasilalamat);
        hasilalamat.setBounds(140, 250, 110, 20);

        jLabel5.setText("Nama");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 190, 27, 14);

        jLabel6.setText("Kelas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 220, 25, 14);

        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 250, 33, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editnamaActionPerformed

    private void editkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editkelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editkelasActionPerformed

    private void editalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editalamatActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_editalamatActionPerformed

    private void hasilkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilkelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilkelasActionPerformed

    private void hasilalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilalamatActionPerformed

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
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonProses;
    private javax.swing.JTextField editalamat;
    private javax.swing.JTextField editkelas;
    private javax.swing.JTextField editnama;
    private javax.swing.JTextField hasilalamat;
    private javax.swing.JTextField hasilkelas;
    private javax.swing.JTextField hasilnama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
