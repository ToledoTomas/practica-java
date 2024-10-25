// import java.util.Scanner;

// import java.util.ArrayList;
import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;
import java.util.Map;

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
        // System.out.println("The number is greater than 5");
        // } else {
        // System.out.println("The number is less than 5");
        // }

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Choose an option: ");
        // System.out.println("1. Letter 'a'");
        // System.out.println("2. Letter 'b'");
        // System.out.println("3. Letter 'c'");

        // int option = scanner.nextInt();

        // switch (option) {
        // case 1:
        // System.out.println("The letter is 'a'");
        // break;
        // case 2:
        // System.out.println("The letter is 'b'");
        // break;
        // case 3:
        // System.out.println("The letter is 'c'");
        // break;
        // default:
        // System.out.println("The letter is not 'a', 'b', or 'c'");
        // break;
        // }

        // scanner.close();

        // ***************
        // BUCLES
        // ***************

        // for(int i = 0; i <= 3; i++){
        // for(int j = 1; j < 3; j++){
        // System.out.print(i);
        // System.out.print(" ");
        // System.out.print(j);
        // System.out.print(" ");
        // }
        // }

        // while(num >= 5){
        // System.out.println("Now the number is: " + num);
        // System.out.println("The number is greater or equal than 5");
        // num--;
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
        // System.out.println(numbers[i]);
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

        // Persona persona2 = new Persona("Mono", "Toledo", 26, "Ingenieria de
        // Software", 5, true);

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
        // System.out.println("Cantidad de animales creados: " +
        // Animal.getCantidadAnimales());
        // Perro cholo = new Perro("Cholo", "Blanco", 8);
        // System.out.println("Cantidad de animales creados: " +
        // Animal.getCantidadAnimales());
        // Gato gatica = new Gato("Gatica", "Gris", 1);
        // System.out.println("Cantidad de animales creados: " +
        // Animal.getCantidadAnimales());

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

        // Tiburon tiburon = new Tiburon("tiburoncin", "azul");
        // Delfin delfin = new Delfin("delfincito", "blanco");

        // tiburon.nadar();
        // tiburon.comunicarse();
        // tiburon.alimentarse();
        // delfin.nadar();
        // delfin.comunicarse();
        // delfin.alimentarse();

        // ***************
        // TRY / CATCH
        // ***************

        // try {
        // int[] numeros = {1, 2, 3, 4, 5};
        // System.out.println(numeros[3]);
        // System.out.println("Todo ha ido bien");
        // } catch (Exception e) {
        // e.printStackTrace();
        // System.out.println("Ha habido un error");
        // }

        // ***************
        // EXCEPTIONS
        // ***************

        // Calculadora calculadora = new Calculadora();

        // System.out.println(calculadora.dividir(10, 5));

        // ***************
        // SETS
        // ***************

        // System.out.println("Bienvenido a la fiesta de los superheroes");

        // Set<String> superHeroes = new HashSet<>();

        // superHeroes.add("Spiderman");
        // superHeroes.add("Hulk");
        // superHeroes.add("Iron Man");
        // superHeroes.add("Thor");
        // superHeroes.add("Capitan America");

        // if(superHeroes.contains("Spiderman")){
        // System.out.println("Spíderman está en la fiesta");
        // }

        // superHeroes.remove("Iron Man");

        // if(!superHeroes.contains("Iron Man")){

        // System.out.println("Iron Man se fue de la fiesta");
        // }

        // if(superHeroes.isEmpty()){
        // System.out.println("La fiesta no tiene superHeroes");
        // } else {
        // System.out.println("La fiesta tiene " + superHeroes.size() + " superHeroes");
        // }

        // for (String superHeroe : superHeroes) {
        // System.out.println(superHeroe);
        // }

        // ***************
        // LISTS
        // ***************

        // System.out.println("Bienvenido a la fiesta de los superheroes");

        // List<String> superHeroes = new ArrayList<>();

        // superHeroes.add("Spiderman");
        // superHeroes.add("Hulk");
        // superHeroes.add("Iron Man");
        // superHeroes.add("Thor");
        // superHeroes.add("Capitan America");

        // superHeroes.add("Spiderman");
        // superHeroes.add("Spiderman");
        // superHeroes.add("Spiderman");

        // if (superHeroes.contains("Spiderman")) {
        //     System.out.println("Spíderman está en la fiesta");
        // }

        // superHeroes.remove(3);

        // if (!superHeroes.contains("Thor")) {

        //     System.out.println("El superHeroe Thor se fue de la fiesta");
        // }

        // superHeroes.set(2, "Flash");

        // if (superHeroes.isEmpty()) {
        //     System.out.println("La fiesta no tiene superHeroes");
        // } else {
        //     System.out.println("La fiesta tiene " + superHeroes.size() + " superHeroes");
        // }

        // for (String superHeroe : superHeroes) {
        //     System.out.println(superHeroe);
        // }

        // ***************
        // MAPS
        // ***************

        System.out.println("Bienvenido a nuestra verdulería");

        Map<String, Integer> inventario = new HashMap<>();

        inventario.put("Banana", 1500);
        inventario.put("Manzana", 2000);
        inventario.put("Pera", 3000);
        inventario.put("Naranja", 2500);
        inventario.put("Uva", 4000);

        System.out.println("Este es el inventario de frutas y verduras: ");

        for (String fruta : inventario.keySet()) {
            System.out.println(fruta + ": $" + inventario.get(fruta));
            
        }

        String frutaBuscada = "Banana";
        System.out.println("Se acerca un cliente y nos pide la siguiente fruta: " + frutaBuscada);

        if(inventario.containsKey(frutaBuscada)){
            System.out.println("La fruta se encuentra en el inventario");
        } else {
            System.out.println("La fruta no se encuentra en el inventario");
        }

        String sinStock = "Uvas";
        inventario.remove(sinStock);

        System.out.println("Nos hemos quedado sin: " + sinStock);

        System.out.println("La cantidad de mercadería es de " + inventario.size() + " frutas");

    }
}
