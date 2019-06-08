package medicinescoringsystem;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Screen_2 extends javax.swing.JFrame {

    public Screen_2() {

        initComponents();
        myInitComponents();
        fetchingDataFromDbToJComboBox();
        openingSelectedScore();

    }//constructorEnds

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbScoresAll = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cbScoresAll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        getContentPane().add(cbScoresAll);
        cbScoresAll.setBounds(240, 10, 380, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/allScoreDisplayImage.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myInitComponents() {

        setTitle("Medicine Scoring System - MSS");
        setSize(626, 352);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }//myInitComponentsMethodEnds

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbScoresAll;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void fetchingDataFromDbToJComboBox() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/medicine_scoring_system_db";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");
            Statement stmnt = con.createStatement();
            String selectQry = "select name from tbl_mss;";
            ResultSet rs = stmnt.executeQuery(selectQry);
            while (rs.next()) {

                cbScoresAll.addItem(rs.getString("name"));

            }//whileEnds

        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }//fetchingDataFromDdToJComboBoxEnds

    private void openingSelectedScore() {

        cbScoresAll.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {

                if (ie.getStateChange() == ItemEvent.SELECTED) {
                    if (cbScoresAll.getSelectedItem().equals("CHILD_PUGH_CLASSIFICATION_OF_CIRRHOSIS")) {

                        new CHILD_PUGH_CLASSIFICATION_OF_CIRRHOSIS();

                    }

                    if (cbScoresAll.getSelectedItem().equals("DummyScore")) {

                        new DummyScore();

                    }
                }//outerIFEnds

            }
        });//cbScoresAllListenerEnds

    }//openingSelectedScoreEnds

}//classEnds
