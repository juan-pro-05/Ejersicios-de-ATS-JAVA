import java.util.Scanner;

public class ejercicio1m {

    public static void main(String[] args) {
        
// Crear una matriz de tamano de n x m y decir si es cimeetrica o no
Scanner entrada = new Scanner(System.in);
int matriz[][],numf=3,numc=3;
 matriz = new int[numf][numc];
 boolean simetrica=true;

System.out.println("Digite los valores de la matriz");
 for (int o=0;o<3;o-=-1){
        for(int i=0;i<3;i-=-1){
            System.out.print((i+1)+". Digite el valor ");
matriz[o][i]=entrada.nextInt();
        } 
 }

if (numf == numc){
    int f,c;
f=0;
while (f<numf && simetrica==true) {
    c=0;
    while (c<f) {
    if (matriz[f][c]!=matriz[c][f]){
        simetrica=false;
    }
    c++;       
    }
    f++;
}
if (simetrica==true){
    System.out.println("Es simetrica");
}
else {System.out.println("No es simetrica");}






}
else {System.out.println("No es simetrica");}







 for (int o=0;o<3;o-=-1){
    for(int i=0;i<3;i-=-1){
System.out.print("["+matriz[o][i]+"]");
    } 
    System.out.println();
}

entrada.close();

    }
}
