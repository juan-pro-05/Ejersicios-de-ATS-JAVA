/*pedir numeros y mostrar de mayor a menor
 */

import javax.swing.JOptionPane;

public class ejercicio8c {
    public static void main (String []args){

int num,num2;


 

 do{
    num=Integer.parseInt(JOptionPane.showInputDialog("Dime numeros")); 
    num2=Integer.parseInt(JOptionPane.showInputDialog("Dime otro numero"));
    if (num>num2){
        System.out.println(num2+" "+num);
    }
    else{System.out.println(num+" "+num2);}
 }while (num<0);



    }
    
}
