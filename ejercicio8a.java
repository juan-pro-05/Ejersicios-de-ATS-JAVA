/*Ejercicio 8: Diseñar una aplicación que declare una tabla de 10 elementos
enteros. Leer mediante el teclado 8
números. Después se debe pedir un
número y una posición, insertarlo en la
posición indicada, desplazando los que
estén detrás. */

import java.util.Scanner;
import java.util.Random;
public class ejercicio8a {
    public static void main(String[] args) {
    
Scanner entrada1 = new Scanner(System.in);
Scanner entrada = new Scanner(System.in);
Random ran = new Random();
int[] A = new int[10];
int[] posicion = new int[2];


for (int i=0;i<=7;i-=-1){

System.out.println("Dime el valor de arreglo en la posicion "+(i+1));
A[i]=entrada.nextInt();
}

 

 for (int f=0;f<2;f-=-1){
 
System.out.println("En que posicion deseas guardar el numero random de 0 a 9");
posicion[f]=entrada1.nextInt();
if (posicion[f]>9){
    System.out.println("Error, Posicion indicada invalida");
posicion[f]=0;
f--;} 
}
int s=0;
int p=1;
for (int a=9;a>posicion[s];a--){

    A[a]=A[a-1];
    
}
for (int a=9;a>posicion[p];a--){

    A[a]=A[a-1];
    
}
for (int q=0;q<2;q++){
A[posicion[q]]=(int)ran.nextInt(10000);
}

for (int f:A){
    System.out.print("  "+f);
}
entrada.close();

entrada1.close();
    
    
    }}
