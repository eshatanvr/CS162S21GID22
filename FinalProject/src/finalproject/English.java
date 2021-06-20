/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.sql.*;
/**
 *
 * @author PCC
 */
public class English {

    public English(String h,String a) {
        this.n = h;
        this.b=a;
    }
    
    public static String n;
    public static String b;
    public static void main()
    {
       try{
      Class.forName("com.mysql.cj.jdbc.Driver"); 
       Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/quiz_data","root","Es_20022002 kh");  
        //here quiz_data is database name, root is username and password  
        Statement stmt=con.createStatement(); 
        int id=1;
        String sql= "INSERT INTO questions VALUES ("+id+",'"+n+"','"+b+"')";
       stmt.executeUpdate(sql);
       id=id+1;
        ResultSet rs=stmt.executeQuery("select * from questions"); 
        while(rs.next())  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
    }catch (Exception ex)
    {
        System.out.println(" no ");
    } 
    }
}
