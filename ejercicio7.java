/*pedir tres numeros y mostrarlos ordenados de mayor a menor */

import javax.swing.JOptionPane;

public class ejercicio7 {


    public static void main (String []args){

int num1,num2,num3;

num1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
num2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
num3=Integer.parseInt(JOptionPane.showInputDialog("Ingreasa el tercer numero"));

if (num1>num2 && num1>num3 && num2>num3) {
    JOptionPane.showMessageDialog(null, "El primer numero es "+num3+" el segundo numero "+num2+ " el tercer numero es "+num1 );
}
if(num2>num1 && num2>num3 && num1>num3){
JOptionPane.showMessageDialog(null, "El primer numero es "+num3+" el segundo numero es "+num1+" el tercer numero es "+num2);

}
if (num3>num1 && num3>num2 && num2>num1){
    JOptionPane.showMessageDialog(null, "El primer numero es "+num1+" el segundo numero es "+num2+" el tercer numero es "+num3);
}
if (num1==num2 && num2==num3){
    JOptionPane.showMessageDialog(null, "Todos los numeros son iguales");
}
    }




}
