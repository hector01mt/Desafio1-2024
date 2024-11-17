/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Cd;
import modelo.CdDao;
import vista.CdVista;

/**
 *
 * @author Hector Marquez
 */
public class CdControlador implements ActionListener{
    
    CdDao dao = new CdDao();
    Cd cd = new Cd();
    CdVista cdv = new CdVista();
    DefaultTableModel modelo=new DefaultTableModel();

    public CdControlador(CdVista v) {
        this.cdv = v;
        this.cdv.btnListar.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==cdv.btnListar) {
            listar(cdv.tabla);
        }
    }
    
    public void listar(JTable tabla){
        modelo=(DefaultTableModel)tabla.getModel();
        List<Cd>lista=dao.listar();
        Object[]object=new Object[6];
        for (int i = 0; i <lista.size() ; i++) {
            object[0]=lista.get(i).getTitulo();
            object[1]=lista.get(i).getArtista();
            object[0]=lista.get(i).getGenero();
            object[3]=lista.get(i).getDuracion();
            object[4]=lista.get(i).getNumeroCanciones();
            object[5]=lista.get(i).getUnidadesDisponibles();
            modelo.addRow(object); 
        }
        cdv.tabla.setModel(modelo);
    }
    
    
    
    
}
