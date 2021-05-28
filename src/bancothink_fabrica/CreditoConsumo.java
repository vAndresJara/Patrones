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
public class CreditoConsumo implements Icreditos{
    
    public CreditoConsumo() {
    }

    
    @Override
    public void GetCredito() {
        
        System.out.println("Este es un credito de consumo");
        
    }
}
