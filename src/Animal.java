public class Animal {
    private String name;
    private String color;
    private int age;
    static int cantidadAnimales = 0;


    public Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
        cantidadAnimales++;
    }

    public String hacerSonido(){
        return "Hago sonido genérico";
    }

    // ENCAPSULAMIENTO
    public int getEdad(){
        return age;
    }

    public void setEdad(int age){
        this.age = age;
    }

    public static int getCantidadAnimales(){
        return cantidadAnimales;
    }
}