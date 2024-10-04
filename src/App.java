// import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // ***************
        // VARIABLES
        // ***************

        // int num = 10;
        // double pi = 3.14;
        // boolean isTrue = true;
        // char letter = 'a';
        // String chain = "Hello, World!";

        // ***************
        // CONDICIONALES
        // ***************

        // if(num > 5){
        //     System.out.println("The number is greater than 5");
        // } else {
        //     System.out.println("The number is less than 5");
        // }

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Choose an option: ");
        // System.out.println("1. Letter 'a'");
        // System.out.println("2. Letter 'b'");
        // System.out.println("3. Letter 'c'");

        // int option = scanner.nextInt();

        // switch (option) {
        //     case 1:
        //         System.out.println("The letter is 'a'");
        //         break;
        //     case 2:
        //         System.out.println("The letter is 'b'");
        //         break;
        //     case 3:
        //         System.out.println("The letter is 'c'");
        //         break;
        //     default:
        //         System.out.println("The letter is not 'a', 'b', or 'c'");
        //         break;
        // }

        // scanner.close();

        // ***************
        // BUCLES
        // ***************

        // for(int i = 0; i <= 3; i++){
        //     for(int j = 1; j < 3; j++){
        //         System.out.print(i);
        //         System.out.print(" ");
        //         System.out.print(j);
        //         System.out.print(" ");
        //     }
        // }

        // while(num >= 5){
        //     System.out.println("Now the number is: " + num);
        //     System.out.println("The number is greater or equal than 5");
        //     num--;
        // }

        // ***************
        // ARRAYS
        // ***************

        // int[] numbers = new int[5];
        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;
        // numbers[3] = 40;
        // numbers[4] = 50;

        // int [] numbers = {10, 20, 30, 40, 50};

        // for(int i=0; i<numbers.length; i++){
        //     System.out.println(numbers[i]);
        // }

        // ***************
        // CLASES
        // ***************

        // Persona persona1 = new Persona();
        // persona1.name = "Mono";
        // persona1.surname = "Toledo";
        // persona1.age = 26;

        // Carrera carrera1 = new Carrera();
        // carrera1.name = "Ingenieria de Software";
        // carrera1.duration = 5;
        // carrera1.isCursed = true;

        // persona1.carrera = carrera1;

        // System.out.println(persona1.getFullName());
        // System.out.println(persona1.greet("Muke"));

        // System.out.println(persona1.carrera.getCarrera());

        // Persona persona2 = new Persona("Mono", "Toledo", 26, "Ingenieria de Software", 5, true);
        
        // System.out.println(persona2.getCareer());

        // ***************
        // ENCAPSULAMIENTO
        // ***************

        // Animal animal = new Animal("Mono", "Blanco", 5);
        // System.out.println(animal.getEdad());

        // animal.setEdad(7);

        // System.out.println(animal.getEdad());

        // ***************
        // STATIC
        // ***************

        // Animal animal = new Animal("Generico", "Negro", 6);
        // System.out.println("Cantidad de animales creados: " + Animal.getCantidadAnimales());
        // Perro cholo = new Perro("Cholo", "Blanco", 8);
        // System.out.println("Cantidad de animales creados: " + Animal.getCantidadAnimales());
        // Gato gatica = new Gato("Gatica", "Gris", 1);
        // System.out.println("Cantidad de animales creados: " + Animal.getCantidadAnimales());

        // System.out.println(animal.hacerSonido());
        // System.out.println(cholo.hacerSonido());
        // System.out.println(gatica.hacerSonido());

        // ***************
        // ABSTRACT
        // ***************

        // Circulo circulo = new Circulo(10);
        // Rectangulo rectangulo = new Rectangulo(3, 5);

        // circulo.imprimirInformacion();
        // System.out.println("El area de un circulo es: " + circulo.area());
        // rectangulo.imprimirInformacion();
        // System.out.println("El area de un rectangulo es: " + rectangulo.area());


        // ***************
        // INTERFACES
        // ***************

        Tiburon tiburon = new Tiburon("tiburoncin", "azul");
        Delfin delfin = new Delfin("delfincito", "blanco");

        tiburon.nadar();
        tiburon.comunicarse();
        tiburon.alimentarse();
        delfin.nadar();
        delfin.comunicarse();
        delfin.alimentarse();

    }
}
