/*Ejercicio 16: Queremos desarrollar una aplicacion que nos ayude a gestionar las notas
de un centro educativo. Cada grupo (o clase) estå compuesto por 5 alumnos. Se pide leer las
notas del primer, segundo y tercer trimestre de un grupo. Debemos mostrar al final: la nota
media del grupo en cada trimestre, y la media del alumno que se encuentra en la posicion N
(N se lee por teclado). */
import java.util.Random;
import java.util.Scanner;
public class ejercicio16a {
    public static void main(String[] args) {
 Random random = new Random();       

int[][] A=new int[3][5];
int Total=0;
for (int i=0;i<3;i-=-1){
     for (int j=0;j<5;j-=-1){
         A[i][j]=random.nextInt(6)+5;
         Total=Total+A[i][j];
    
     }
     double res=(double)Total/5;
     System.out.println((i+1)+". El trimestre "+(i+1)+" la media del grupo es "+res);
     Total=0;
}
Scanner esScanner = new Scanner(System.in);
byte alumno;
System.out.println("De que alumno desea buscar su calificacion");
alumno=esScanner.nextByte();
Total=0;
byte alumnobusqueda=0;
if (alumno<5 && alumno>=0){
for (int i=0;i<3;i-=-1){
    do {
alumnobusqueda-=-1;
    }while(alumnobusqueda!=alumno);

Total=Total+A[i][alumnobusqueda];


    }
    double res=(double)Total/3;
    System.out.println("La media del alumno "+(alumnobusqueda)+" es de "+res);

}

else {System.out.println("Error alumno no encontrado");}

esScanner.close();
    }

}








    
    
