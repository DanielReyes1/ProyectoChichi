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
 * @author samue
 */
public class VENDEDORdao {
    ConectarDB  cn = new ConectarDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean InsertarVendedor(VENDEDOR vd){
        String sql = "INSERT INTO VENDEDOR (nombre, pass) VALUES (?,?)";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, vd.getNombre());
            ps.setString(2, vd.getPassword());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Fue insertado exitosamente!");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public ArrayList ListarVendedor(){
        ArrayList<VENDEDOR> lista = new ArrayList();
        String sql = "SELECT * FROM VENDEDOR";
        try{
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                VENDEDOR vd = new VENDEDOR();
                vd.setId(rs.getInt("id"));
                vd.setNombre(rs.getString("nombre"));
                vd.setPassword(rs.getString("pass"));
                lista.add(vd);
            }
        }catch (SQLException e){
            
        }
        return lista;
    }
    
    public boolean EliminarVendedor(int id) throws SQLException{
        String sql = "DELETE FROM VENDEDOR WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Fue eliminado exitosamente!");
            return true;
        }catch (SQLException e){
            return false;
        }finally{
            con.close();
        }
    }
    
    public boolean ModificarVendedor(VENDEDOR vd){
        String sql = "UPDATE VENDEDOR SET nombre=?, pass=? WHERE id=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, vd.getNombre());
            ps.setString(2, vd.getPassword());
            ps.setInt(3, vd.getId());
            JOptionPane.showMessageDialog(null, "Fue modificado exitosamente!");
            ps.execute();
            return true;
        }catch(SQLException e){
            return false;
        }
    }
}
