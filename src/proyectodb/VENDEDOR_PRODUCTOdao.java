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
public class VENDEDOR_PRODUCTOdao {
    ConectarDB  cn = new ConectarDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean InsertarVendedor_Producto(int id, String upc){
        String sql = "INSERT INTO VENDEDOR_PRODUCTO (vendedor_id, producto_upc) VALUES (?,?)";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, upc);
            ps.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public ArrayList ListarVendedor_Producto(){
        ArrayList<VENDEDOR_PRODUCTO> lista = new ArrayList();
        String sql = "SELECT * FROM VENDEDOR_PRODUCTO";
        try{
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                VENDEDOR_PRODUCTO vp = new VENDEDOR_PRODUCTO();
                vp.setVendedor_id(rs.getInt("vendedor_id"));
                vp.setProducto_id(rs.getString("producto_id"));
                lista.add(vp);
            }
        }catch (SQLException e){
            
        }
        return lista;
    }
}
