import java.util.Scanner;
public class ejercicio6cc {


public static void main (String[]args){

Scanner entrada = new Scanner(System.in);

int res=0;

while (true){

    System.out.println("Dime un numero");
    int num=entrada.nextInt();
if (num==0){
    break;
}
else {res+=num;}
}
System.out.println("El resultado es "+res);

entrada.close();

}
    
}
