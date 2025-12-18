/*Pedir numeros hasta que se introduzca 0 y mostrar la suma de todos ellos */
import java.util.Scanner;
public class ejercicio6c {
 public static void main (String []args){

Scanner entrada = new Scanner(System.in);

int num,suma=0;

do {
    System.out.println("Dime un numero");
    num=entrada.nextInt();
suma+=num;
}while (num!=0);
System.out.println("El resultaod es "+suma);

entrada.close();


 }}

