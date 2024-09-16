/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodb;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gcano
 */
public class bitacoradao {
    ConectarDB cn = new ConectarDB();  
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
   


    public ArrayList<bitacora> ListarBitacora() {
        ArrayList<bitacora> lista = new ArrayList<>();
        String sql = "SELECT * FROM bitacora";
        try {
            con = cn.conectar(); 
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                bitacora bt = new bitacora();
                bt.setIdbitacora(rs.getInt("idbitacora"));
                bt.setUsuario(rs.getString("usuario"));
                bt.setOperacion(rs.getString("operacion"));
                bt.setDescripcion(rs.getString("descripcion"));
                bt.setFecha(rs.getTimestamp("fecha"));  
                lista.add(bt);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar: " + e.getMessage());
        }
        return lista;
    }
}
