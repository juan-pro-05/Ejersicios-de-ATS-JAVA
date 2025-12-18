/* Creear y cargar una matriz de tamano n x m, mostrar la suma de cada fila y cada columna */

import java.util.Random;

public class ejercico5m {
    public static void main(String[] args) {
        
Random ran = new Random();

int matriz[][]=new int[4][4];

for(int f=0;f<4;f-=-1){
    for (int c=0;c<4;c-=-1){
matriz[f][c]=ran.nextInt(10)+1;
    }
}


for(int f=0;f<4;f-=-1){
    for (int c=0;c<4;c-=-1){
System.out.print("["+matriz[f][c]+"]");
    }
    System.out.println();
}

int sumafilas=0,sumacolumnas=0;
for (int con=0;con<4;con++){
for(int f=0;f<4;f-=-1){
   sumacolumnas+=matriz[con][f];
   sumafilas+=matriz[f][con];

}
System.out.println("Suma de columnas "+sumafilas);
System.out.println("Suma de filas "+sumacolumnas);
sumacolumnas=0;
sumafilas=0;
}


    }
    
}
