/*Pedir dia mas y ano de una fecha e indicar si la fecha
 * es correcta suponiendo que todos los dias son de 
 * 30 dias
 */

import java.util.Scanner;
public class ejercicio9 {

    public static void main (String[]args){
Scanner entrada = new Scanner (System.in);
int dia,mes,amo;


System.out.println("Dime el dia");
dia= entrada.nextInt();
System.out.println("Dime el mes");
mes=entrada.nextInt();
System.out.println("Dme el ano");
amo=entrada.nextInt();



if (dia <= 30 && dia >=1 ){
    if (mes >=1 && mes <=12) {
        if (amo !=0){
            System.out.println("El dia "+dia+" del mes "+mes+" y del ano "+amo+ " es correcto");
        }
        else {System.out.println("El ano es incorrecto");}
    }
      else {System.out.println("El mes es incorrecto");}

} else {System.out.println("El dia es incorrecto");}
    


entrada.close();


    
    }
    
}
