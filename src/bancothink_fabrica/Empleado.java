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
public class Empleado extends Persona{
    
    private int idEmpleado;
    private String fechaIngresoEmpleado;
    private String cargo;
    
    public Empleado(int idEmpleado, String fechaIngresoEmpleado, String cargo, String rut, String nombre, String apellidoPaterno, String apellidoMaterno, int telefono, String direccionParticular, String direccionLaboral) {
        super(rut, nombre, apellidoPaterno, apellidoMaterno, telefono, direccionParticular, direccionLaboral);
        this.idEmpleado = idEmpleado;
        this.fechaIngresoEmpleado = fechaIngresoEmpleado;
        this.cargo = cargo;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getFechaIngresoEmpleado() {
        return fechaIngresoEmpleado;
    }

    public void setFechaIngresoEmpleado(String fechaIngresoEmpleado) {
        this.fechaIngresoEmpleado = fechaIngresoEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
