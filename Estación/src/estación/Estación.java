
package estación;
import Modelo.Modelo;
import Controlador.Controlador;
import Vista.Vista;
import Vista.Factura;
import Contador.contador;

/**
 *
 * @author Santiago Niño
 */
public class Estación {

    public static void main(String[] args) {
        Modelo mod= new Modelo();
        Vista view = new Vista ();
        contador conta = new contador ();
        Factura receipt = new Factura ();
        Controlador contro= new Controlador (view,mod,receipt,conta);
        contro.iniciar();
        view.setVisible(true);
    }   
}