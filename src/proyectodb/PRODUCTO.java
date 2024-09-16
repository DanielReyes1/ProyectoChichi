/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodb;

/**
 *
 * @author samue
 */
public class PRODUCTO {
    private String upc, nombre, tamanio, embalaje, marca, tipo;

    public PRODUCTO() {
    }

    public PRODUCTO(String upc, String nombre, String tamanio, String embalaje, String marca, String tipo) {
        this.upc = upc;
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.embalaje = embalaje;
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getEmbalaje() {
        return embalaje;
    }

    public void setEmbalaje(String embalaje) {
        this.embalaje = embalaje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
