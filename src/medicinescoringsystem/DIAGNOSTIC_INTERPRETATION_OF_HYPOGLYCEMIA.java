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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author root
 */
public class DIAGNOSTIC_INTERPRETATION_OF_HYPOGLYCEMIA extends javax.swing.JFrame {

    /**
     * Creates new form DIAGNOSTIC_INTERPRETATION_OF_HYPOGLYCEMIA
     */
    //instance variable
    int scoreOfGlucose = 0;
    int scoreOfInsulin = 0;
    int scoreOfCPeptide = 0;
    int scoreOfProinsulin = 0;
    int scoreOfUrineOrPlasma = 0;
    int totalScore = 0;

    //constructor
    public DIAGNOSTIC_INTERPRETATION_OF_HYPOGLYCEMIA() {
        initComponents();
        myInitComponents();
    }//constructorEnds

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //methods
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbScoreInsulin = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbScoreCPeptide = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbScoreProinsulin = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbScoreUrineOrPlasma = new javax.swing.JComboBox<>();
        btnExit = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        cbScoreGlucose_mg_dl = new javax.swing.JComboBox<>();
        cbScoreGlucose_mmol_L = new javax.swing.JComboBox<>();
        comboBoxUnitGlucose = new javax.swing.JComboBox<>();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel7.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        jLabel7.setText("Factor");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(22, 12, 53, 24);

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

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setText("Glucose");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 56, 65, 24);

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel5.setText("Insulin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 100, 53, 24);

        cbScoreInsulin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "<3", "≥3" }));
        getContentPane().add(cbScoreInsulin);
        cbScoreInsulin.setBounds(350, 100, 230, 30);

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel6.setText("C- Peptide");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 150, 120, 24);

        cbScoreCPeptide.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "<200", "≥200" }));
        getContentPane().add(cbScoreCPeptide);
        cbScoreCPeptide.setBounds(350, 150, 230, 30);

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel8.setText("Proinsulin");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 200, 120, 24);

        cbScoreProinsulin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "<5", "≥5" }));
        getContentPane().add(cbScoreProinsulin);
        cbScoreProinsulin.setBounds(350, 200, 230, 30);

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel9.setText("Urine or Plasma Sulfonylurea");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 250, 280, 24);

        cbScoreUrineOrPlasma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "YES", "NO" }));
        getContentPane().add(cbScoreUrineOrPlasma);
        cbScoreUrineOrPlasma.setBounds(350, 250, 230, 30);

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

        cbScoreGlucose_mg_dl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "≥40", "≤45" }));
        getContentPane().add(cbScoreGlucose_mg_dl);
        cbScoreGlucose_mg_dl.setBounds(360, 50, 220, 30);

        cbScoreGlucose_mmol_L.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "≥2.2", "≤2.5" }));
        getContentPane().add(cbScoreGlucose_mmol_L);
        cbScoreGlucose_mmol_L.setBounds(350, 50, 230, 30);

        comboBoxUnitGlucose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mmol/L", "mg/dL" }));
        getContentPane().add(comboBoxUnitGlucose);
        comboBoxUnitGlucose.setBounds(200, 50, 125, 30);

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

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        totalScore = scoreOfGlucose + scoreOfInsulin + scoreOfCPeptide + scoreOfProinsulin + scoreOfUrineOrPlasma;
        String interpretationIs = null;

        if (totalScore == 6) {
            interpretationIs = "Nonhypoglycemic";
        }
        if (totalScore == 10) {
            interpretationIs = "Insulinoma";
        }
        if (totalScore == 8) {
            interpretationIs = "Exogenous insulin";
        }
        if (totalScore == 9) {
            interpretationIs = "Sulfonylurea";
        }
        if (totalScore == 7) {
            interpretationIs = "Non-insulin mediated";
        }
        if (totalScore >= 1 && totalScore <= 5) {
            interpretationIs = "Some input is wrong";
        }

        JOptionPane.showMessageDialog(null, "Score is: " + totalScore + "\nInterpretation is: " + interpretationIs, "Scoring interpretation", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCalculateActionPerformed

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
                new DIAGNOSTIC_INTERPRETATION_OF_HYPOGLYCEMIA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cbScoreCPeptide;
    private javax.swing.JComboBox<String> cbScoreGlucose_mg_dl;
    private javax.swing.JComboBox<String> cbScoreGlucose_mmol_L;
    private javax.swing.JComboBox<String> cbScoreInsulin;
    private javax.swing.JComboBox<String> cbScoreProinsulin;
    private javax.swing.JComboBox<String> cbScoreUrineOrPlasma;
    private javax.swing.JComboBox<String> comboBoxUnitGlucose;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void myInitComponents() {

        setTitle("DIAGNOSTIC INTERPRETATION OF HYPOGLYCEMIA");
        setSize(600, 430);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        cbScoreGlucose_mg_dl.setVisible(false);

        comboBoxUnitGlucose.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {

                if (comboBoxUnitGlucose.getSelectedItem().equals("mmol/L")) {
                    cbScoreGlucose_mmol_L.setVisible(true);
                    cbScoreGlucose_mg_dl.setVisible(false);
                }
                if (comboBoxUnitGlucose.getSelectedItem().equals("mg/dL")) {
                    cbScoreGlucose_mg_dl.setVisible(true);
                    cbScoreGlucose_mmol_L.setVisible(false);
                }

            }
        });//comboBoxUnitSBEnds

        cbScoreGlucose_mmol_L.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (cbScoreGlucose_mmol_L.getSelectedIndex() == 1) {
                    scoreOfGlucose = 1;
                }

                if (cbScoreGlucose_mmol_L.getSelectedIndex() == 2) {
                    scoreOfGlucose = 2;
                }
            }
        });//cbScoreGlucose_mmol_LEnds

        cbScoreGlucose_mg_dl.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (cbScoreGlucose_mg_dl.getSelectedIndex() == 1) {
                    scoreOfGlucose = 1;
                }

                if (cbScoreGlucose_mg_dl.getSelectedIndex() == 2) {
                    scoreOfGlucose = 2;
                }
            }
        });//cbScoreGlucose_mg_dlEnds

        cbScoreInsulin.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (cbScoreInsulin.getSelectedIndex() == 1) {
                    scoreOfInsulin = 1;
                }

                if (cbScoreInsulin.getSelectedIndex() == 2) {
                    scoreOfInsulin = 2;
                }
            }
        });//cbScoreInsulinEnds

        cbScoreCPeptide.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (cbScoreCPeptide.getSelectedIndex() == 1) {
                    scoreOfCPeptide = 1;
                }

                if (cbScoreCPeptide.getSelectedIndex() == 2) {
                    scoreOfCPeptide = 2;
                }
            }
        });//cbScoreCPeptideEnds

        cbScoreProinsulin.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (cbScoreProinsulin.getSelectedIndex() == 1) {
                    scoreOfProinsulin = 1;
                }

                if (cbScoreProinsulin.getSelectedIndex() == 2) {
                    scoreOfProinsulin = 2;
                }
            }
        });//cbScoreProinsulinEnds

        cbScoreUrineOrPlasma.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                if (cbScoreUrineOrPlasma.getSelectedIndex() == 1) {
                    scoreOfUrineOrPlasma = 1;
                }

                if (cbScoreUrineOrPlasma.getSelectedIndex() == 2) {
                    scoreOfUrineOrPlasma = 2;
                }
            }
        });//cbScoreUrineOrPlasmaEnds

    }//myInitComponentsEnds
}
