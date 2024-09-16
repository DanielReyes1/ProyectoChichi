package proyectodb;

/**
 *
 * @author alema
 */
public class ProyectoDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ConectarDB conexion = new ConectarDB();
            conexion.conectar();
            login log = new login();
            log.setVisible(true);
        } catch (Exception e) {

        }
    }

}
