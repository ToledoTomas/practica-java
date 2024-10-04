import exceptions.CalculadoraException;

public class Calculadora {
    public int dividir(int a, int b) throws CalculadoraException{
        
        if(b == 0){
            throw new CalculadoraException("No se puede dividir por cero");
        }

        return a / b;
    }
    
}
