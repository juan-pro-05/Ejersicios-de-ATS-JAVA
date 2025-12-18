/*Leer 5 numeros y guardarlos en un arreglo y mostrarlo enn  el mismo orden introducido */
import javax.swing.JOptionPane;

public class ejercicio1a {
    public static void main (String []args){

int num;


num=Integer.parseInt(JOptionPane.showInputDialog("Dime le valor de los numeros que va a introducir en un arreglo"));


int[] arreglo= new int [num];
for (int i=0;i<num;i++){
arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Dime el valor "+(i+1)+" de tu arreglo"));
}
for (int i:arreglo){

    System.out.println("El numero "+i+" fueron "+num);
}






    }
    
}
