/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcaplication;

import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class JDBCAplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("carga EXITOSA");
            String url = "jdbc:mysql://localhost/itse?user=root";
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Carga realizada");
            Statement st = conn.createStatement();
            st.execute("insert into " 
                    + "practica2(id, Matricula, Nombre, Grupo)" 
                    + "values(1,'150204031', 'Judith', 'Isma4')");
            conn.close();
        } catch (ClassNotFoundException ex) {

            System.out.println("Error:controlador");

            System.exit(1);

        } catch (SQLException ex) {

            System.out.println("Error; conexion");
            ex.printStackTrace();

        }

    }
}

