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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadingForm().setVisible(true);
            }
        });

    }//mainEnds

}//classMedicineScoringSystemEnds