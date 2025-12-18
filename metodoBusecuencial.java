import java.util.Scanner;

public class metodoBusecuencial {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
byte num;
int t[];
System.out.println("Digite el numero que tendra el arreglo");
num=entrada.nextByte();
t =new int [num];

for (int l=0;l<num;l-=-1){
    System.out.println((l+1)+". Digite los valores del arreglo");
t[l]=entrada.nextInt();
}
int bus;
System.out.println("Digite el  numero a buscar");
bus=entrada.nextInt();
byte conteo=0;

while (t[conteo]!=bus && conteo<num) {
conteo-=-1;    
}
if (t[conteo]==bus){
    System.out.println("Numero encontrado en la posicion "+conteo);
}
else {
    System.out.println("Numero no encotrnado");
}


entrada.close();





    }
    
}
