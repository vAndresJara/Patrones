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
public class Conexion {
    
    private String usuario;
    private String contrasena;
    private static Conexion conexBD;
    
    public Conexion (String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
        public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public static Conexion ConexionBD()
    {
        if(conexBD == null)
        {
            Conexion cbd = new Conexion("","");
            return conexBD;
        }
        else
        {
            return conexBD;
        }
    }
    
}
