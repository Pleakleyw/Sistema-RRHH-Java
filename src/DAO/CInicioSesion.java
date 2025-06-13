

package DAO;

import javax.swing.JOptionPane;


public class CInicioSesion {
    String idU;
    String contraseña;
    public boolean correcto=false;

    public CInicioSesion() {
    }

    public String getIdU() {
        return idU;
    }

    public void setIdU(String idU) {
        this.idU = idU;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
  public void ingresar(String idU,String contraseña){
    if(idU.equalsIgnoreCase("admin") && contraseña.equalsIgnoreCase("admin1902")){
        JOptionPane.showMessageDialog(null, "Bienvenido\nInicio de sesión correcto");
        this.correcto=true;
    }else{        
        JOptionPane.showMessageDialog(null, "ID de usuario o contraseña incorrecta, intente nuevamente");
        this.correcto=false;
    }
    } 
    
}





