/*Pedir 5 numeros calificaciones de alumnos y decir al fianal
 si hay algun suspenso
 */
import java.util.Scanner;
public class ejercicio22c {
    public static void main (String []args){
Scanner entrada = new Scanner (System.in);
boolean a=false;
double cal;

for (int i=1;i<=5;i++){

System.out.println("Alumno "+i+" dime su calificacion");
cal=entrada.nextInt();

if (cal<=5){
    a=true;
}


}
if (a==true){
    System.out.println("Hubo algun suspenso");
}

   entrada.close(); }
    
}
