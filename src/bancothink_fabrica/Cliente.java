/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancothink_fabrica;

/**
 *
 * @author Cristian Matus
 */
public class Cliente extends Persona{
    
    private int idCliente;
    private String fechaIngreso;
    private int sueldo;
    
    public Cliente(int idCliente, String fechaIngreso, int sueldo, String rut, String nombre, String apellidoPaterno, String apellidoMaterno, int telefono, String direccionParticular, String direccionLaboral) {
        super(rut, nombre, apellidoPaterno, apellidoMaterno, telefono, direccionParticular, direccionLaboral);
        this.idCliente = idCliente;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
