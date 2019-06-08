/*
NAME : Vivek B Barbhaya
ROLL : 32
CLASS : MCA-4
SUB : DAD
*/

package medicinescoringsystem;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;

public class GLASGOW_COMA_SCALE_FOR_HEAD_INJURY extends javax.swing.JFrame {

    //instance variables
    int eyeOpeningScore = 0;
    int verbalResponseScore = 0;
    int bestMotorResponseScore = 0;
    int totalScore = 0;

    //constrcutros
    public GLASGOW_COMA_SCALE_FOR_HEAD_INJURY() {

        initComponents();
        myInitComponents();

    }//constructorEnds

    //methods
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboBoxEyeOpening = new javax.swing.JComboBox<>();
        comboBoxVerbalResponse = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboBoxBestMotorResponse = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(440, 330, 90, 30);

        btnCalculate.setText("CALCULATE");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculate);
        btnCalculate.setBounds(30, 330, 130, 30);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setText("Eye opening (E)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 50, 230, 24);

        comboBoxEyeOpening.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Nil", "To pain", "To loud voice", "Spontaneous" }));
        getContentPane().add(comboBoxEyeOpening);
        comboBoxEyeOpening.setBounds(270, 50, 300, 30);

        comboBoxVerbalResponse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Nil", "Incomprehensible sounds", "Inappropriate words", "Confused, disoriented", "Oriented" }));
        getContentPane().add(comboBoxVerbalResponse);
        comboBoxVerbalResponse.setBounds(270, 120, 300, 30);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setText("Verbal response (V)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 120, 230, 24);

        comboBoxBestMotorResponse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Nil", "Extension posturing", "Abnormal flexion posturing", "Withdraws (flexion)", "Localizes", "Obeys" }));
        getContentPane().add(comboBoxBestMotorResponse);
        comboBoxBestMotorResponse.setBounds(270, 190, 300, 30);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel4.setText("Best motor response (M)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 190, 230, 24);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scoreImage.png"))); // NOI18N
        BG.setText("jLabel1");
        getContentPane().add(BG);
        BG.setBounds(-10, 0, 620, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        totalScore = eyeOpeningScore + verbalResponseScore + bestMotorResponseScore;
        String interpretationIs = null;

        if (totalScore == 3 || totalScore == 4) {
            interpretationIs = "85% chance of dying or remaining vegetative";
        }
        if (totalScore > 4 && totalScore < 12) {
            interpretationIs = "proportional chances of recovery";
        }
        if (totalScore > 11) {
            interpretationIs = "only a 5-10% likelihood of death or vegetative state and 85% chance of moderate disability or good recovery";
        }

        JOptionPane.showMessageDialog(null, "Score is: " + totalScore + "\nInterpretation is: " + interpretationIs, "Scoring interpretation", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        //System.exit(0);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(GLASGOW_COMA_SCALE_FOR_HEAD_INJURY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GLASGOW_COMA_SCALE_FOR_HEAD_INJURY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GLASGOW_COMA_SCALE_FOR_HEAD_INJURY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GLASGOW_COMA_SCALE_FOR_HEAD_INJURY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GLASGOW_COMA_SCALE_FOR_HEAD_INJURY().setVisible(true);
            }
        });
    }//mainEnds

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> comboBoxBestMotorResponse;
    private javax.swing.JComboBox<String> comboBoxEyeOpening;
    private javax.swing.JComboBox<String> comboBoxVerbalResponse;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private void myInitComponents() {

        setTitle("GLASGOW COMA SCALE FOR HEAD INJURY");
        setSize(600, 430);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        comboBoxEyeOpening.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (comboBoxEyeOpening.getSelectedIndex() == 1) {
                    eyeOpeningScore = 1;
                }

                if (comboBoxEyeOpening.getSelectedIndex() == 2) {
                    eyeOpeningScore = 2;
                }
                if (comboBoxEyeOpening.getSelectedIndex() == 3) {
                    eyeOpeningScore = 3;
                }
                if (comboBoxEyeOpening.getSelectedIndex() == 4) {
                    eyeOpeningScore = 4;
                }
            }
        });//comboBoxEyeOpeningEnds

        comboBoxVerbalResponse.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (comboBoxVerbalResponse.getSelectedIndex() == 1) {
                    verbalResponseScore = 1;
                }

                if (comboBoxVerbalResponse.getSelectedIndex() == 2) {
                    verbalResponseScore = 2;
                }
                if (comboBoxVerbalResponse.getSelectedIndex() == 3) {
                    verbalResponseScore = 3;
                }
                if (comboBoxVerbalResponse.getSelectedIndex() == 4) {
                    verbalResponseScore = 4;
                }
                if (comboBoxVerbalResponse.getSelectedIndex() == 5) {
                    verbalResponseScore = 5;
                }
            }
        });//comboBoxVerbalResponseEnds

        comboBoxBestMotorResponse.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (comboBoxBestMotorResponse.getSelectedIndex() == 1) {
                    bestMotorResponseScore = 1;
                }

                if (comboBoxBestMotorResponse.getSelectedIndex() == 2) {
                    bestMotorResponseScore = 2;
                }
                if (comboBoxBestMotorResponse.getSelectedIndex() == 3) {
                    bestMotorResponseScore = 3;
                }
                if (comboBoxBestMotorResponse.getSelectedIndex() == 4) {
                    bestMotorResponseScore = 4;
                }
                if (comboBoxBestMotorResponse.getSelectedIndex() == 5) {
                    bestMotorResponseScore = 5;
                }
                if (comboBoxBestMotorResponse.getSelectedIndex() == 6) {
                    bestMotorResponseScore = 6;
                }
            }
        });//comboBoxBestMotorResponseEnds

    }//myInitComponentsEnds
}//classEnds
