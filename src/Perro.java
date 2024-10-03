// HERENCIA
public class Perro extends Animal {
    public Perro(String name, String color, int age){
        super(name, color, age);
    }

    // POLIMORFISMO
    @Override
    public String hacerSonido(){
        return "Sonido de perro";
    }
}
