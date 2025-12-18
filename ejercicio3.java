/*Haccer un programa que lea un caracter por teclado y compruebe
 * si es una letra mayuscula
 */

import javax.swing.JOptionPane;

public class ejercicio3 {
public static void main (String[]args){

char letra;

letra=JOptionPane.showInputDialog("Dime una letra").charAt(0);

if(Character.isUpperCase(letra)){
JOptionPane.showMessageDialog(null, "Es una letrta mayuscula");

}
else{
    JOptionPane.showMessageDialog(null, "Esta no es una letra mayuscula");
}

}

    
}
