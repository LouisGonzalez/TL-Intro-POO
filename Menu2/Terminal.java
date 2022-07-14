import java.util.Scanner;

public class Terminal {
    
    public static int askNumber(String message){
        Scanner scanner = new Scanner(System.in);
        showMessage(message);
        return scanner.nextInt();
    }

    public static void showMessage(String message){
        System.out.println(message);
    }

}
