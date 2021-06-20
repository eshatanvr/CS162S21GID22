/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.util.*;
import GUI_final.HomePage;
import GUI_final.adminLoginGUI;
import java.sql.*;
/**
 *
 * @author PCC
 */
public class Admin extends Questions{
    public List <Questions> Qlist= new ArrayList<>();
    
    public boolean AddQuestion(Questions s)
    {
        
        Qlist.add(s);
        return true;
    }
    
}
