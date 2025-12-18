import java.util.Scanner;

public class ejercicio3m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int valor = 1;
         for (int f=0; f<3; f++) {
             for (int c = 0; c < 3; c++) {

                 System.out.println("Digite el el valor " + valor + " de la matriz");
                 matriz[f][c] = sc.nextInt();
                 valor++;
             }
         }
        System.out.println("Matriz es: ");
              for (int f=0; f<3; f++) {
                  for (int c=0; c<3; c++) {
                      System.out.print(matriz[f][c] + " ");
                  }
                  System.out.println("");
              }
        System.out.println("La matriz transpuesta es ");

              int aux = 0;
              for (int f=0; f<3; f++) {
                  for (int c=0; c<f; c++) {
                      aux = matriz[f][c];
                      matriz[f][c] = matriz[c][f];
                      matriz[c][f] = aux;

                  }
              }
        for (int f=0; f<3; f++) {
            for (int c=0; c<3; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println("");
        }

}
}