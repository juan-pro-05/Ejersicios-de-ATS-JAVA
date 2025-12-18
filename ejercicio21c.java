/*Pedir 10 numeros y ver si se a introducido un numero negativo */
import java.util.Scanner;
public class ejercicio21c {
public static void main (String []args){
Scanner entrada=new Scanner(System.in);
    boolean a=false;
int num;

    for (int i=1;i<=10;i++){
System.out.println("Dime numeros");
num=entrada.nextInt();
if (num<0){
a = true;
}

    }
if (a==true){

    System.out.println("Se introdujo un numero negativo");
}
else {System.out.println("No se introdujeron numeros negativos");}
    entrada.close();}

    
}
