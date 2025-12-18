/*leer un numero y mostrar su cuadrado repetir el proceso hasta que se indrodusca un numero negativo */
import java.util.Scanner;
public class ejercio1c {
    public static void main (String []args){

Scanner entrada=new Scanner(System.in);
int num,cuadrado;
System.out.println("Dame un numero");
num=entrada.nextInt();

while (num>=0){
cuadrado=(int)Math.pow(num, 2);
System.out.println("El numero elevado al cuadrado es "+cuadrado);
System.out.println("Dime otro numero");
num=entrada.nextInt();
}

entrada.close();





    }
}
