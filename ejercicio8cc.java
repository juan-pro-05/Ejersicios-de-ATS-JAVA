import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio8cc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese los números (ingrese '0' para finalizar):");

        int numero;
        do {
            numero = scanner.nextInt();
            if (numero != 0) {
                numeros.add(numero);
            }
        } while (numero != 0);

        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println("Números en orden descendente:");
        for (int num : numeros) {
            System.out.println(num);
        }
        scanner.close();
    }
}