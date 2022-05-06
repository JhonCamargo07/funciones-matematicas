package test;

import java.util.Scanner;
import operaciones.*;

/**
 *
 * @author Camargo
 */
public class TestOperaciones {
    public static void main(String[] args) {
        // Instancia de la clase scanner
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Bienvenido!\nEste programa permite realizar las 4 operaciones basicas\n");
        System.out.println("Por favor ingrese el primer numero:");
        double num1 = Double.parseDouble(consola.nextLine()); // Solicitar num1
        
        System.out.println("Por favor ingrese el segundo numero:");
        double num2 = Double.parseDouble(consola.nextLine()); // Solicitar num2
        
        System.out.println("Escoja una opcion:\n1 = Sumar\n2 = Restar\n3 = Multiplicar\n4 = Dividir");
        int opcion = Integer.parseInt(consola.nextLine()); //Solicitar una opcion
        
        switch(opcion){
            case 1:
                //Instancia de la clase suma
                Suma sumar = new Suma(num1, num2);
                System.out.println("El resultado es: " + sumar.sumar()); //Imprimir el resultado de la operacion
                break;
            case 2:
                // Instancia de la clase resta
                Resta restar = new Resta(num1, num2);
                System.out.println("El resultado es: " + restar.restar()); // Imprimir el resultado de la operacion
                break;
            case 3:
                // Instancia de la clase multiplicacion
                Multiplicacion multiplicar = new Multiplicacion(num1, num2);
                System.out.println("El resultado es: " + multiplicar.multiplicar()); // Imprimir el resultado de la operacion
                break;
            case 4:
                // Instacia de la clase division
                Division dividir = new Division(num1, num2);
                System.out.println("El resultado es: " + dividir.dividir()); // Imprimir el resultado de la operacion
                break;
        }
        
    }
}
