package operaciones;

/**
 *
 * @author Camargo
 */
public class Multiplicacion {
    private double num1;
    private double num2;
    private double result;
    
    public Multiplicacion(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double multiplicar(){
        this.result = 0;
        // A la variable result se le suma su propio valor mas el del num1 hasta que las iteraciones del ciclo hayan sido igual a num2
        for(int i = 0; i < num2; i++){
            this.result = this.num1 + this.result;
        }
        return this.result;
    }
    
}
