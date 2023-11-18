
package Modelo;

/**
 *
 * @author Santiago Niño
 */
public class Modelo{
 
    float monto1=50000, monto2=70000, monto3=90000, monto4=120000, cambio1, cambio2, cambio3, cambio4, cambio5, precio, cantidad, canmax, canact, candes, nresultado1, nresultado2, otro, galon=8100;
 
    public Modelo() {
    
    }
    
    public float resta1 (){
        this.nresultado1 = this.canmax-this.canact;
        return this.nresultado1;   
    } 
    
    public float resta2 (){
        this.precio=this.candes*this.galon;
        return this.precio;
    }
   
    public float valor1 (){
        this.precio=this.nresultado1*this.galon;
        return this.precio;
    }
    
    public float valor3 (){
       this.cambio5=this.otro-this.precio;
       return this.cambio5;
    }
    
    public float valor4 (){
       this.cambio1=this.monto1-this.precio;
       return this.cambio1;
    }
    
    public float valor5 (){
       this.cambio2=this.monto2-this.precio;
       return this.cambio2;
    }
    
    public float valor6 (){
       this.cambio3=this.monto3-this.precio;
       return this.cambio3;
    }
    
    public float valor7 (){
       this.cambio4=this.monto4-this.precio;
       return this.cambio4;
    }
   
    public float getCanmax() {
        return canmax;
    }

    public float getCanact() {
        return canact;
    }

    public float getCandes() {
        return candes;
    }
   
    public float getNresultado1() {
        return nresultado1;
    }

    public float getNresultado2() {
        return nresultado2;
    }
    
    public float getMonto1() {
        return monto1;
    }

    public float getMonto2() {
        return monto2;
    }

    public float getMonto3() {
        return monto3;
    }

    public float getMonto4() {
        return monto4;
    }

    public float getCambio1() {
        return cambio1;
    }

    public float getCambio2() {
        return cambio2;
    }

    public float getCambio3() {
        return cambio3;
    }

    public float getCambio4() {
        return cambio4;
    }

    public float getCambio5() {
        return cambio5;
    }
    
    public float getPrecio() {
        return precio;
    }

    public float getCantidad() {
        return cantidad;
    }
   
    public float getOtro() {
        return otro;
    }
    
    public void setMonto1(float monto1) {
        this.monto1 = monto1;
    }

    public void setMonto2(float monto2) {
        this.monto2 = monto2;
    }

    public void setMonto3(float monto3) {
        this.monto3 = monto3;
    }

    public void setMonto4(float monto4) {
        this.monto4 = monto4;
    }

    public void setCambio1(float cambio1) {
        this.cambio1 = cambio1;
    }

    public void setCambio2(float cambio2) {
        this.cambio2 = cambio2;
    }

    public void setCambio3(float cambio3) {
        this.cambio3 = cambio3;
    }

    public void setCambio4(float cambio4) {
        this.cambio4 = cambio4;
    }

    public void setCambio5(float cambio5) {
        this.cambio5 = cambio5;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void setCanmax(float canmax) {
        this.canmax = canmax;
    }

    public void setCanact(float canact) {
        this.canact = canact;
    }

    public void setCandes(float candes) {
        this.candes = candes;
    }
   
    public void setNresultado1(float nresultado1) {
        this.nresultado1 = nresultado1;
    }

    public void setNresultado2(float nresultado2) {
        this.nresultado2 = nresultado2;
    }

    public void setOtro(float otro) {
        this.otro = otro;
    }
}