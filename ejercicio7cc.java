/*Pedir numeros y parar hasta que se introdusca 0 y sacar la media */
import java.util.Scanner;
public class ejercicio7cc {
    public static void main (String []args){
Scanner entrada = new Scanner(System.in);


int num,contador=0,suma=0;
float media;
System.out.println("Dime numeros");
num=entrada.nextInt();
while (num>0){
suma+=num;
contador++;
System.out.println("Dime otro numero");
num=entrada.nextInt();

}

media=(float)suma/contador;
System.out.println("La media es "+media);


entrada.close();


    }
    
    
}
