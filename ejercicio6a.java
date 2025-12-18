/*Ejercicio 6:
Leer los datos
correspondiente a dos tablas de 12
elementos numéricos, y mezclarlos
en una tercera de la forma: 3 de la
tabla A, 3 de la B, otros 3 de A, otros
3 de la B, etc. */


import javax.swing.JOptionPane;

public class ejercicio6a {
    public static void main(String[] args) {
       


int[] A = new int[12];
int[] B = new int[12];
int[] C = new int[24];

for (int i=0;i<12;i++){
A[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+" Numero del arreglo A"));

}

for (int i=0;i<12;i++){
    B[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+" Numero del arreglo B"));
    
    }
    int z=0,j=0,m=0;
for (int i=0;i<24;i++){
    
    C[z]=A[j];
    System.out.println(C[z]);
    z++;
    j++;
    C[z]=A[j];
    System.out.println(C[z]);
    z++;
    j++;
    C[z]=A[j];
    System.out.println(C[z]);
    z++;
    j++;
    C[z]=B[m];
    System.out.println(C[z]);
    z++;
    m++;
    C[z]=B[m];
    System.out.println(C[z]);
    z++;
    m++;
    C[z]=B[m];
    System.out.println(C[z]);
    z++;
    m++;

}
    


    
    }
    
}
