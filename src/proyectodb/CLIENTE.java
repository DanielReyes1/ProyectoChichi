/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodb;

/**
 *
 * @author samue
 */
public class CLIENTE {
    private int id;
    private String nombre, correoElectronico, pass;

    public CLIENTE() {
    }

    public CLIENTE(int id, String nombre, String correoElectronico, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.pass = pass;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correo) {
        this.correoElectronico = correo;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String password) {
        this.pass = password;
    }
    
    
}
