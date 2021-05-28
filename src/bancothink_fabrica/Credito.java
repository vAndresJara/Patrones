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
public class Credito {
    
    public int idCredito;
    public String fechaCredito;
    public int monto;
    public String rutCliente;
    Icreditos tipoCredito;
    
    
    public Credito(int idCredito, String fechaCredito, int monto, String rutCliente) {
        this.idCredito = idCredito;
        this.fechaCredito = fechaCredito;
        this.monto = monto;
        this.rutCliente = rutCliente;
    }

    Credito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdCredito() {
        return idCredito;
    }

    public void setIdCredito(int idCredito) {
        this.idCredito = idCredito;
    }

    public String getFechaCredito() {
        return fechaCredito;
    }

    public void setFechaCredito(String fechaCredito) {
        this.fechaCredito = fechaCredito;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }
    
    public Icreditos TipoCredi (String tipo)
    {
        if (tipo.equals("consumo")) {
            
             tipoCredito =  new CreditoConsumo();
            
        }else if (tipo.equals("hipotecario")) {
            
            tipoCredito = new CreditoHipotecario();
            
        }else if (tipo.equals("automotriz")) {
            
             tipoCredito =  new CreditoAutomotriz();   
        }
        return 
                tipoCredito;
        
    }
}
