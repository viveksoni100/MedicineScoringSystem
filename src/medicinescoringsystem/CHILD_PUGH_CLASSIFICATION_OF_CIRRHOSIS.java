package medicinescoringsystem;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;
import org.w3c.dom.events.MouseEvent;

public class CHILD_PUGH_CLASSIFICATION_OF_CIRRHOSIS extends javax.swing.JFrame {

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
        comboBoxScoreASc1 = new javax.swing.JComboBox<>();
        btnCalculate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setText("Serum bilirubin");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 56, 125, 24);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setText("Unit");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(296, 12, 36, 24);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel4.setText("Score");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(471, 12, 47, 24);

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel7.setText("Factor");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(22, 12, 53, 24);

        comboBoxUnitSB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "μmol/L", "mg/dL" }));
        comboBoxUnitSB.setToolTipText("");
        getContentPane().add(comboBoxUnitSB);
        comboBoxUnitSB.setBounds(270, 50, 86, 30);

        comboBoxScoreUmolSB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "less than 34", "34–51", "greater than 51" }));
        getContentPane().add(comboBoxScoreUmolSB);
        comboBoxScoreUmolSB.setBounds(400, 50, 180, 30);

        comboBoxScoreMgSB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "less than 2.0", "2.0–3.0", "greater than 3.0" }));
        getContentPane().add(comboBoxScoreMgSB);
        comboBoxScoreMgSB.setBounds(390, 50, 190, 30);

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel5.setText("Serum albumin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 100, 122, 24);

        comboBoxUnitSA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "g/L", "g/dL" }));
        comboBoxUnitSA.setToolTipText("");
        getContentPane().add(comboBoxUnitSA);
        comboBoxUnitSA.setBounds(290, 100, 68, 30);

        comboBoxScoreGlSA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "greater than 35", "30–35", "less than 30" }));
        getContentPane().add(comboBoxScoreGlSA);
        comboBoxScoreGlSA.setBounds(400, 100, 180, 30);

        comboBoxScoreGdlSA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "greater than 3.5", "3.0–3.5", "less than 3.0" }));
        getContentPane().add(comboBoxScoreGdlSA);
        comboBoxScoreGdlSA.setBounds(390, 100, 190, 30);

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel6.setText("Prothrombin time");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 150, 160, 24);

        comboBoxUnitPT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seconds prolonged", "INR" }));
        comboBoxUnitPT.setToolTipText("");
        getContentPane().add(comboBoxUnitPT);
        comboBoxUnitPT.setBounds(200, 150, 164, 30);

        comboBoxScoreSPPT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0–4", "4–6", "greater than 6" }));
        getContentPane().add(comboBoxScoreSPPT);
        comboBoxScoreSPPT.setBounds(400, 150, 180, 30);

        comboBoxScoreINRPT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "less than 1.7", "1.7–2.3", "greater than 2.3" }));
        getContentPane().add(comboBoxScoreINRPT);
        comboBoxScoreINRPT.setBounds(390, 150, 190, 30);

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel8.setText("Ascites");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 200, 160, 24);

        comboBoxScoreASc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Easily controlled", "Poorly controlled" }));
        getContentPane().add(comboBoxScoreASc);
        comboBoxScoreASc.setBounds(390, 200, 190, 30);

        jLabel9.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel9.setText("Hepatic encephalopathy");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 250, 210, 24);

        comboBoxScoreASc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Minimal", "Advanced" }));
        getContentPane().add(comboBoxScoreASc1);
        comboBoxScoreASc1.setBounds(390, 250, 190, 30);

        btnCalculate.setText("CALCULATE");
        getContentPane().add(btnCalculate);
        btnCalculate.setBounds(10, 330, 110, 30);

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(500, 330, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
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
        
        

    }//myInitComponentsMethodEnds

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> comboBoxScoreASc;
    private javax.swing.JComboBox<String> comboBoxScoreASc1;
    private javax.swing.JComboBox<String> comboBoxScoreGdlSA;
    private javax.swing.JComboBox<String> comboBoxScoreGlSA;
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
}
