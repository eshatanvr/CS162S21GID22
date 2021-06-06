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
public class database {
    public static void data ()
{
    try{
      Class.forName("com.mysql.cj.jdbc.Driver"); 
       Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/quiz_data","root","Es_20022002 kh");  
        //here quiz_data is database name, root is username and password  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from user"); 
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
