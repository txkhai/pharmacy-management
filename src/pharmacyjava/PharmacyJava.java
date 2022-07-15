/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyjava;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KhaiTran
 */
public class PharmacyJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Splash Mysplash = new Splash();
        Mysplash.setVisible(true);       
        
        for(int i = 0; i <= 100; i++){
            try {
                Thread.sleep(40);
                Mysplash.MyProgress.setValue(i);
                Mysplash.Percentage.setText(Integer.toString(i)+"%");
            } catch (InterruptedException ex) {
                Logger.getLogger(PharmacyJava.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        new Login().setVisible(true);
        Mysplash.dispose();
    }
    
}
