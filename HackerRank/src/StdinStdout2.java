import java.util.Scanner;

public class StdinStdout2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inteiro = scanner.nextInt();
        double decimal = scanner.nextDouble();
        scanner.nextLine();
        String texto = scanner.nextLine();
        
        System.out.println("String: " + texto);
        System.out.println("Double: " + decimal);
        System.out.println("Int: " + inteiro);
        
        scanner.close();
    }
    
}
