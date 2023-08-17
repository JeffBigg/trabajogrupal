
package calcu;
import java.util.Scanner;
public class Calcu {
    

    
    public static void main(String[] args) {
    
        while(true){
            System.out.println("CALCULADORA");
            System.out.println("ELIGE UNA OPCIÓN");
            System.out.println("1.SUMA");
            System.out.println("2.RESTA");
            System.out.println("INGRESA OPCION - >");
            operacion = teclado.nextInt();

        }else if (operacion == 2){
                System.out.println("Introduzca el primer número: ");
                n1 = teclado.nextInt();
                System.out.println("Introduzca el segundo número: ");
                n2 = teclado.nextInt();

                resta = n1 - n2;
                System.out.println("LA RESTA ES: "+resta);
                break;

        }
    }
}
