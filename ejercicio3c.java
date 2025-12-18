/*Leer numeros hasta que se introduzca un 0. para cada uno indicar si es par o impar */

import javax.swing.JOptionPane;

public class ejercicio3c {

public static void main (String [] args){
int num;
num=Integer.parseInt(JOptionPane.showInputDialog("Dime un numero"));

while (num !=0) {
    int mod;
    mod=num%2;    
    if (mod!=0){
    JOptionPane.showMessageDialog(null, "Tu numero es impar");
    }
    else {
        JOptionPane.showMessageDialog(null, "Tu numero es par");
 
    }
    num=Integer.parseInt(JOptionPane.showInputDialog("Dime otro numero"));
}
    
}

    
}
