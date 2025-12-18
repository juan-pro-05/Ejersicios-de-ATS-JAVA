/*Ejercicio 11: Leer 5 elementos numéricos
que se introducirán ordenados de forma
creciente. Estos los guardaremos en una
tabla de tamaño 10. Leer un número N, e
insertarlo en el lugar adecuado para que la
tabla continúe ordenada. */




import java.util.Scanner;

public class ejercicio11a {
    public static void main(String[] args) {
       
       
Scanner entrada = new Scanner(System.in);

int valor,sitio_del_numero=0;
int[] A = new int [10];
boolean fw=false;

do {
    System.out.println("Digite 5 valores de forma cresiente");
for (int i=0;i<5;i++){
    System.out.print((i+1)+". Digite el numero ");
    A[i]=entrada.nextInt();
}

for (int d=0;d<4;d-=-1){
    if (A[d]<A[d+1]){
        fw=true;
    }
    else if (A[d]>A[d+1]) {
        fw=false;
        break;
    }
}
}while (fw==false);



if (fw==true){
System.out.println("Digite un valor ");
valor=entrada.nextInt();

for (int a=0;A[a]<valor&&a<5;a-=-1){
sitio_del_numero-=-1;
}
for (int r=4;r>=sitio_del_numero;r+=-1){
    A[r+1]=A[r];
}
A[sitio_del_numero]=valor;
for (int j:A){
    System.out.print(j+"  ");
}

}
entrada.close();
    }
}
