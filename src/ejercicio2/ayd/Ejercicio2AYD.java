
package ejercicio2.ayd;

import java.util.Scanner;
public class Ejercicio2AYD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc;
        double n;
        do{
            System.out.println("1.Calular la raiz");
            System.out.println("2.Salir");
        
            System.out.println("Ingrese una opcion");
            opc= in.nextInt();
        
            if(opc==1){
                System.out.println("Ingrese un numero para calcular su raiz ");
                n= in.nextInt();
                double resultado= raizCuadrada(n);
                System.out.println("El resultado de la raiz de "+n+" es: "+resultado);
            }
            
        }while(opc!=2);
        
        
    }
    
    public static double raizCuadrada(double n){
        double x = n;
        while(x!=n/x){
            x = 1.0/2.0*((n/x)+x);
        }
        return x;
    }

}
