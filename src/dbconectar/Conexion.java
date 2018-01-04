/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    

    private static final String CONN = "jdbc:mysql://localhost/botanasplebes";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public static Connection conectar() throws SQLException{
        
         return DriverManager.getConnection(CONN, USERNAME, PASSWORD);
    
    }
    
    
}
