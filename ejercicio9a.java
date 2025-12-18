/*Ejercicio 9: Crear un programa que lea por
teclado una tabla de 10 números enteros y la
desplace una posición hacia abajo: el primero
pasa a ser el segundo, el segundo pasa a ser el
tercero y así sucesivamente. EI último pasa a ser
el primero. */

import java.util.Scanner;

public class ejercicio9a {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] A= new int[10];
        
         for (int i=0;i<10;i++){
            System.out.println("Dime el valor "+(i+1)+" de la tabla ");
            A[i]=entrada.nextInt();        }

          
int ult=A[9];

 for (int a=8 ;a>=0;a--){
            A[a+1]=A[a];
        }
        
A[0]=ult;


for (int f:A){
    System.out.print("  "+f);
}

 entrada.close();   }
    
}
