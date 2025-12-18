/*Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar la media de los numeros positivos
 * la media de los numeros negativos y contar el numeros de ceros
 * ingresar 2,-5,6,-2,0
 * resultados 4. pos, -3.5 neg, 1 cero
 */

import java.util.Scanner;

public class ejerccicio3a {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int conteo0=0,conteop=0,conteon=0,sum=0,sum1=0;
        double mediap,median;
        int [] arreglo = new int [5];
        for (int i=0;i<5;i++){
        System.out.println("Dame el numero "+(i+1)+" del arreglo");
        arreglo[i] =entrada.nextInt();
        }

for (int a: arreglo){
if (a>0){
    conteop++;
    sum+=a;
}
else if (a<0){
    conteon++;
    sum1+=a;
}
else {conteo0++;}

}

mediap =(double) sum/conteop;
median =(double)sum1/conteon;

System.out.println("Media de negativos"+median);
System.out.println("Media positivos "+mediap);
System.out.println("Total de ceros "+conteo0);




        entrada.close();
    }
    
}
