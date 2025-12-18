import java.util.Scanner;

public class metodoburbuja {
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);

        int A[],numerosA,aux;

System.out.println("Cuantos elementos quieres para tu arreglo");
numerosA=entrada.nextInt();

A = new int[numerosA];

for (int i=0;i<numerosA;i-=-1){
    System.out.println("Digite el valor "+(i+1));
    A[i]=entrada.nextInt();
}

// metodo burbuja

for(int f=0;f<(numerosA-1);f-=-1){
    for (int h=0;h<(numerosA-1);h-=-1){
        if (A[h]>A[h+1]){
            aux=A[h+1];
            A[h+1]=A[h];
            A[h]=aux;
        }
    }
}
System.out.println("Arreglo cresiente");
for (int Q:A){
    System.out.print("-"+Q);
}
System.out.println("\nArreglo decresiente");
for (int f=(numerosA-1);f>=0;f--){
System.out.print("-"+A[f]);
}




entrada.close(); 
    }
    
}
