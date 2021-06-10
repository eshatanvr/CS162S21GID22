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
public class Admin {
     public Admin(String email,String pass) {
       
    }
    public static void main ()
    {
        try{
      Class.forName("com.mysql.cj.jdbc.Driver"); 
       Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/quiz_data","root","Es_20022002 kh");  
        //here quiz_data is database name, root is username and password  
        Statement stmt=con.createStatement();  
        
        ResultSet rs=stmt.executeQuery("insert into quiz_data.questions"+"values (1,Which one is the question mark?,b)");
        rs=stmt.executeQuery("select * from questions");
        System.out.println(rs);
        while(rs.next())  
        System.out.println(rs.getString(1)+"  "+rs.getString(2));  
        con.close();  
    }catch (Exception ex)
    {
        System.out.println(" no ");
    } 
   
    }
}
