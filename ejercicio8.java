/*dar un numero entre 0 y 999999 y decir cuantos digitos 
 * tiene
 */

import java.util.Scanner;

public class ejercicio8 {
    public static void main (String [] args){


    Scanner entrada = new Scanner(System.in);
        
int numero;



System.out.println("Dime un numero");
numero= entrada.nextInt();
int contador=(int)Math.log10(numero)+1;

System.out.println("El numero "+numero+" tiene "+contador+" de digitos");
 




entrada.close();



        
        
    }

}


        
    

