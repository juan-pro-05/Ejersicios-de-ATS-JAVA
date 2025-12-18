/*En una plaza se hace 20% de desccuento a los clientes cuya compra supere a $300
 * Cual sera la cantidad que pagara una perosona por su compra?
 */

import javax.swing.JOptionPane;

public class ejercicio4 {
    public static void main (String []args){

int pagoinicial;
float descuento=0.20f,pagofinal1,pagofianl2;
pagoinicial=Integer.parseInt(JOptionPane.showInputDialog("Cual es el total de el pago"));

if (pagoinicial>=300){
    JOptionPane.showMessageDialog(null, "Felicidades tendra un descuento del 20%");
    pagofinal1=pagoinicial*descuento;
    pagofianl2=pagoinicial-pagofinal1;
    JOptionPane.showMessageDialog(null, "Su pago final es "+pagofianl2);
}
else{
    JOptionPane.showMessageDialog(null, "No tiene descuento :( su pago es de "+pagoinicial);
}

    }
    
}
