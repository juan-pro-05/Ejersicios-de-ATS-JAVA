/*Al ejercicio anterior hacer unas modificaciones suponiendo
que solo existen tres productos con precios:
1-0,6 $/litro
2- 3$/litro
3- 1,25$/litro
 */
import java.util.Scanner;
public class ejercicio18c {
    public static void main (String []args){
   
        Scanner entrada = new Scanner(System.in);
        int codigo,litros,mas600=0,litrosvendidos1=0;
        double costo=0,facturatotal=0;
        
        for (int i=1;i<=5;i++){
        System.out.println("Dime el codigo del articulo");
        codigo=entrada.nextInt();
        switch (codigo){
case 1:System.out.println("Dime la cantidad de litros");
litros=entrada.nextInt();
litros+=litros;
litrosvendidos1+=litros;
costo=(double)litros*0.6;
break;
case 2:System.out.println("Dime la cantidad de litros");
litros=entrada.nextInt();
costo=(double)litros*3;
break;
case 3:System.out.println("Dime la cantidad de litros");
litros=entrada.nextInt();
costo=(double)litros*1.25;
break;
default:System.out.println("Error");
break;


        }
        if (costo>600){
            mas600++;    
        }
        if (costo>600){
            mas600++;
        }
        if (costo>600){
            mas600++;
        }    
        facturatotal+=costo;
        }
        
        System.out.println("Factuaracion total "+facturatotal);
        System.out.println("Cantidad de litros vendidos del articulo 1: "+litrosvendidos1);
        System.out.println("Facturas emitidas mas de $600 fueron "+mas600);
        
        entrada.close();
        }

    
                
   
   
   
   
   
   
   
   
   
    }