

/**
 *
 * @author huawei
 */


public class SicaklikDonusturucu extends javax.swing.JFrame {

    /**
     * Creates new form SicaklikDonusturucu
     */
    public SicaklikDonusturucu() {
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

        combo1 = new javax.swing.JComboBox<>();
        combo2 = new javax.swing.JComboBox<>();
        deger = new javax.swing.JTextField();
        donustür = new javax.swing.JButton();
        sonuc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sıcaklık Dönüştürücü");
        setLocation(new java.awt.Point(500, 250));

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenayt", "Celcius", "Kelvin" }));

        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenayt", "Celcius", "Kelvin" }));

        donustür.setText("Dönüştür");
        donustür.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donustürActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combo1, 0, 115, Short.MAX_VALUE)
                            .addComponent(combo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deger)
                            .addComponent(sonuc, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(donustür, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(deger))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(sonuc))
                .addGap(35, 35, 35)
                .addComponent(donustür, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void donustürActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donustürActionPerformed
        
        if(combo1.getSelectedItem() == "Celcius"){
            if(combo2.getSelectedItem() == "Fahrenayt"){
                
                double donusum = ((180*Double.parseDouble(deger.getText()))/100) + 32;
                sonuc.setText(String.valueOf(donusum));
                
            }
            else if(combo2.getSelectedItem() == "Kelvin"){
                
                double donusum = Double.parseDouble(deger.getText()) + 273;
                sonuc.setText(String.valueOf(donusum));
                
            }
        }
        if(combo1.getSelectedItem() == "Fahrenayt"){
            if(combo2.getSelectedItem() == "Celcius"){
                
                double donusum = (100*(Double.parseDouble(deger.getText())-32))/180;
                sonuc.setText(String.valueOf(donusum));
                
            }
            else if(combo2.getSelectedItem() == "Kelvin"){
                double donusum = ((5*Double.parseDouble(deger.getText()))/9) + 273;
                sonuc.setText(String.valueOf(donusum));
            }
        }
        if(combo1.getSelectedItem() == "Kelvin"){
            if(combo2.getSelectedItem() == "Fahrenayt"){
                
                double donusum = ((9*Double.parseDouble(deger.getText()))/5) + 32;
                sonuc.setText(String.valueOf(donusum));
                
            }
            else if(combo2.getSelectedItem() == "Celcius"){
                
                double donusum = Double.parseDouble(deger.getText()) - 273;
                sonuc.setText(String.valueOf(donusum));
            }
        }
    }//GEN-LAST:event_donustürActionPerformed

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
            java.util.logging.Logger.getLogger(SicaklikDonusturucu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SicaklikDonusturucu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SicaklikDonusturucu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SicaklikDonusturucu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SicaklikDonusturucu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JTextField deger;
    private javax.swing.JButton donustür;
    private javax.swing.JTextField sonuc;
    // End of variables declaration//GEN-END:variables
}
