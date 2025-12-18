/*Leer 10 nümeros enteros, guardarlos en un arreglo.
Debemos mostrarlos en el siguiente
orden: el primero, el ültimo, el
segundo, el penültimo, el tercero, etc. */

import java.util.Scanner;

public class ejercicio4a {
    public static void main(String[] args) {
int[] arreglo = new int [10];


Scanner entrada = new Scanner(System.in);

for (int i=0;i<10;i++){
System.out.println("Dime el valor del la posicio "+(i+1)+" del  arreglo");
arreglo[i]=entrada.nextInt();
}
/* 
for (int p=0, h=9;p<=h;p++,h--){
System.out.println(arreglo[p]);
System.out.println(arreglo[h]);
}*/
int p=0,q=9;
for (int a : arreglo) {
if (p<=q){
    System.out.println(arreglo[p]);
}
if (p!=q){
    System.out.println(arreglo[q]);
}
p++;
q--;


entrada.close();


            
        }
        
    
    }}
