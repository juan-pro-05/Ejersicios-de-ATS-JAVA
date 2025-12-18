/*Pedir dos numeros y decir cual es el meyor o si son iguales */

import javax.swing.JOptionPane;

public class ejercicio2 {
    public static void main (String []args){

int num1,num2;

num1=Integer.parseInt(JOptionPane.showInputDialog("Dime el numero 1"));
num2=Integer.parseInt(JOptionPane.showInputDialog("Dime el numero 2"));

if (num1>num2) {
    JOptionPane.showMessageDialog(null, "El numero "+num1+" es meyor que numero "+num2);
}
if(num1<num2){
    JOptionPane.showMessageDialog(null, "El numero "+num2+ " es mayor que "+num1);
}
if(num1==num2){
    JOptionPane.showMessageDialog(null, "El numero "+num1+" es igual que numero "+num2);
}
    }
    
}
