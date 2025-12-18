/*dadas 6 notas escribir la cantidad de alumnos aprobados
 * condicionados (=4 y suspensos)
 */

import javax.swing.JOptionPane;

public class ejercicio19c {
    public static void main (String []args){
float nota;
int reprobados=0,aprobados=0,condicionados=0;
for (int i=1;i<=6;i++){
do{
nota=Integer.parseInt(JOptionPane.showInputDialog("Nota del almuno "+1));
if (nota==4){
    condicionados++;
}
else if (nota>5){
    aprobados++;
}
else {
    reprobados++;
}
}while (nota<0 || nota >10);

    }
    JOptionPane.showMessageDialog(null,"La cantidad de aprobados fue "+aprobados+"\n la cantidad de cpndicionados fue "+condicionados+"\n la cantidad de reprobados fue"+reprobados);
    }}    

