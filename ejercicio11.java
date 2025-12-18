/*Construit un programa que simule el funcionamiento
 * de una calculadora que realize las cuatro operaciones
 * aritmeticas basicas (suma, resta, prodecuto, divicion)
 * con valores numericos enteros. el usuario debe especificar
 * la operacion con el primer caracter parametro de la linea de
 * comandos: S o s para suma, R o r para resta, P o p o M y m
 * para el producto y D o d para la divison
 */

 import java.util.Scanner;
public class ejercicio11 {

    public static void main (String [] args){

 
Scanner entrada = new Scanner(System.in);
Scanner entrada2 = new Scanner(System.in);


 int numero,numero1,suma,resta,div,mul,residuo;
 char operacion;

System.out.println("Dime el primer numero");
numero=entrada.nextInt();
System.out.println("Dime le segundo numero");
numero1=entrada.nextInt();
System.out.println("Dime la operacion que quieres hacer");
operacion=entrada2.nextLine().charAt(0);

switch (operacion) {

     case's':
     case 'S': suma = numero+numero1;
     System.out.println("El resultado es "+suma);
break;
     case 'R':
     case 'r': resta = numero-numero1;
     System.out.println("El resultado es "+resta);
break;
     case 'M':
     case 'm': mul= numero*numero1;
     System.out.println("El resultado es "+mul);
break;
case 'D':
case 'd': div= numero/numero1;
         residuo= numero%numero1;
System.out.println("El resultado es "+div+" y el residuo es "+residuo);

    default:System.out.println("Intrucion invalida intentelo de nuevo ");
 
    break;


}






entrada.close();
entrada2.close();









    }


    
}
