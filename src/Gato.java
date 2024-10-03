// HERENCIA
public class Gato extends Animal {
    public Gato(String name, String color, int age){
        super(name, color, age);
    }

    // POLIMORFISMO
    @Override
    public String hacerSonido(){
        return "Sonido de gato";
    }
}
