/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

/**
 *
 * @author Harshit
 */

//The modeChooserFrame class opens up a JFrame with different available gameplay options
public class modeChooserFrame extends javax.swing.JFrame {

    /**
     * Creates new form modeChooserFrame
     */
    public modeChooserFrame() {
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

        panel = new javax.swing.JPanel();
        chooserPanel = new javax.swing.JPanel();
        jButton_tp = new javax.swing.JButton();
        jButton_im = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(panel);

        jButton_tp.setBackground(new java.awt.Color(153, 153, 153));
        jButton_tp.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jButton_tp.setForeground(new java.awt.Color(0, 255, 255));
        jButton_tp.setText("Two Player Game");
        jButton_tp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_tpActionPerformed(evt);
            }
        });

        jButton_im.setBackground(new java.awt.Color(153, 153, 153));
        jButton_im.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jButton_im.setForeground(new java.awt.Color(255, 0, 0));
        jButton_im.setText("Single Player : Impossible Mode");
        jButton_im.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_imActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chooserPanelLayout = new javax.swing.GroupLayout(chooserPanel);
        chooserPanel.setLayout(chooserPanelLayout);
        chooserPanelLayout.setHorizontalGroup(
            chooserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton_tp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_im, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        chooserPanelLayout.setVerticalGroup(
            chooserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chooserPanelLayout.createSequentialGroup()
                .addComponent(jButton_tp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_im, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(chooserPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //JButton for two player game mode
    private void jButton_tpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_tpActionPerformed
        //when any button is clicked, close this frame and open a new frame according to the selected game mode
        this.dispose();
        gamePlayPanel f = new gamePlayPanel();
        f.setVisible(true);
        //set location of the frame at the center of the screen
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton_tpActionPerformed

    //JButton for single player (vs.CPU: Impossible Mode) where CPU plays optimally
    private void jButton_imActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_imActionPerformed
        this.dispose();
        impossibleModeFrame f = new impossibleModeFrame();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton_imActionPerformed

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
            java.util.logging.Logger.getLogger(modeChooserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modeChooserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modeChooserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modeChooserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modeChooserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chooserPanel;
    private javax.swing.JButton jButton_im;
    private javax.swing.JButton jButton_tp;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
