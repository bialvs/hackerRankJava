import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================");
        
        for(int i = 0; i < 3; i++){
        
            String entradaTexto = scanner.next();
            int entradaInteiro = scanner.nextInt();

            System.out.printf("%-15s%03d%n", entradaTexto, entradaInteiro);
            
        }
        
        System.out.println("================================");
    
        scanner.close();
    }
}
