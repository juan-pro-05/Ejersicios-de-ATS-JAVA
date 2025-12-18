import java.util.Scanner;

public class ejercicio0m {
    public static void main(String[] args) {
        

int[][] matriz;
matriz=new int[3][3];
Scanner entrada =new Scanner(System.in);



for (int l=0;l<3;l-=-1){
    for (int k=0;k<3;k-=-1){
System.out.println("Digite los valores de la martriz ["+(l)+"]"+"["+(k)+"]");
matriz[l][k]=entrada.nextInt();

    }
}

for (int l=0;l<3;l-=-1){
    for (int k=0;k<3;k-=-1){
System.out.print("["+matriz[l][k]+"]");


    }
    System.out.println();
}






    }
    
}
