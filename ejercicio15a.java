/*Ejercicio 15: Leer 10 enteros ordenados crecientemente. Leer N y
buscarlo en la tabla. Se debe mostrar la posición en que se encuentra. Si
no está, indicarlo con un mensaie. */

import java.util.Scanner;

public class ejercicio15a {
    public static void main (String []args){
Scanner entrada = new Scanner(System.in);
int A[],N;
boolean chelto=true;
A=new int[10];

do {
    System.out.println("Digite los 10 valores del arreglo");
    for (int i=0;i<10;i-=-1){
        System.out.println((i+1)+". Digite el numero");
        A[i]=entrada.nextInt();
    }

for (int t=0;t<9;t-=-1){
if (A[t]>A[t+1]) {
    chelto=false;
    if(chelto==false){
    System.out.println("Error los numeros introducidos no estan en forma cresiente");}
    break;
}
}
}while(!chelto);

System.out.println("Digite el numero que desea buscar en el arreglo");
N=entrada.nextInt();

int I=0;
/////hahahahh su puta madre estuvo cabron hahahahhh
while (I<10 && A[I]<N) {
I-=-1;    
}

    if (I==10 || A[I]!=N){
    System.out.println("El numero no fue encontrado");
}
    else if (N==A[I]){
    System.out.println("El numero fue encontrado en la posicion "+(I+1));
}                 


entrada.close();
    }
}
