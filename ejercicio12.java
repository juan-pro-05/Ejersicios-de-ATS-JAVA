// pedir una nota de 0 a 10 y poner
// Un enunciado por cada calificacion

import javax.swing.JOptionPane;

public class ejercicio12 {

    public static void main (String [] args){

int nota;


nota = Integer.parseInt(JOptionPane.showInputDialog("Dime la nota"));

switch (nota) {
    case 1 :System.out.println("Eres pendejo");
        break;
    case 2 :System.out.println("Sigues siendo pendejo");
        break;
    case 3 :System.out.println("Sos un pendejo haha");
        break;
    case 4 :System.out.println("Mmm insuficiente");
        break;
    case 5 :System.out.println("haha 5 enserio?");
        break;
    case 6 : System.out.println(" 6 al menos pasaste");
        break;
    case 7 :System.out.println("Bueno estubo bien puede ser mejor");
        break;
    case 8 :System.out.println("Bien, puedes mejorar");
        break;
    case 9 :System.out.println("Sos un capo");
        break;
    case 10:System.out.println("Eres un dios :) ");
        break;

    default:System.out.println("Numero invalido :/ ");
        break;
}

}



    }
    

