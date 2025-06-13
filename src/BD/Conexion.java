
package BD;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Conexion {
    private static Conexion instance = null;
    
    private static Connection con;
    
    private String driver="com.mysql.jdbc.Driver";
    private String cadCon="jdbc:mysql://127.0.0.1:3306/Integrador?useUnicode=true&characterEncoding=utf-8";
    private String usuario="root";
    private String contrasena="";
    
    public Conexion(){
        try{
            Class.forName(driver);
        con=DriverManager.getConnection(cadCon,usuario,contrasena);
        JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Conexion rechazada\nTipo: "+e.getMessage());
        }
    }
    public synchronized static Conexion newInstance() {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }
    //Metodo para retornar la instancia de la conexion creada
    public Connection getConnection(){
    return con;
    }

    public void close() {
        instance=null;
    }
}



// Base De Datos