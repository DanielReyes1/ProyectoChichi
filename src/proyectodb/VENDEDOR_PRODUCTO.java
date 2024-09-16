/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodb;

/**
 *
 * @author samue
 */
public class VENDEDOR_PRODUCTO {
    private int vendedor_id;
    private String producto_id;

    public VENDEDOR_PRODUCTO() {
    }

    public VENDEDOR_PRODUCTO(int vendedor_id, String producto_id) {
        this.vendedor_id = vendedor_id;
        this.producto_id = producto_id;
    }

    public int getVendedor_id() {
        return vendedor_id;
    }

    public void setVendedor_id(int vendedor_id) {
        this.vendedor_id = vendedor_id;
    }

    public String getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(String producto_id) {
        this.producto_id = producto_id;
    }
    
    
}
