/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author samue
 */
public class CLIENTESdao {
    ConectarDB  cn = new ConectarDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean InsertarCliente(CLIENTE cl){
        String sql = "INSERT INTO CLIENTE (nombre, correoElectronico, pass) VALUES (?,?,?)";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getNombre());
            ps.setString(2, cl.getCorreoElectronico());
            ps.setString(3, cl.getPassword());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Fue insertado exitosamente!");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public ArrayList ListarClientes(){
        ArrayList<CLIENTE> lista = new ArrayList();
        String sql = "SELECT * FROM CLIENTE";
        try{
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                CLIENTE cl = new CLIENTE();
                cl.setId(rs.getInt("id"));
                cl.setNombre(rs.getString("nombre"));
                cl.setCorreoElectronico(rs.getString("correoElectronico"));
                cl.setPassword(rs.getString("pass"));
                lista.add(cl);
            }
        }catch (SQLException e){
            
        }
        return lista;
    }
    
    public boolean EliminarCliente(int id) throws SQLException{
        String sql = "DELETE FROM CLIENTE WHERE id = ?";
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
    
    public boolean ModificarCliente(CLIENTE cl){
        String sql = "UPDATE CLIENTE SET nombre=?, correoElectronico=?, pass=? WHERE id=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getNombre());
            ps.setString(2, cl.getCorreoElectronico());
            ps.setString(3, cl.getPassword());
            ps.setInt(4, cl.getId());
            JOptionPane.showMessageDialog(null, "Fue modificado exitosamente!");
            ps.execute();
            return true;
        }catch(SQLException e){
            return false;
        }
    }
}
