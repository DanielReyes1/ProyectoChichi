/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodb;

import java.util.ArrayList;

/**
 *
 * @author samue
 */
public class TIENDA {
    private int id;
    private String nombre;
    private String ubicaciones, horario;

    public TIENDA() {
    }

    public TIENDA(int id, String nombre, String ubicaciones, String horario) {
        this.id = id;
        this.nombre = nombre;
        this.ubicaciones = ubicaciones;
        this.horario = horario;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(String ubicaciones) {
        this.ubicaciones = ubicaciones;
    }
    
    
    
}
