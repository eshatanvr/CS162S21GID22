/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_final;

import java.sql.*;

/**
 *
 * @author PCC
 */
public class q_DB {
     public static void main(String name)
    {
    try{
      Class.forName("com.mysql.cj.jdbc.Driver"); 
       Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/quiz_data","root","Es_20022002 kh");  
        //here quiz_data is database name, root is username and Es_20022002 kh is password  
        Statement stmt=con.createStatement(); 
        int id=0;
        sub_DB obj= new sub_DB();
       // obj.getID();
        ResultSet rs=stmt.executeQuery("select * from questions"); 
        while(rs.next())  
        System.out.println(rs.getString(1)+"  "+rs.getString(2));
//         while(rs.next()) 
//         {
//             if(rs.getString(2).equals(name))
//             {
//                 id=Integer.parseInt(rs.getString(1));
//                 break;
//             }
//         }
    }catch (Exception ex)
    {
        System.out.println(" no ");
    } 
    }   
}
