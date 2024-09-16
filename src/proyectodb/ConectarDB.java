
package proyectodb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author alema
 */
public class ConectarDB {
    public Connection conectar() {
        Connection conexion = null;
        try {
            // cargar driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // establecer conexion
            //conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjava", "root", "");
            conexion = DriverManager.getConnection("jdbc:mysql://supermercado.cvup3yehanre.us-east-1.rds.amazonaws.com:3306/supermarket", "admin", "Loschichis2024$");
            //System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }
}

