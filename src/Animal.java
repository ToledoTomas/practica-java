public class Animal {
    private String name;
    private String color;
    private int age;


    public Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
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
}