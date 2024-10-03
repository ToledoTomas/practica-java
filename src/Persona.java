public class Persona {
    String name;
    String surname;
    int age;
    Carrera carrera;

    // CONSTRUCTOR
    public Persona(String name, String surname, int age, String nameCarrera, int duration, boolean isCursed){
        carrera = new Carrera(nameCarrera, duration, isCursed);
        this.name = name;
        this.surname = surname;
        this.age = age;
        carrera.name = nameCarrera;
    }

    public String getFullName(){
        return "I am " + name + " " + surname;
    }

    public String greet(String friend){
        return "Hello, my friend " + friend + "!";
    }

    public String getCareer(){
        return "I am a " + name + " " + surname + " and studying " + carrera.name + ". This career has " + carrera.duration + " years.";
    }
}
