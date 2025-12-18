/*Pedir numeros y parar hasta que se introdusca 0 y sacar la media */

import javax.swing.JOptionPane;

public class ejercicio7c {
    public static void main (String []args){

int num,contador=0,res=0;
float res1;



do {
    num=Integer.parseInt(JOptionPane.showInputDialog(null,"Dime numeros"));
    res+=num;
if (num==0 || num<0){break;}
contador++;
}while (num>0);
res1=(float)res/contador;
JOptionPane.showMessageDialog(null,"La media  es "+res1);
    }
}
