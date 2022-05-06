package operaciones;

/**
 *
 * @author Camargo
 */
public class Suma {
    private double num1;
    private double num2;
    
    public Suma(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double sumar(){
        return (this.num1 + this.num2);
    }
}
