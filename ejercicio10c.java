/*Pedir 10 numeros y mostrar la suma total */
import java.util.Scanner;
public class ejercicio10c {
    public static void main (String []args){
Scanner entrada = new Scanner(System.in);
int num,sum=0;


        for (int i=0;i<=10;i++){
System.out.println("Dime un numero");
num=entrada.nextInt();
sum+=num;
}
System.out.println("El resultado de la suma de los 10 numeros es "+sum);




entrada.close();
}}


