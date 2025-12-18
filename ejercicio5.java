/*Un obrero quiere calcular su salario semanal, en el cual
se obtiene (si trabaja 40H o menos se le paga 16 por H)
(si trabaja mas de 40H se le paga paga 16 por cada una 
de las primeras horas y 20 por cada hora extra)
 */


import javax.swing.JOptionPane;

public class ejercicio5 {
    public static void main (String []args){


int horas;

int pago;

horas=Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas trabajaste"));

if (horas<40) {
    pago=horas*16;
    JOptionPane.showMessageDialog(null, "Tu pago es "+pago);
}

else{
    int horasnormales=40;
    int horasextrta=horas-horasnormales;
    int pago1;
    int pagofinal1;
    int pago2;
pago1=horasnormales*16;
pago2=horasextrta*20;
pagofinal1=pago2+pago1;

JOptionPane.showMessageDialog(null, "El pago es "+pagofinal1);


}

}

    }

