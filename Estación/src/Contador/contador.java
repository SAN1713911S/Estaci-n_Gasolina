
package Contador;
import Vista.Vista;
import javax.swing.JOptionPane;
/**
 *
 * @author Santiago Niño
 */
public class contador extends javax.swing.JFrame implements Runnable {
   
    float a=0, b=0, j=0, i=0;
    Thread hilo1;
    
    public float ejecutar() {                                         
  
        a=Float.parseFloat(Vista.lblgasolina.getText());
        b=Float.parseFloat(Vista.lblprecio.getText());
        hilo1=new Thread(this);
        hilo1.start();
        setLocationRelativeTo(null);
        return(0);
    }
    @Override
    public void run() {
        Thread ct=Thread.currentThread();
        j=0;i=0;
        for(float i=810;i<=b;i=i+810)
        {
            j=(float) (j+0.1);
            Vista.lblprecio1.setText(String.valueOf(i));
            Vista.lblgasolina1.setText(String.valueOf(j));
            try 
            {
                Thread.sleep(200);
            }
            catch(InterruptedException e){}  
        } 
        JOptionPane.showMessageDialog(null,"Operación realizada");
    }    
}