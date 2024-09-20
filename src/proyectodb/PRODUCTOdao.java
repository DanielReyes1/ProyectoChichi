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
public class PRODUCTOdao {
    ConectarDB  cn = new ConectarDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean InsertarProductos(PRODUCTO pr){
        String sql = "INSERT INTO PRODUCTO (UPC, nombre, tamaño, embalaje, marca, tipo) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getUpc());
            ps.setString(2, pr.getNombre());
            ps.setString(3, pr.getTamanio());
            ps.setString(4, pr.getEmbalaje());
            ps.setString(5, pr.getMarca());
            ps.setString(6, pr.getTipo());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Fue insertado exitosamente!");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public ArrayList ListarProductos(){
        ArrayList<PRODUCTO> lista = new ArrayList();
        String sql = "SELECT * FROM PRODUCTO";
        try{
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                PRODUCTO pr = new PRODUCTO();
                pr.setUpc(rs.getString("UPC"));
                pr.setNombre(rs.getString("nombre"));
                pr.setTamanio(rs.getString("tamaño"));
                pr.setEmbalaje(rs.getString("embalaje"));
                pr.setMarca(rs.getString("marca"));
                pr.setTipo(rs.getString("tipo"));
                lista.add(pr);
            }
        }catch (SQLException e){
            
        }
        return lista;
    }
    
    public boolean EliminarProducto(String UPC) throws SQLException{
        String sql = "DELETE FROM PRODUCTO WHERE UPC = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, UPC);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Fue eliminado exitosamente!");
            return true;
        }catch (SQLException e){
            return false;
        }finally{
            con.close();
        }
    }
    
    public boolean ModificarProducto(PRODUCTO pr){
        String sql = "UPDATE PRODUCTO SET nombre=?, tamaño=?, embalaje=?, marca=?, tipo=? WHERE UPC=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getNombre());
            ps.setString(2, pr.getTamanio());
            ps.setString(3, pr.getEmbalaje());
            ps.setString(4, pr.getMarca());
            ps.setString(5, pr.getTipo());
            ps.setString(6, pr.getUpc());
            JOptionPane.showMessageDialog(null, "Fue modificado exitosamente!");
            ps.execute();
            return true;
        }catch(SQLException e){
            return false;
        }
    }
}
