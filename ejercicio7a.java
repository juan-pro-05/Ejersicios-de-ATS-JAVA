/*Ejercicio 7: Leer por teclado una serie
de 10 nümeros enteros. La aplicaciön
debe indicarnos si los nümeros estån
forma ordenados creciente, decreciente, o si estån desordenados. */

import java.util.Scanner;

public class ejercicio7a {
    public static void main(String[] args) {

int[] A= new int[10];

Scanner entrada = new Scanner(System.in);
for (int i=0;i<10;i++){

    System.out.println("Digite el valor "+(i+1)+" del arreglo");
    A[i]=entrada.nextInt();
}

int a,s,d,f,g,h,j,k,l,q;
a=A[0];
s=A[1];
d=A[2];
f=A[3];
g=A[4];
h=A[5];
j=A[6];
k=A[7];
l=A[8];
q=A[9];

if (a<s&&d<f&&g<h&&j<k&&l<q){
    System.out.println("El arreglo esta fromado de forma cresietnte");
}
else if  (a>s&&d>f&&g>h&&j>k&&l>q){
    System.out.println("El arreglo esta fromado de forma decresiente");
}
else {System.out.println("Estan desordenados");}
}



}
    

