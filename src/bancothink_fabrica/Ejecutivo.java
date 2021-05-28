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
public class Ejecutivo extends Empleado{
    
    private int codigoEjecutivo;
    
    public Ejecutivo(int codigoEjecutivo, int idEmpleado, String fechaIngresoEmpleado, String cargo, String rut, String nombre, String apellidoPaterno, String apellidoMaterno, int telefono, String direccionParticular, String direccionLaboral) {
        super(idEmpleado, fechaIngresoEmpleado, cargo, rut, nombre, apellidoPaterno, apellidoMaterno, telefono, direccionParticular, direccionLaboral);
        this.codigoEjecutivo = codigoEjecutivo;
    }

    public int getCodigoEjecutivo() {
        return codigoEjecutivo;
    }

    public void setCodigoEjecutivo(int codigoEjecutivo) {
        this.codigoEjecutivo = codigoEjecutivo;
    }
}
