package planalimenticio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    public String usuarioDB = "root";
    public String passwordDB = "";
    public final String url = "jdbc:mysql://localhost:3306/db_planalimenticio";
    public Connection conectar = null;
    private String error = "";
 
    public Connection mconexion() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(url, usuarioDB, passwordDB);
            System.out.println("Conectado");
        } catch (ClassNotFoundException | SQLException ex) {
            error = ex.getMessage();
            JOptionPane.showMessageDialog(null, error);
        }
        return conectar;
    }
}
