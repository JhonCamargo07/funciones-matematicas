package operaciones;

/**
 *
 * @author Camargo
 */
public class Division {
    private double num1;
    private double num2;
    private double result;
    
    public Division(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double dividir(){
        result = 0;
        if(this.num2 == 0){
            System.out.println("No se puede dividir en 0");
            this.result = 0;
        }else if(this.num2 == this.num1){
            this.result = 1;
        }else{
   
            for(int i = 1; i<=this.num1; i++){
                // En cada iteracion se suma el valor de la variable suma mas num2
                this.result = this.num2 + this.result;
                
                // Si el resultado ya es igual a num1 se retorna la cantidad de iteraciones que ha hecho el ciclo
                if(this.result == this.num1){
                    this.result = i;
                    break;
                }else if(this.result > this.num1){
                    // Si el resultado ya es mayor a num1 se hace otro for para contar los decimales
                    double decimal = 0;
                    decimal = decimal + 0.1;
                    if(decimal > 0.9){
                        decimal = 0.0;
                        continue;
                    }
                    // Se resta a la cantidad de iteraciones 1 porque si entra en esta parte del codigo queire decir que el resultado ya es mayor a num1, despues se le añaden los decimales
                    this.result = (i-1) + decimal;
                    break;
                }
            }
        }
        return this.result;
    }
}
