/*hacer un programa que haga el factorial de un numero */

import javax.swing.JOptionPane;

public class ejercicio12c {
    public static void main (String []args){

int n;
long num=1;


n=Integer.parseInt(JOptionPane.showInputDialog("Dime un numero para su factorial"));
while (n!=0){
num*=n;
n--;
}
if (n<= 0){
    System.out.println("error");

JOptionPane.showMessageDialog(null, num);

}}
}



    




    

