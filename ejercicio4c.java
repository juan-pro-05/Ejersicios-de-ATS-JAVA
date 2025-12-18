import java.util.Scanner;
/*pedir un numero hasta que es teclee uno negativo y mostrar cuantos numeros se
 * han introducido
 */
public class ejercicio4c {
public static void main (String [] args){

int num,contador=0;


Scanner entrada = new Scanner(System.in);
System.out.println("Digite un numero");
num=entrada.nextInt();
while (num>=0){
    System.out.println("Ingresa otro numero porfavor");
num=entrada.nextInt();
contador++;
}

System.out.println("El total de numeros ingresados fueron "+contador);



entrada.close();

}

}


