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
public class Solicitud {
    
    public int idSolicitud;
    public int montoSolicitado;
    public int cuotasSolicitadas;
    public String fechaSolicitud;
    
    
    public Solicitud(int idSolicitud, int montoSolicitado, int cuotasSolicitadas, String fechaSolicitud) {
        this.idSolicitud = idSolicitud;
        this.montoSolicitado = montoSolicitado;
        this.cuotasSolicitadas = cuotasSolicitadas;
        this.fechaSolicitud = fechaSolicitud;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(int montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public int getCuotasSolicitadas() {
        return cuotasSolicitadas;
    }

    public void setCuotasSolicitadas(int cuotasSolicitadas) {
        this.cuotasSolicitadas = cuotasSolicitadas;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
}
