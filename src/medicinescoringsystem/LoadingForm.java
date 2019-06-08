package medicinescoringsystem;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class LoadingForm extends javax.swing.JFrame {

    public LoadingForm() {
        initComponents();
        MyInitComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadingProgressBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        loadingProgressBar.setForeground(javax.swing.UIManager.getDefaults().getColor("TextPane.selectionBackground"));
        loadingProgressBar.setStringPainted(true);
        getContentPane().add(loadingProgressBar);
        loadingProgressBar.setBounds(210, 190, 210, 25);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Loading . . . . . . . .");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 150, 210, 40);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        jLabel3.setText("Medicine Scoring System");
        jLabel3.setBorder(null);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 90, 430, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loadingImage.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 400));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MyInitComponents() {

        setTitle("Medicine Scoring System - MSS");
        setSize(600, 430);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        for (int i = 0; i <= 100; i+=5) {
            final int currentValue = i;
            try {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        loadingProgressBar.setValue(currentValue);
                    }
                });
                java.lang.Thread.sleep(100);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }//forEnds
        
        dispose();
        
    }//MyInitComponentsEnds

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar loadingProgressBar;
    // End of variables declaration//GEN-END:variables
}//classEnds
