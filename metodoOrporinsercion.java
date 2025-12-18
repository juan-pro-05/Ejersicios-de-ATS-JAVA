import java.util.Scanner;

public class metodoOrporinsercion {

public static void main(String[] args) {
    

Scanner eScanner = new Scanner(System.in);
byte valoraA,aux,pos;


System.out.println("Digite el largo del arreglo");
valoraA=eScanner.nextByte();
 byte A[];
 A=new byte[valoraA];

 System.out.println("Rellene el arreelgo");

 for (int i=0;i<valoraA;i-=-1){
System.out.println((i+1)+". Digite el valor ");
A[i]=eScanner.nextByte();
 }

// Metodo de insercion

for (int a=0;a<(valoraA);a-=-1){
    aux=A[a];
    pos=(byte)a;
    while (pos>0 && A[pos-1]>aux) {
        A[pos]=A[pos-1];
        pos--;       
    }
A[pos]=aux;

}

for (byte O:A){
    System.out.print(O);


}



}






  
}

    

