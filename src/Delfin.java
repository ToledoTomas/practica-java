import interfaces.Alimentable;
import interfaces.Comunicable;

public class Delfin extends AnimalesMarinos implements Comunicable, Alimentable {
    
    public Delfin(String nombre, String color){
        super(nombre, color);
    }

    @Override
    public void nadar(){
        System.out.println("El delfin "+ nombre + " de color "+ color + " está nadando");
    }

    // INTERFACES
    @Override
    public void comunicarse(){
        System.out.println("El delfin " + nombre + " se comunica");
    }

    @Override
    public void alimentarse(){
        System.out.println("El delfin " + nombre + " se esta alimentando");
    }

}
