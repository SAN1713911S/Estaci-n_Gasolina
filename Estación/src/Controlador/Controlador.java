
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Modelo;
import Vista.Factura;
import Vista.Vista;
import Contador.contador;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Niño
 */
public class Controlador implements ActionListener{
    private Vista  view; 
    private Modelo model;
    private Factura receipt;
    private contador conta;
    
    public Controlador(Vista view, Modelo modelo, Factura receipt, contador conta) {
        this.view = view;
        this.model = modelo;
        this.receipt = receipt;
        this.conta = conta;
        
        this.view.btnsurtir.addActionListener(this);
        this.view.btnvalidar.addActionListener(this);
        this.view.btnfinalizar.addActionListener(this);
        this.view.btnfull.addActionListener(this);
        this.view.btnotro.addActionListener(this);
        this.view.btn50000.addActionListener(this);
        this.view.btn70000.addActionListener(this);
        this.view.btn90000.addActionListener(this);
        this.view.btn120000.addActionListener(this);
        this.view.jrbefectivo.addActionListener(this);
        this.view.jrbtargeta.addActionListener(this);
    }
    public void iniciar (){
        view.setTitle("Bienvenido a Globe Oil");
        view.setLocationRelativeTo(null);
    }
    public void actionPerformed (ActionEvent e){  
        if (e.getSource()== view.btnvalidar)
        {
            String val1, val2, val3;
            float  l, k, m;
            val1=view.txtmax.getText();
            val2=view.txtactual.getText();
            val3=view.txtdesea.getText();
            l=Float.parseFloat(val1);
            k=Float.parseFloat(val2);
            m=Float.parseFloat(val3);
                
            if (l>0 && k>=0 && m>0)
            {
                if(k>l || m>l)
                {
                    JOptionPane.showMessageDialog(null,"Error, vuelva a ingresar los datos");
                    view.txtactual.setText("0.0");
                    view.txtmax.setText("0.0");
                    view.txtdesea.setText("0.0");
                }
                else
                {
                    view.lblplacas.setEnabled(false);
                    view.btnvalidar.setEnabled(false);
                    view.btnfull.setEnabled(false);
                    model.setCandes(Float.parseFloat(view.txtdesea.getText()));
                    view.txtdesea.setEnabled(false);
                    view.txtmax.setEnabled(false);
                    view.txtactual.setEnabled(false);
                    view.txtotro.setEnabled(true);
                    model.resta2();
                    view.lblgasolina.setText(String.valueOf(model.getCandes()));
                    view.lblprecio.setText(String.valueOf(model.getPrecio()));
                }    
            }                
            else if(l>0 && k>=0 && m==0)
            {
                model.setCanmax(Float.parseFloat(view.txtmax.getText()));
                model.setCanact(Float.parseFloat(view.txtactual.getText()));
                model.resta1();
                JOptionPane.showMessageDialog(null,"Operación realizada");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error, debe ingresar valores positivos");
                view.txtactual.setText("0.0");
                view.txtmax.setText("0.0");
                view.txtdesea.setText("0.0");
            }
        }
        if (e.getSource()== view.btnfull)
        { 
            String val1, val2, val3;
            float l = 0, k = 0, m = 0;
            val1=view.txtmax.getText();
            val2=view.txtactual.getText();
            val3=view.txtdesea.getText();
            l=Float.parseFloat(val1);
            k=Float.parseFloat(val2);
            m=Float.parseFloat(val3);
                               
            if(l>0 && k>=0 && m==0)
            {
                if(k>l)
                {
                    JOptionPane.showMessageDialog(null,"Error, vuelva a ingresar los datos");
                    view.txtactual.setText("0.0");
                    view.txtmax.setText("0.0");
                    view.txtdesea.setText("0.0");
                }
                else
                {
                    view.lblplacas.setEnabled(false);
                    view.btnfull.setEnabled(false);
                    view.btnvalidar.setEnabled(false);
                    model.setCanmax(Float.parseFloat(view.txtmax.getText()));
                    model.setCanact(Float.parseFloat(view.txtactual.getText()));
                    view.txtmax.setEnabled(false);
                    view.txtactual.setEnabled(false);
                    view.txtdesea.setEnabled(false);
                    view.txtotro.setEnabled(true);
                    model.resta1();
                    model.valor1();
                    view.lblgasolina.setText(String.valueOf(model.getNresultado1()));
                    view.lblprecio.setText(String.valueOf(model.getPrecio()));
                    JOptionPane.showMessageDialog(null,"Operación realizada");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error, debe ingresar valores positivos");
                view.txtactual.setText("0.0");
                view.txtmax.setText("0.0");
                view.txtdesea.setText("0.0");
            }
        }
        if (e.getSource()== view.btn50000)
        {
            view.btn50000.setEnabled(false);
            view.btn70000.setEnabled(false);
            view.btn90000.setEnabled(false);
            view.btn120000.setEnabled(false);
            view.btnotro.setEnabled(false);
            model.setPrecio(Float.parseFloat(view.lblprecio.getText()));
            model.valor4(); 
            float l;
            l=model.getCambio1();
            
            if(l<0)
            {
                JOptionPane.showMessageDialog(null,"Error, no tiene el dinero suficiente");
                view.btn50000.setEnabled(true);
                view.btn70000.setEnabled(true);
                view.btn90000.setEnabled(true);
                view.btn120000.setEnabled(true);
                view.btnotro.setEnabled(true);
                view.txtotro.setEnabled(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Su transacción fué exitosa");
                view.lblcambio.setText(String.valueOf(model.getCambio1()));
                view.lblrecibido.setText(String.valueOf(model.getMonto1()));
            }
        }
        if (e.getSource()== view.btn70000)
        {
            view.btn50000.setEnabled(false);
            view.btn70000.setEnabled(false);
            view.btn90000.setEnabled(false);
            view.btn120000.setEnabled(false);
            view.btnotro.setEnabled(false);
            model.setPrecio(Float.parseFloat(view.lblprecio.getText()));
            model.valor5();
            float l;
            l=model.getCambio2();
            
            if(l<0)
            {
                JOptionPane.showMessageDialog(null,"Error, no tiene el dinero suficiente");
                view.btn50000.setEnabled(true);
                view.btn70000.setEnabled(true);
                view.btn90000.setEnabled(true);
                view.btn120000.setEnabled(true);
                view.btnotro.setEnabled(true);
                view.txtotro.setEnabled(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Su transacción fué exitosa");
                view.lblcambio.setText(String.valueOf(model.getCambio2()));
                view.lblrecibido.setText(String.valueOf(model.getMonto2()));
            }
        }
        if (e.getSource()== view.btn90000)
        {
            view.btn50000.setEnabled(false);
            view.btn70000.setEnabled(false);
            view.btn90000.setEnabled(false);
            view.btn120000.setEnabled(false);
            view.btnotro.setEnabled(false);
            model.setPrecio(Float.parseFloat(view.lblprecio.getText()));
            model.valor6();
            float l;
            l=model.getCambio3();
            
            if(l<0)
            {
                JOptionPane.showMessageDialog(null,"Error, no tiene el dinero suficiente");
                view.btn50000.setEnabled(true);
                view.btn70000.setEnabled(true);
                view.btn90000.setEnabled(true);
                view.btn120000.setEnabled(true);
                view.btnotro.setEnabled(true);
                view.txtotro.setEnabled(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Su transacción fué exitosa");
                view.lblcambio.setText(String.valueOf(model.getCambio3()));
                view.lblrecibido.setText(String.valueOf(model.getMonto3()));
            }
        }
        if (e.getSource()== view.btn120000)
        {
            view.btn50000.setEnabled(false);
            view.btn70000.setEnabled(false);
            view.btn90000.setEnabled(false);
            view.btn120000.setEnabled(false);
            view.btnotro.setEnabled(false);
            model.setPrecio(Float.parseFloat(view.lblprecio.getText()));
            model.valor7();
            float l;
            l=model.getCambio4();
            
            if(l<0)
            {
                JOptionPane.showMessageDialog(null,"Error, no tiene el dinero suficiente");
                view.btn50000.setEnabled(true);
                view.btn70000.setEnabled(true);
                view.btn90000.setEnabled(true);
                view.btn120000.setEnabled(true);
                view.btnotro.setEnabled(true);
                view.txtotro.setEnabled(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Su transacción fué exitosa");
                view.lblcambio.setText(String.valueOf(model.getCambio4()));
                view.lblrecibido.setText(String.valueOf(model.getMonto4()));
            }
        }
        if (e.getSource()== view.btnotro)
        { 
            view.btn50000.setEnabled(false);
            view.btn70000.setEnabled(false);
            view.btn90000.setEnabled(false);
            view.btn120000.setEnabled(false);
            view.txtotro.setEnabled(false);
            String val;
            int l;
            val=view.txtotro.getText();
            l=Integer.parseInt(val);
                
            if (l>0)
            {
                model.setPrecio(Float.parseFloat(view.lblprecio.getText()));
                model.setOtro(Float.parseFloat(view.txtotro.getText()));
                view.txtotro.setEnabled(false);
                model.valor3();
                float m;
                m=model.getCambio5();
            
                if(m<0)
                {
                    JOptionPane.showMessageDialog(null,"Error, no tiene el dinero suficiente");
                    view.btn50000.setEnabled(true);
                    view.btn70000.setEnabled(true);
                    view.btn90000.setEnabled(true);
                    view.btn120000.setEnabled(true);
                    view.btnotro.setEnabled(true);
                    view.txtotro.setEnabled(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Su transacción fué exitosa");
                    view.lblcambio.setText(String.valueOf(model.getCambio5()));
                    view.lblrecibido.setText(String.valueOf(model.getOtro()));
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error, debe ingresar valores positivos");
            }
        }
        if (e.getSource()== view.jrbefectivo)
        {
            view.lblforma.setText(String.valueOf(view.jrbefectivo.getText()));
        }
        if (e.getSource()== view.jrbtargeta)
        {
            view.lblforma.setText(String.valueOf(view.jrbtargeta.getText()));
        }
        if (e.getSource()==view.btnsurtir)
        {
            conta.ejecutar();
            view.btnsurtir.setEnabled(false);
        }
        if (e.getSource()== view.btnfinalizar)
        {    
            new Factura().setVisible(true);
            
            Factura.lblplacas.setText(view.lblplacas.getText());
            Factura.lblcantidad.setText(view.lblgasolina.getText());
            Factura.lblforma.setText(view.lblforma.getText());
            Factura.lblvalor.setText(view.lblprecio.getText());
            Factura.lblcambio.setText(view.lblcambio.getText());
            Factura.lblrecibido.setText(view.lblrecibido.getText());
            
            view.lblplacas.setEnabled(true);
            view.txtdesea.setEnabled(true);
            view.txtmax.setEnabled(true);
            view.txtactual.setEnabled(true);
                    
            view.btnsurtir.setEnabled(true);
            view.btnvalidar.setEnabled(true);
            view.btnfinalizar.setEnabled(true);
            view.btnfull.setEnabled(true);
            view.btnotro.setEnabled(true);
            view.btn50000.setEnabled(true);
            view.btn70000.setEnabled(true);
            view.btn90000.setEnabled(true);
            view.btn120000.setEnabled(true);

            view.lblgasolina.setText("0.0 ");
            view.lblprecio.setText("0.0");
            view.lblplacas.setText(" ");
            view.txtactual.setText("0.0");
            view.txtmax.setText("0.0");
            view.txtdesea.setText("0");
            view.lblgasolina1.setText("0.0");
            view.lblprecio1.setText("0.0");
        }
    } 
}