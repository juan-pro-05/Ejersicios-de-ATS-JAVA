import javax.swing.JOptionPane;

public class ejercici05 {

public static void main (String []args){

int horastrabajadas;
float pago;

horastrabajadas=Integer.parseInt(JOptionPane.showInputDialog("Dime las horas trabajadas"));


if (horastrabajadas<40){

pago=horastrabajadas*16;
JOptionPane.showMessageDialog(null, "El pago es "+pago);
}
else{

    pago=40*16+((horastrabajadas-40)*20);
    JOptionPane.showMessageDialog(null, "El pago es "+pago);
}






}
    
}
