import java.util.Scanner;
public class ejercicio20 {
    public static void main (String []args){
Scanner entrada = new Scanner (System.in);
int n;
double sueldoalto=0,sueldominimo;

System.out.println("Cuantos sueldos ingrearas");
n=entrada.nextInt();

for (int i=1;i<=n;i++){
System.out.println("Dime el sueldo");
sueldominimo=entrada.nextInt();
if (sueldominimo>sueldoalto){
    sueldoalto=sueldominimo;
}


}

System.out.println("El sueldo mas alto fue de "+sueldoalto);
    entrada.close();}
    
}
