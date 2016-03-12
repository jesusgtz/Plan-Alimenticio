package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connect {
	
    private final String host;
	private final String dbname;
	private final String username;
    private final String password;
    private Connection conn;

	public Connect() {
		this.host = "jdbc:mysql://localhost:3306/";
		this.dbname = "db_planalimenticio";
		this.username = "root";
		this.password = "";
		this.conn = null;
	}
 
    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(this.host, this.username, this.password);
            System.out.println("Conexion exitosa a base de datos...");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return conn;
    }
	
	public boolean closeConnection() {
		try {
			this.conn.close();
			return true;
		} catch (SQLException ex) {
			System.out.println("Error: No se puede cerrar la conexion a la base de datos. " + ex.getMessage());
		}
		return false;
	}
			
}
