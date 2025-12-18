/*Ejercicio 2: crear y cargar dos matrices de tamano 3X3, sumarlas y mostrar su suma */

import java.net.Socket;
import java.util.Scanner;

public class ejercicio2m {
    public static void main(String[] args) {
        
Scanner entrada = new Scanner(System.in);
int matriz[][],matriz2[][],matriz3[][];
 matriz = new int[3][3];
 matriz2 = new int[3][3];
matriz3 = new int[3][3];
System.out.println("Digite los valores de la matriz uno");
 for (int o=0;o<3;o-=-1){
        for(int i=0;i<3;i-=-1){
            System.out.print((i+1)+". Digite el valor ");
matriz[o][i]=entrada.nextInt();
        } 
 }

 System.out.println("Digite los valores de la matriz dos");
 for (int o=0;o<3;o-=-1){
        for(int i=0;i<3;i-=-1){
            System.out.print((i+1)+". Digite el valor ");
matriz2[o][i]=entrada.nextInt();
        } 
 }


//suma de dos matrizes

for (int f=0;f<3;f-=-1){
    for (int c=0;c<3;c-=-1){
      matriz3[f][c]=matriz[f][c]+matriz2[f][c];
    }

}

System.out.println("Matriz 1");
for (int f=0;f<3;f-=-1){
    for (int c=0;c<3;c-=-1){
      System.out.print("["+matriz[f][c]+"]");
    }
System.out.println();
}
System.out.println("Matriz 2");
for (int f=0;f<3;f-=-1){
    for (int c=0;c<3;c-=-1){
      System.out.print("["+matriz2[f][c]+"]");
    }
System.err.println();
}
System.out.println("Matriz resetante");
for (int f=0;f<3;f-=-1){
    for (int c=0;c<3;c-=-1){
      System.out.print("["+matriz3[f][c]+"]");
    }
System.out.println();
}

    }
    
}
