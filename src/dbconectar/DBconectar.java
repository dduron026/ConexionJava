/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconectar;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author CECILIA
 */
public class DBconectar {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    
    
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection con = null;
        
        try {
            
            con = Conexion.conectar();
            System.out.println("conectado");
        } catch (SQLException e) {
            System.err.print(e);
        }
        finally{
            if(con != null){
                con.close();
            }
        }
    }
    
}
