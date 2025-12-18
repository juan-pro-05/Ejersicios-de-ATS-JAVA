/*Ejercicio 5: Leer por teclado dos
tablas de 10 números enteros y
mezclarlas en una tercera de la
forrna: 10 de A, 10 de B, 20 de
A, el 20 de B, etc. */
import java.util.Scanner;
public class ejercicio5a {
    public static void main(String[] args) {
        
int [] a,b,c;
Scanner entrada = new Scanner(System.in);
a = new int[10];
b= new int[10];
c=new int[20];

for (int i=0;i<10;i++){
    System.out.println("Valores del arreglo A "+(i+1));
    a[i]=entrada.nextInt();
}
for (int q=0;q<10;q++){
    System.out.println("Valores del arrreglo B "+(q+1));
    b[q]=entrada.nextInt();
}
int z=0;
for (int p=0;p<10;p++){
    c[z]=a[p];
    System.out.println(c[z]);
    z++;
    c[z]=b[p];
    System.out.println(c[z]);
    z++;

}

entrada.close();


    }
    
}
