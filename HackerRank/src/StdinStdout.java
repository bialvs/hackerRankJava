import java.util.*; 

public class StdinStdout {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            for(int i = 0 ; i < 3; i++){
                int x = scanner.nextInt();
                System.out.println(x);
            }
        }
    }
    
}
