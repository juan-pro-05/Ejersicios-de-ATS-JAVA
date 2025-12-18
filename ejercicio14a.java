import java.util.Scanner;

public class ejercicio14a {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] A = new int[10];
        int[] A1 = new int[10];
        int[] F = new int[20];
        
        boolean chelto = false, chelto1 = false;

        // Leer el primer arreglo y validar que esté ordenado
        do {
            chelto = true; // Asumimos que el arreglo está ordenado
            System.out.println("Digite los 10 valores del primer arreglo:");
            for (int q = 0; q < 10; q++) {
                System.out.print("Dime el valor " + (q + 1) + " del arreglo 1: ");
                A[q] = entrada.nextInt();
            }
            for (int i = 0; i < 9; i++) {
                if (A[i] > A[i + 1]) {
                    chelto = false;
                    System.out.println("Error: ordenelo de forma creciente");
                    break;
                }
            }
        } while (!chelto);

        // Leer el segundo arreglo y validar que esté ordenado
        do {
            chelto1 = true; // Asumimos que el arreglo está ordenado
            System.out.println("Digite los 10 valores del segundo arreglo:");
            for (int q = 0; q < 10; q++) {
                System.out.print("Dime el valor " + (q + 1) + " del arreglo 2: ");
                A1[q] = entrada.nextInt();
            }
            for (int z = 0; z < 9; z++) {
                if (A1[z] > A1[z + 1]) {
                    chelto1 = false;
                    System.out.println("Error: ordenelo de forma creciente");
                    break;
                }
            }
        } while (!chelto1);

        // Fusionar los dos arreglos en uno solo
        int i = 0, j = 0, k = 0;
        while (i < 10 && j < 10) {
            if (A[i] <= A1[j]) {
                F[k++] = A[i++];
            } else {
                F[k++] = A1[j++];
            }
            
        }
        while (i < 10) {
            F[k++] = A[i++];
        }
        while (j < 10) {
            F[k++] = A1[j++];
        }

        // Imprimir el arreglo fusionado
        System.out.println("Arreglo fusionado:");
        for (int Q:F) {
            System.out.print(Q + " ");
        }

        entrada.close();
    }
}
