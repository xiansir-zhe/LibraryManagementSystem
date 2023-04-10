/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

/**
 *
 * @author xian_w
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con = null;
    
    public static Connection getConnection(){
        String URL = "jdbc:mysql://localhost:3306/library_ms";
        String USER = "root";
        String PWD = "Renaissance789";
        try{
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection(URL,USER,PWD);
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
      
    }
    
}
