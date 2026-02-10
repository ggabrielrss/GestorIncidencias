import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionDB {

    private static final String RUTA_DB = "gestorIncidencias.db";

    public static Connection conectar() {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection("jdbc:sqlite:" + RUTA_DB);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver SQLite no encontrado: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la DB: " + e.getMessage());
        }
        return conn;
    }
}
