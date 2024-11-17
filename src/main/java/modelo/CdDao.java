/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hector Marquez
 */
public class CdDao {
    
    Conexion conectar = new Conexion();
    Connection con; 
    PreparedStatement ps;
    ResultSet rs; 
    
    public List listar(){
        
        List<Cd>datos=new ArrayList<>();
        String sql="select * from Cd";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) { 
                Cd cd=new Cd();
                cd.setTitulo(rs.getString(1));
                cd.setArtista(rs.getString(2));
                cd.setGenero(rs.getString(3));
                cd.setDuracion(rs.getString(4));
                cd.setNumeroCanciones(rs.getString(5));
                cd.setUnidadesDisponibles(rs.getString(6));
                datos.add(cd);              
            }
            
        } catch (Exception e) {
        }
        return datos;
    }
    
    
    
    
    
}
