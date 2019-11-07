import java.sql.*;

public class Conexion {
    public Connection conectar() {
        Connection connection = null;
        if (connection != null) {
            return;
        }
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres"
        String password = "root";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Conectando a la BD...");
            }
        } catch (Exception e) {
            System.out.println("Error al conectar");
        }
        return connection;
    }
}
