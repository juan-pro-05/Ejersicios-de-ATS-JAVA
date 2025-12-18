/*Una empresa que se dedocac a la venta de 
 * desinfectanrwa nwcesita un programa para gestionar
 * las facturas. En cada factura figura el codigo
 * del articulo, la cantidad vendida en litros
 * y el precio por litros. Se pide de 5 facturas introducidas
 * facturacion total, cantidad en litros vendidos del articulo 1 
 * y cuantas facturas se emitieron de mas de 600
 */
import java.util.Scanner;
public class ejercicio17c {
    public static void main (String []args){
Scanner entrada = new Scanner(System.in);
int factura=0,precio,codigo,litros,litrosvendidos=0,mas600=0,facturatotal=0,litrosvendidos1=0;


for (int i=1;i<=5;i++){
System.out.println("Factura "+i+" dime el codigo del articulo");
codigo=entrada.nextInt();
System.out.println("Dime la cantidad de litros vendidos");
litros=entrada.nextInt();
litrosvendidos+=litros;
System.out.println("Precio del articulo");
precio=entrada.nextInt();
factura=litros*precio;
facturatotal+=factura;
if (codigo==1){
litrosvendidos1+=litros;
}
if (factura>600){
    mas600++;
}
}
System.out.println("Cantidad de litros vendida fue "+litrosvendidos);
System.out.println("Factuaracion total "+facturatotal);
System.out.println("Cantidad de litros vendidos del articulo 1: "+litrosvendidos1);
System.out.println("Facturas emitidas mas de $600 fueron "+mas600);


entrada.close();
        
    }
    
}
