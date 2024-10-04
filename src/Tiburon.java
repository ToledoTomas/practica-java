import interfaces.Alimentable;
import interfaces.Comunicable;

public class Tiburon extends AnimalesMarinos implements Comunicable, Alimentable{

    public Tiburon(String nombre, String color){
        super(nombre, color);
    }

    @Override
    public void nadar(){
        System.out.println("El tiburon " + nombre + " de color "+ color + " está nadando.");
    }

    // INTERFACES
    @Override
    public void comunicarse(){
        System.out.println("El tiburon " + nombre + " se comunica");
    }

    @Override
    public void alimentarse(){
        System.out.println("El tiburon " + nombre + " se esta alimentando");
    }

}
