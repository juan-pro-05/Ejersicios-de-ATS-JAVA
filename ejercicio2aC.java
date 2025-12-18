import java.util.Scanner;
import java.util.Random;

public class ejercicio2aC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        // Leer 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = entrada.nextInt();
        }

        // Generar un orden aleatorio
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int indiceAleatorio = random.nextInt(5);
            int numtemporal = numeros[i];
            numeros[i] = numeros[indiceAleatorio];
            numeros[indiceAleatorio] = numtemporal;
        }

        // Mostrar los números en el orden aleatorio
        System.out.println("Números en orden aleatorio:");
        for (int i: numeros) {
            System.out.print(i);
        }
  entrada.close();  }
}