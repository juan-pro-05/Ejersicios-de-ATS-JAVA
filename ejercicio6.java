/*hacer un programa que tome dos numeros y diga si son pares o inpares */

import javax.swing.JOptionPane;

public class ejercicio6 {
    public static void main (String []args){

int num1,num2;

num1=Integer.parseInt(JOptionPane.showInputDialog("dame el primer numero"));

num2=Integer.parseInt(JOptionPane.showInputDialog("dame el segundo numero"));



if (num1% 2 ==0 && num2% 2 ==0) {

    JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
    
}
if (num1% 2 ==0 && num2% 2 != 0){

    JOptionPane.showMessageDialog(null, "El numero "+num1+" es par y el numero "+num2+" es inpar");
}
if (num1% 2 !=0 && num2% 2 == 0){

    JOptionPane.showMessageDialog(null, "El numero "+num2+" es par y el numero "+num1+" es inpar");
}

if (num1% 2 !=0 && num2% 2 != 0){

    JOptionPane.showMessageDialog(null, "Ambos numeros son inpares");
}


    }
}
