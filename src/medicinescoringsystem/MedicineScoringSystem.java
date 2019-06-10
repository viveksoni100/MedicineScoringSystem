/*
NAME : Vivek B Barbhaya
ROLL : 32
CLASS : MCA-4
SUB : DAD
 */

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicinescoringsystem;

/**
 *
 * @author nrs
 */
public class MedicineScoringSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

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

        new LoadingForm();
        new Screen_2();

    }//mainEnds

}//classMedicineScoringSystemEnds
