import java.util.Random;
public class ejercicio7m {
    public static void main(String[] args) {
        
int n=5,matriz[][]= new int[n][n];
Random ran = new Random();
for (int f=0;f<n;f++){
    for (int c=0;c<n;c++){
    matriz[f][c]=ran.nextInt(1);
    if (f==0 || f==4 ){
        matriz[f][c]=1;
    }
    if (c==0 || c==4 ){
        matriz[f][c]=1;
    }
    }}




for (int f=0;f<n;f++){
    for (int c=0;c<n;c++){
    System.out.print("["+matriz[f][c]+"]");
    }System.out.println();}








    }
    
}
