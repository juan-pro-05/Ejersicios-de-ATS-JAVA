/*Dadas las edades y alturas de 5 alumnos, mostrrar la edad y la estatura media
 * la cantidad de alumnos mayores de 19 anos y la cantidad de alimnos que miden mas de 1.75
 */
import java.util.Scanner;
 public class ejercicio15c {
    public static void main (String []args){

Scanner entrada=new Scanner(System.in);
int sum=0,edad,contador18=0,contadorA=0;
float altura,sum1=0;
int b=0;
    

for (int i=1;i<=5;i++){
    b++;

System.out.println("Alumno "+i+" ingrese su edad");
edad=entrada.nextInt();
sum+=edad;
System.out.println("Ahora ingrese su altura");
altura=entrada.nextFloat();
sum1+=altura;
if (edad>18){contador18++;}
if (altura>1.75){contadorA++;}


}
System.out.println("La edad media es "+(float)sum/b);
System.out.println("La estatura media es "+(float)sum1/b);
System.out.println("Los alumnos mayores a 18 "+contador18);
System.out.println("Los alumnos mayor a 1.75 "+contadorA);



entrada.close();

    }
    
}
