import java.util.Scanner;

public class ab {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
int[] A = new int[5];
int sum=0;

for (int o=0;o<5;o++){
System.out.println("Dime el valor de la cal");
A[o]=entrada.nextInt();
}
for (int i:A){
    
    sum+=i;
}
float Res;
Res=sum/5;
System.out.println("La calificacion final es "+Res);

    }
    
}
