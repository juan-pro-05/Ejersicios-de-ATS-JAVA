/*Leer 5 numeros guardarlos en un arreglo, guardarlos en un arreglo y mostrarlos
 * en el orden diverso al introducido
 */
import java.util.Scanner;
import java.util.Random;
public class ejercicio2a {
    public static void main (String[]args){

Scanner entrada = new Scanner(System.in);
/* 
int veces;
System.out.println("Dime el numero que va a contener el arreglo");
veces=entrada.nextInt(); */
int [] arreglo= new int[5];

for (int i=0 ;i<arreglo.length ;i++){

System.out.println("Dime valor "+(i+1)+" del arreglgo");
    arreglo[i]=entrada.nextInt();

}
Random ran = new Random();
for (int o=0;o<arreglo.length;o++){
    int cajatem=arreglo[o];
    int random=ran.nextInt(5);
    arreglo[o]=arreglo[random];
arreglo[random]=cajatem;




}

for (int i: arreglo){

System.out.print((i)+" ");


}
entrada.close();}


    }

    

