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
public class sub_DB {
    public static int getID(int ID)
    {
        return ID;
    }
    public static void main(String name)
    {
    try{
      Class.forName("com.mysql.cj.jdbc.Driver"); 
       Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/mysql","root","Es_20022002 kh");  
        //here quiz_data is database name, root is username and password  
        Statement stmt=con.createStatement(); 
        int id=0;
        ResultSet rs=stmt.executeQuery("select * from subjects"); 
        while(rs.next())  
<<<<<<< Updated upstream
        System.out.println(rs.getString(1)+"  "+rs.getString(2));
//         while(rs.next()) 
//         {
//             if(rs.getString(2).equals(name))
//             {
//                 id=Integer.parseInt(rs.getString(1));
//                 getID(id);
//                 break;
//             }
//         }
=======
        System.out.println(rs.getInt(1)+"  "+rs.getString(2));
         while(rs.next()) 
         {
             if(rs.getString(2).equals(name))
             {
                 id=Integer.parseInt(rs.getString(1));
                 getID(id);
                 break;
             }
         }
>>>>>>> Stashed changes
    }catch (Exception ex)
    {
        System.out.println(" no ");
    } 
    }
}
