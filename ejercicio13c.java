/*Pedir 10 numeros mostrar la ,edia de los numeros positivos, la media
 * de los numeros negativos y la cantidad de ceros.
 */
import java.util.Scanner;
public class ejercicio13c {
    public static void main (String []args){
Scanner entrada = new Scanner(System.in);
int num,sump=0,sumn=0,contador=0,contador1=0,contador0=0;
double res,res1;
for (int i=0;i<10;i++){

System.out.println("Dime un numero");
num=entrada.nextInt();

if (num>0){
    sump+=num;
    contador++;
}
else if (num<0){
sumn+=num;
contador1++;
}
else {contador0++;}
}
res=(double)sump/contador;
res1=(double)sumn/contador1;

System.out.println("La media de los numeros positivos es "+res);
System.out.println("El resultado de los numeoros negativos es "+res1);
System.out.println("La cantidad de ceros es "+contador0);

entrada.close();
    }
    
}
