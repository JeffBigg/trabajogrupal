
package calcu;

import java.util.Scanner;

public class Calcu {

    public static void main(String[] args) {
        //declarando variables
        int n1,n2, suma, resta,operacion = 0;
        Scanner teclado = new Scanner(System.in);
        
        if (operacion == 1){
                System.out.print("Introdusca el primer numero: ");
                n1 = teclado.nextInt();
                System.out.print("Introdusca el segundo numero: ");
                n2 = teclado.nextInt();

                suma = n1 + n2;
                System.out.println("la suma es "+ suma);
                
                else{
                System.out.println("ESCOJA EL NUMERO CORRECTO");
            }
    }
    
}
