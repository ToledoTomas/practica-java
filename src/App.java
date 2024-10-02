import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Variables
        int num = 10;
        double pi = 3.14;
        boolean isTrue = true;
        char letter = 'a';
        String chain = "Hello, World!";

        // Condicionales
        // if(num > 5){
        //     System.out.println("The number is greater than 5");
        // } else {
        //     System.out.println("The number is less than 5");
        // }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option: ");
        System.out.println("1. Letter 'a'");
        System.out.println("2. Letter 'b'");
        System.out.println("3. Letter 'c'");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("The letter is 'a'");
                break;
            case 2:
                System.out.println("The letter is 'b'");
                break;
            case 3:
                System.out.println("The letter is 'c'");
                break;
            default:
                System.out.println("The letter is not 'a', 'b', or 'c'");
                break;
        }

        scanner.close();
    }
}
