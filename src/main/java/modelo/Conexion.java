/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hector Marquez
 */
public class Conexion {
    
    Connection con;
    public Connection getConnection(){
        String url="jdbc:mysql://localhost:3306/mediateca";
        String user="root";
        String pass="juice777";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,user,pass);


        } catch (Exception e){

        }
        return con;
    }
    
}
