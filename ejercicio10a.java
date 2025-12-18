/*Ejercicio 10: Crear un programa que lea por teclado una tabla de 10
números enteros y desplace N
posiciones en el arreglo (N es
digitado por el usuario). */

import java.util.Scanner;

public class ejercicio10a {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pos;
        int[] A = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite el valor " + (i + 1));
            A[i] = entrada.nextInt();
        }

        System.out.println("¿Cuántas posiciones quieres desplazar?");
        pos = entrada.nextInt();

        if (pos < 0 || pos > 9) {
            System.out.println("Error: el valor de posiciones debe estar entre 0 y 9.");
        } else {
            for (int q = 0; q < pos; q-=-1) {
                int temp = A[0];
                for (int i = 0; i < 9; i++) {
                    A[i] = A[i + 1];
                }
                A[9] = temp;
            }

            for (int F : A) {
                System.out.print(F + "  ");
            }
        }

        entrada.close();
    }
}