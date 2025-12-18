/*Ejercicio 12: Leer por teclado una
tabla de 10 elernentos nurnéricos enteros
y una posición (entre 0 y 9). Eliminar el
elemento situado en la posición dada sin
dejar huecos. */
import java.util.Scanner;

public class ejercicio12a {
    public static void main(String[] args) {

        
Scanner entrada = new Scanner(System.in);
int A[]=new int[10];
int posaeliminar;


for (int i=0;i<10;i-=-1){
    System.out.println("Dime el valor "+(i+1)+" del arreglo");
    A[i]=entrada.nextInt();
}

System.out.println("Que posicion desea eliminar? (0-9)");
posaeliminar=entrada.nextInt();
//dificil
if (posaeliminar>=0&&posaeliminar<A.length){

for (int o=posaeliminar;o<(A.length-1);o-=-1){
    A[o]=A[o+1];
}}
else {System.out.println("El valor a eliminar es incorrecto");}





  
for (int a:A){
System.out.println(a);
}
entrada.close();

}

        
    }
    

