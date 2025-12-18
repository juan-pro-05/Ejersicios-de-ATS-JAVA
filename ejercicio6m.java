/*usando dos matrices de tamano de 5x9 y 9x5 cargarla y transponerla en la segunda */

import java.util.Random;

public class ejercicio6m {
    public static void main(String[] args) {
        Random ran  = new Random();
           int ma1[][] = new int[5][9],ma2[][]=new int[9][5];

for (int f=0,con=0;f<5;f++){
    for (int c=0;c<9;c++){
           ma1[f][c]=ran.nextInt(10);

    }

}

for (int f=0,con=0;f<9;f++){
    for (int c=0;c<5;c++){
ma2[f][c]=ma1[c][f];
    }
}


for (int f=0,con=0;f<5;f++){
    for (int c=0;c<9;c++){
System.out.print("["+ma1[f][c]+"]");
    }
    System.out.println();
}

System.out.println();

for (int f=0,con=0;f<9;f++){
    for (int c=0;c<5;c++){
System.out.print("["+ma2[f][c]+"]");
    }
    System.out.println();
}
           
    }
    
}
