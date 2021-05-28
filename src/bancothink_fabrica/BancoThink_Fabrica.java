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
public class BancoThink_Fabrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String credito = "automotriz";
        
        Credito ven = new Credito();
        
        Icreditos producto = ven.TipoCredi(credito);
        
        producto.GetCredito();
    }
    
}
