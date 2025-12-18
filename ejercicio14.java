import javax.swing.JOptionPane;

public class ejercicio14 {
    public static void main (String []args){

int accion;
double libra,kilo,gramoI;

accion=Integer.parseInt(JOptionPane.showInputDialog(null, "Dime que quieres convertir\n"
+"1. concertir libras a kilos\n"
+"2. convertir kilos a libras\n"
+"3. convertir kilo a gramo\n"
+"4. convertir libra a gramo\n"
+"5. convertir gramos a kilos\n"
+"6. convertir gramos a libras\n"));


switch (accion) {
    case 1: libra=Double.parseDouble(JOptionPane.showInputDialog("Indique la cantidad de libras"));
            double kilos=0.453592,total;
            total=libra*kilos;
            JOptionPane.showMessageDialog(null,"El resultado es "+total);  
        break;
    case 2: kilo=Double.parseDouble(JOptionPane.showInputDialog("Indique la cantidad en kilos"));
            double libras=2.20462,total2;
            total2=kilo*libras;
            JOptionPane.showMessageDialog(null, "El resultado es "+total2);
        break;
    case 3: kilo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en kilos"));
            double gramo=1000,total3;
            total3=gramo*kilo;
            JOptionPane.showMessageDialog(null, "El resultado es "+total3);
            break;
    case 4:libra=Double.parseDouble(JOptionPane.showInputDialog("Indique la cantidad en libras"));
           double gramo1=1000,total4;
           total4=gramo1*libra;
           JOptionPane.showMessageDialog(null,"El resultado es "+total4);
        break;
    case 5:gramoI=Double.parseDouble(JOptionPane.showInputDialog(null, "Indique la cantidad en gramos"));
           double kilog=0.001,total5;
           total5=kilog*gramoI;
           JOptionPane.showMessageDialog(null, "El resultado es "+total5);
        break;
    case 6:gramoI=Double.parseDouble(JOptionPane.showInputDialog("Indique la cantidad en gramos"));
           double librag=0.00220462,total6;
           total6=gramoI*librag;
           JOptionPane.showMessageDialog(null, "El resultado es "+total6);

        break;

    default:JOptionPane.showMessageDialog(null, "Dicha accion es existe");
        break;
}








    }
}
