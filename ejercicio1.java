/*Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10 */

import javax.swing.JOptionPane;

public class ejercicio1 {

    public static void main (String []args ){

       int num;

       num=Integer.parseInt(JOptionPane.showInputDialog("Dime tu numero"));

       if (num%10 == 0){
         
          JOptionPane.showMessageDialog(null, "tu numero es multiplo de 10");

       }


       else {
         JOptionPane.showMessageDialog(null,"No es multiplo de 10");

       }



    }




}