import java.util.Scanner;
public class arreglos1 {
    public static void main (String[]args){
Scanner entrada = new Scanner (System.in);

int numero;

System.out.println("Cuantos numeros quieres");
numero=entrada.nextInt();

char[] arreglo= new char [numero];

for (int i=0;i<numero;i++){
    System.out.println((i+1)+" Dime el numeor que quiers meter dentro de arreglo");
    arreglo[i]=entrada.next().charAt(0);

}
System.out.print("\nLos caracteres del arreglo son ");
for (int i=0;i<numero;i++){

System.out.println(arreglo[i]+" ");

entrada.close();
}
    }
    
}
