/*hacer un programa que simule un cajero automatico con un saldo inicial de 1000
 * doalares, con las siguientes opciones
 * 1. ingresa dinero a la cuenta
 * 2. Retirar dinero a la cuenta
 * 3.. Salir
 */
import java.util.Scanner;
public class ejercicio13 {
    public static void main (String [] args){

int saldoinicial=1000,accion,agregarsaldo,retirarsaldo;

Scanner entrada = new Scanner(System.in);
Scanner entrada1 = new Scanner(System.in);



System.out.println("Bienvenido a tu cajero cual de las siguiente opciones quieres hacer ");
System.out.println("1. Ingresar dinero a la cuenta");
System.out.println("2. Retirar dinero de la cuenta");
System.out.println("3. Salir");

accion=entrada.nextInt();
switch (accion) {
    case 1 : System.out.println("Cuanto dinero desea ingresar");
        agregarsaldo=entrada1.nextInt();
        saldoinicial=saldoinicial+agregarsaldo;
        System.out.println("Su saldo actual es de "+saldoinicial);
        break;
    case 2: System.out.println("Cuanto desea retirar");
        retirarsaldo=entrada1.nextInt();
          if (saldoinicial<retirarsaldo){
System.out.println("No se puede retirar dicha cantidad no cuenta con el suficiente saldo");

          }   
          else{
            saldoinicial=saldoinicial-retirarsaldo;
            System.out.println("El retiro fue exitoso");
            System.out.println("Su saldo actual es de "+saldoinicial);
          }
    break;
    case 3: break;


    default: System.out.println("Dicha accion invalida");
        break;
}
entrada.close();
entrada1.close();
    }
    
}
