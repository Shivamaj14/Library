/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnect
{
    Connection conn;
    
    public static Connection ConnectDb()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDatabase","root","");
              return conn;     
        }
         catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                     return null;   
                }
       
    }
    
}
