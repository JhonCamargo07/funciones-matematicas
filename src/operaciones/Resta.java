package operaciones;

/**
 *
 * @author Camargo
 */
public class Resta {
    private double num1;
    private double num2;
    
    public Resta(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double restar(){
        return (this.num1 - this.num2);
    }
}
