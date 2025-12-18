/*Realizar un juego para adivinar un numero. para ello generar un numero aleatoria entre 
 * 0-100 y luego ir pidiendo numeros indicando "es mayor" o es "menor" segun sea mayor o menor
 * con respecto a N. El proceso termina cuando el usuario acierta y mostrar el numero de intentos
 */
import java.util.Random;

import javax.swing.JOptionPane;
public class ejercicio5c {
    public static void main (String []args){
Random ran = new Random();


int rand=ran.nextInt(100)+1,num,intentos=0;


num = Integer.parseInt(JOptionPane.showInputDialog(null,"Jugemos elige un numero del 1 al 100 y debes adivinar el que eligio\n la maquina"));
do {
   
    if (rand>num){
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"El numero es mayor dime otro numero "));
        
    }
    else {
      num=Integer.parseInt(JOptionPane.showInputDialog(null,"El numero es menor dime otro numero "));
}intentos++;}
while (num != rand);

JOptionPane.showMessageDialog(null, "Felicidades ganaste \n intentos "+intentos);





    }
}

    
    

