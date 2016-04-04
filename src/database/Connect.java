package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Connect {
	
    private final String host;
    private final String dbname;
    private final String username;
    private final String password;
    private Connection conn;
    private Statement stm;

    public Connect() {
        this.host = "jdbc:mysql://localhost:3306/";
        this.dbname = "DBPA";
        this.username = "root";
        this.password = "";
        this.conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(this.host + this.dbname, 
                    this.username, this.password);
            this.stm = conn.createStatement();
            System.out.println("Conexion exitosa a base de datos...");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falla en la conexion: " + 
                    ex.getMessage());
        }
    }

    public ResultSet Select(String query) {
        ResultSet results = null;
        try {
            if(!this.conn.isClosed()) results = this.stm.executeQuery(query);
            else System.out.println("No se pudo conectar.. :(");
        } catch (SQLException er) {
            System.out.println("Error: " + er.getMessage());
        }
        return results;
    }
    
    public boolean isClosed() {
        try {
            return this.conn.isClosed();
        } catch (SQLException er) {
            System.out.println("isClosed(): " + er.getMessage());
        }
        return false;
    }

    public boolean closeConnection() throws SQLException {
        try {
            this.conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: No se puede cerrar la conexion a la base "
                    + "de datos. " + ex.getMessage());
        }
        return false;
    }
}
