/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import GUI_final.HomePage;
import GUI_final.adminLoginGUI;
import GUI_final.database;

/**
 *
 * @author Umar
 */
public class User {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HomePage nm=new HomePage();
        nm.setVisible(true);
        database.main();
       
    }
    
}
