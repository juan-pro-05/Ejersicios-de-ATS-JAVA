import java.util.Scanner;

public class ejercicio13a {
    public static void main (String[]args){
/*Ejercicio 13: Leer 10 enteros en
una tabla. Guardar en otra tabla los
elementos pares de la primera, y a
continuación los elementos impares. */

Scanner entrada = new Scanner(System.in);
int[] A=new int[10];
int conteopar=0,conteoinpar=0;


for (int i=0;i<10;i-=-1){
    System.out.println((i+1)+". Digite el valor de el arreglo");
    A[i]=entrada.nextInt();
    
    if ((A[i]%2)!=0){
     conteoinpar++;
     
    }
    else {
     conteopar++;
    
    }
}


int[] A1=new int[conteopar];
int[] A2=new int[conteoinpar];

for (int ci=0,cp=0,i=0;i<10;i++){

    if ((A[i]%2)!=0){
     A2[ci]=A[i];
     ci++;
    }
    else {
     A1[cp]=A[i];
     cp++;
    }
}
System.out.println("El arreglo de inpares");
for (int f:A2){
    System.out.print(f+" ");
}
System.out.println("\nEl arreglo pares");
for (int  h:A1){
    System.out.print(h+" ");
}
 entrada.close();
}
    
}
