/*Pedir 10 sueldos. mostrar su suma y cuantos
 * hay mayores a 1000
 */
import java.util.Scanner;
public class ejercicio14c {
    public static void main (String []args){
Scanner entrada = new Scanner (System.in);
double sum=0,sueldo;
int mayor100=0;

for (int i=0;i<10;i++){
System.out.println("Dime el sueldo");
sueldo=entrada.nextInt();
sum+=sueldo;

if(sueldo>1000){mayor100++;}

}
System.out.println("La suma total fue "+sum);
System.out.println("Sueldos mayores a 1000 fueron "+mayor100);
entrada.close();


    }
    
}
