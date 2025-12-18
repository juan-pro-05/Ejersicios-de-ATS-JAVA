/*Crea un programa que te diga si un numeroes negativo o positivo y que pase hasta que se introdusca 0 */

import java.util.Scanner;
public class ejercicio2c {
    public static void main (String []args){

Scanner entrada = new Scanner(System.in);


int numero;
System.out.println("Dime un numero");
numero= entrada.nextInt();
while (numero != 0){
    if(numero>0)
System.out.println("El numero es positivo");
  if(numero < 0){
    System.out.println("Tu numero es negativo");
}
System.out.println("Dime un numero");
numero=entrada.nextInt();
}


entrada.close();


    }
    
}

