/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat2;

/**
 *
 * @author Hillal
 */
public class lat2 extends javax.swing.JFrame {

    /**
     * Creates new form lat2
     */
    public lat2() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editnama = new javax.swing.JTextField();
        editkelas = new javax.swing.JTextField();
        editalamat = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tahasil = new javax.swing.JTextArea();
        editabsen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Data Isian");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 60, 14);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(67, 40, 50, 14);

        jLabel3.setText("Kelas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(65, 70, 50, 14);

        jLabel4.setText("Alamat");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(63, 130, 60, 14);

        editnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editnamaActionPerformed(evt);
            }
        });
        getContentPane().add(editnama);
        editnama.setBounds(130, 30, 100, 30);

        editkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editkelasActionPerformed(evt);
            }
        });
        getContentPane().add(editkelas);
        editkelas.setBounds(130, 60, 100, 30);

        editalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editalamatActionPerformed(evt);
            }
        });
        getContentPane().add(editalamat);
        editalamat.setBounds(130, 120, 100, 40);

        button.setText("Proses");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button);
        button.setBounds(150, 160, 100, 23);

        tahasil.setColumns(20);
        tahasil.setRows(5);
        jScrollPane1.setViewportView(tahasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 190, 166, 96);

        editabsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editabsenActionPerformed(evt);
            }
        });
        getContentPane().add(editabsen);
        editabsen.setBounds(130, 90, 100, 30);

        jLabel5.setText("Absen");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 100, 60, 14);

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

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:
        String nama = editnama.getText();
        String absen = editabsen.getText();
        String kelas = editkelas.getText();
        String alamat = editalamat.getText();
        
        tahasil.setText("Nama siswa: "+nama+"\n"+"Absen: "+absen+
                "\n"+"Kelas: "+kelas+"\n"+"Alamat: "+alamat);
    }//GEN-LAST:event_buttonActionPerformed

    private void editabsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editabsenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editabsenActionPerformed

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
            java.util.logging.Logger.getLogger(lat2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lat2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lat2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lat2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lat2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JTextField editabsen;
    private javax.swing.JTextField editalamat;
    private javax.swing.JTextField editkelas;
    private javax.swing.JTextField editnama;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tahasil;
    // End of variables declaration//GEN-END:variables
}
