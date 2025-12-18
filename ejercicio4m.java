/*Crear una matriz de tamno 7x7 y rellenarla de forma que los elementos de la diagonal priincipal 
 * sean 1 y el resto 0
 */

import java.util.Random;

public class ejercicio4m {
    public static void main(String[] args) {
Random ran = new Random();
int matriz[][]=new int[7][7];
for (int f=0;f<7;f-=-1){
    for(int c=0;c<7;c-=-1){
matriz[f][c]=ran.nextInt(1);
if (f==c){
    matriz[f][c]=1;
}

    }

}

for (int f=0;f<7;f-=-1){
    for(int c=0;c<7;c-=-1){

        System.out.print("["+matriz[f][c]+"]");

    }
System.out.println();
}




    }
    
}
