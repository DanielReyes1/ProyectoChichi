/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodb;

import java.util.Date;

/**
 *
 * @author samue
 */
public class FACTURA {
    private int numero;
    private Date fecha;
    private double subtotal, isv, total;
    private int clienteId, tiendaId;

    public FACTURA() {
    }

    public FACTURA(int numero, Date fecha, double subtotal, double isv, double total, int clienteId, int tiendaId) {
        this.numero = numero;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.isv = isv;
        this.total = total;
        this.clienteId = clienteId;
        this.tiendaId = tiendaId;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIsv() {
        return isv;
    }

    public void setIsv(double isv) {
        this.isv = isv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getTiendaId() {
        return tiendaId;
    }

    public void setTiendaId(int tiendaId) {
        this.tiendaId = tiendaId;
    }
    
    
    
}
