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

public class CHILD_PUGH_CLASSIFICATION_OF_CIRRHOSIS extends javax.swing.JFrame {

    //instance variable
    int scoreOfSB = 0;
    int scoreOfSA = 0;
    int scoreOfPT = 0;
    int scoreOfASC = 0;
    int scoreOfHE = 0;
    int totalScore = 0;

    //constructors
    public CHILD_PUGH_CLASSIFICATION_OF_CIRRHOSIS() {

        initComponents();
        myInitComponents();

    }//constructorEnds

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboBoxUnitSB = new javax.swing.JComboBox<>();
        comboBoxScoreUmolSB = new javax.swing.JComboBox<>();
        comboBoxScoreMgSB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comboBoxUnitSA = new javax.swing.JComboBox<>();
        comboBoxScoreGlSA = new javax.swing.JComboBox<>();
        comboBoxScoreGdlSA = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboBoxUnitPT = new javax.swing.JComboBox<>();
        comboBoxScoreSPPT = new javax.swing.JComboBox<>();
        comboBoxScoreINRPT = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        comboBoxScoreASc = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        comboBoxScoreHE = new javax.swing.JComboBox<>();
        btnCalculate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setText("Serum bilirubin");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 56, 125, 24);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        jLabel3.setText("Unit");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 10, 70, 30);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel4.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        jLabel4.setText("Score");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 10, 47, 24);

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel7.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        jLabel7.setText("Factor");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(22, 12, 53, 24);

        comboBoxUnitSB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "μmol/L", "mg/dL" }));
        comboBoxUnitSB.setToolTipText("");
        getContentPane().add(comboBoxUnitSB);
        comboBoxUnitSB.setBounds(206, 50, 120, 30);

        comboBoxScoreUmolSB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "less than 34", "34–51", "greater than 51" }));
        getContentPane().add(comboBoxScoreUmolSB);
        comboBoxScoreUmolSB.setBounds(400, 50, 180, 30);

        comboBoxScoreMgSB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "less than 2.0", "2.0–3.0", "greater than 3.0" }));
        getContentPane().add(comboBoxScoreMgSB);
        comboBoxScoreMgSB.setBounds(390, 50, 190, 30);

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel5.setText("Serum albumin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 100, 122, 24);

        comboBoxUnitSA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "g/L", "g/dL" }));
        comboBoxUnitSA.setToolTipText("");
        getContentPane().add(comboBoxUnitSA);
        comboBoxUnitSA.setBounds(206, 100, 120, 30);

        comboBoxScoreGlSA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "greater than 35", "30–35", "less than 30" }));
        getContentPane().add(comboBoxScoreGlSA);
        comboBoxScoreGlSA.setBounds(400, 100, 180, 30);

        comboBoxScoreGdlSA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "greater than 3.5", "3.0–3.5", "less than 3.0" }));
        getContentPane().add(comboBoxScoreGdlSA);
        comboBoxScoreGdlSA.setBounds(390, 100, 190, 30);

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel6.setText("Prothrombin time");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 150, 160, 24);

        comboBoxUnitPT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seconds prolonged", "INR" }));
        comboBoxUnitPT.setToolTipText("");
        comboBoxUnitPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxUnitPTActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxUnitPT);
        comboBoxUnitPT.setBounds(162, 150, 164, 30);

        comboBoxScoreSPPT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "0–4", "4–6", "greater than 6" }));
        getContentPane().add(comboBoxScoreSPPT);
        comboBoxScoreSPPT.setBounds(400, 150, 180, 30);

        comboBoxScoreINRPT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "less than 1.7", "1.7–2.3", "greater than 2.3" }));
        getContentPane().add(comboBoxScoreINRPT);
        comboBoxScoreINRPT.setBounds(390, 150, 190, 30);

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel8.setText("Ascites");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 200, 160, 24);

        comboBoxScoreASc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "None", "Easily controlled", "Poorly controlled" }));
        getContentPane().add(comboBoxScoreASc);
        comboBoxScoreASc.setBounds(390, 200, 190, 30);

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel9.setText("Hepatic encephalopathy");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 250, 220, 24);

        comboBoxScoreHE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "None", "Minimal", "Advanced" }));
        getContentPane().add(comboBoxScoreHE);
        comboBoxScoreHE.setBounds(390, 250, 190, 30);

        btnCalculate.setText("CALCULATE");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculate);
        btnCalculate.setBounds(30, 330, 130, 30);

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(440, 330, 90, 30);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scoreImage.png"))); // NOI18N
        BG.setText("jLabel1");
        getContentPane().add(BG);
        BG.setBounds(-10, 0, 610, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        //System.exit(0);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void comboBoxUnitPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxUnitPTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxUnitPTActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        totalScore = scoreOfSB + scoreOfSA + scoreOfPT + scoreOfASC + scoreOfHE;
        String interpretationIs = null;

        if (totalScore > 7) {
            interpretationIs = "decomponsated cirrhosis";
        }
        if (totalScore <= 7) {
            interpretationIs = "not decomponsated cirrhosis";
        }

        JOptionPane.showMessageDialog(null, "Score is: " + totalScore + "\nInterpretation is: " + interpretationIs, "Scoring interpretation", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(CHILD_PUGH_CLASSIFICATION_OF_CIRRHOSIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CHILD_PUGH_CLASSIFICATION_OF_CIRRHOSIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CHILD_PUGH_CLASSIFICATION_OF_CIRRHOSIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CHILD_PUGH_CLASSIFICATION_OF_CIRRHOSIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CHILD_PUGH_CLASSIFICATION_OF_CIRRHOSIS().setVisible(true);
            }
        });
    }//mainEnds

    private void myInitComponents() {

        setTitle("CHILD-PUGH CLASSIFICATION OF CIRRHOSIS");
        setSize(600, 430);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        comboBoxScoreMgSB.setVisible(false);
        comboBoxScoreGdlSA.setVisible(false);
        comboBoxScoreINRPT.setVisible(false);

        comboBoxUnitSB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {

                if (comboBoxUnitSB.getSelectedItem().equals("mg/dL")) {
                    comboBoxScoreMgSB.setVisible(true);
                    comboBoxScoreUmolSB.setVisible(false);
                }
                if (comboBoxUnitSB.getSelectedItem().equals("μmol/L")) {
                    comboBoxScoreUmolSB.setVisible(true);
                    comboBoxScoreMgSB.setVisible(false);
                }

            }
        });//comboBoxUnitSBEnds

        comboBoxUnitSA.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {

                if (comboBoxUnitSA.getSelectedItem().equals("g/L")) {
                    comboBoxScoreGlSA.setVisible(true);
                    comboBoxScoreGdlSA.setVisible(false);
                }
                if (comboBoxUnitSA.getSelectedItem().equals("g/dL")) {
                    comboBoxScoreGdlSA.setVisible(true);
                    comboBoxScoreGlSA.setVisible(false);
                }

            }
        });//comboBoxUnitSAEnds

        comboBoxUnitPT.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {

                if (comboBoxUnitPT.getSelectedItem().equals("Seconds prolonged")) {
                    comboBoxScoreSPPT.setVisible(true);
                    comboBoxScoreINRPT.setVisible(false);
                }
                if (comboBoxUnitPT.getSelectedItem().equals("INR")) {
                    comboBoxScoreINRPT.setVisible(true);
                    comboBoxScoreSPPT.setVisible(false);
                }

            }
        });//comboBoxUnitPTEnds

        comboBoxScoreUmolSB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (comboBoxScoreUmolSB.getSelectedIndex() == 1) {
                    scoreOfSB = 1;
                }

                if (comboBoxScoreUmolSB.getSelectedIndex() == 2) {
                    scoreOfSB = 2;
                }
                if (comboBoxScoreUmolSB.getSelectedIndex() == 3) {
                    scoreOfSB = 3;
                }
            }
        });//comboBoxScoreUmolSBEnds

        comboBoxScoreMgSB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (comboBoxScoreMgSB.getSelectedIndex() == 1) {
                    scoreOfSB = 1;
                }
                if (comboBoxScoreMgSB.getSelectedIndex() == 2) {
                    scoreOfSB = 2;
                }
                if (comboBoxScoreMgSB.getSelectedIndex() == 3) {
                    scoreOfSB = 3;
                }
            }
        });//comboBoxScoreMgSBEnds

        comboBoxScoreGlSA.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (comboBoxScoreGlSA.getSelectedIndex() == 1) {
                    scoreOfSA = 1;
                }

                if (comboBoxScoreGlSA.getSelectedIndex() == 2) {
                    scoreOfSA = 2;
                }
                if (comboBoxScoreGlSA.getSelectedIndex() == 3) {
                    scoreOfSA = 3;
                }
            }
        });//comboBoxScoreGlSAEnds

        comboBoxScoreGdlSA.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (comboBoxScoreGdlSA.getSelectedIndex() == 1) {
                    scoreOfSA = 1;
                }

                if (comboBoxScoreGdlSA.getSelectedIndex() == 2) {
                    scoreOfSA = 2;
                }
                if (comboBoxScoreGdlSA.getSelectedIndex() == 3) {
                    scoreOfSA = 3;
                }
            }
        });//comboBoxScoreGdlSAEnds

        comboBoxScoreSPPT.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (comboBoxScoreSPPT.getSelectedIndex() == 1) {
                    scoreOfPT = 1;
                }

                if (comboBoxScoreSPPT.getSelectedIndex() == 2) {
                    scoreOfPT = 2;
                }
                if (comboBoxScoreSPPT.getSelectedIndex() == 3) {
                    scoreOfPT = 3;
                }
            }
        });//comboBoxScoreSPPTEnds

        comboBoxScoreINRPT.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (comboBoxScoreINRPT.getSelectedIndex() == 1) {
                    scoreOfPT = 1;
                }

                if (comboBoxScoreINRPT.getSelectedIndex() == 2) {
                    scoreOfPT = 2;
                }
                if (comboBoxScoreINRPT.getSelectedIndex() == 3) {
                    scoreOfPT = 3;
                }
            }
        });//comboBoxScoreINRPTEnds

        comboBoxScoreASc.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (comboBoxScoreASc.getSelectedIndex() == 1) {
                    scoreOfASC = 1;
                }

                if (comboBoxScoreASc.getSelectedIndex() == 2) {
                    scoreOfASC = 2;
                }
                if (comboBoxScoreASc.getSelectedIndex() == 3) {
                    scoreOfASC = 3;
                }
            }
        });//comboBoxScoreAScEnds

        comboBoxScoreHE.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (comboBoxScoreHE.getSelectedIndex() == 1) {
                    scoreOfHE = 1;
                }

                if (comboBoxScoreHE.getSelectedIndex() == 2) {
                    scoreOfHE = 2;
                }
                if (comboBoxScoreHE.getSelectedIndex() == 3) {
                    scoreOfHE = 3;
                }
            }
        });//comboBoxScoreHEEnds

    }//myInitComponentsMethodEnds

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> comboBoxScoreASc;
    private javax.swing.JComboBox<String> comboBoxScoreGdlSA;
    private javax.swing.JComboBox<String> comboBoxScoreGlSA;
    private javax.swing.JComboBox<String> comboBoxScoreHE;
    private javax.swing.JComboBox<String> comboBoxScoreINRPT;
    private javax.swing.JComboBox<String> comboBoxScoreMgSB;
    private javax.swing.JComboBox<String> comboBoxScoreSPPT;
    private javax.swing.JComboBox<String> comboBoxScoreUmolSB;
    private javax.swing.JComboBox<String> comboBoxUnitPT;
    private javax.swing.JComboBox<String> comboBoxUnitSA;
    private javax.swing.JComboBox<String> comboBoxUnitSB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}//classEnds
