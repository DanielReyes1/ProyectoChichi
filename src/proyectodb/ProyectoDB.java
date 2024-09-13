
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
        ConectarDB conexion = new ConectarDB();
        conexion.conectar();
    }
    
}
