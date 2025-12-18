/*Pedir dia mes y ano de una fecha e indicar si la fecha
 * es correcta suponiendo que todos los dias son de 
 * con dias de 28, 30 y 31 dias sin anos biciestos
 */

 import java.util.Scanner;
 public class ejercicio10 {
 
     public static void main (String[]args){
 Scanner entrada = new Scanner (System.in);
 int dia,mes,amo;
 
 
 System.out.println("Dime el dia");
 dia= entrada.nextInt();
 System.out.println("Dime el mes");
 mes=entrada.nextInt();
 System.out.println("Dme el ano");
 amo=entrada.nextInt();
 
 if (mes >= 1){
 if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 12){ 
    if (dia <=31 && dia >=1){
        if (amo !=0){
            System.out.println("El dia "+dia+" del mes "+mes+" y del ano "+amo+ " es correcto");
        }else {System.out.println("El ano es incorrecto");}
    }else {System.out.println("El dia es incorrecto");}
 }

 if (mes == 4 || mes == 6 || mes == 9 || mes ==11){
     if (dia <=30 && dia >=1) {
        if (amo != 0){
            System.out.println("El dia "+dia+" del mes "+mes+" y del ano "+amo+ " es correcto");
        } else { System.out.println("El ano es incorrecto");}
        
     }else {System.out.println("EL dia es incorrecto");}

 }
 if (mes == 2){
     if (dia >=1 && dia <=28) {
         if (amo !=0){
             System.out.println("El dia "+dia+" del mes "+mes+" y del ano "+amo+ " es correcto");
         }
         else {System.out.println("El ano es incorrecto");}
     }
       else {System.out.println("El dia es incorrecto");}
 
 } 
     
 
 
 entrada.close();
 
 
     
     }}
     
 }