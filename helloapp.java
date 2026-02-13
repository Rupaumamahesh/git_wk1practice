import java.util.Scanner;

public class helloapp{
    public static void main(String[] args) {
        System.out.println("Hello App!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string here:");
        String user_input = sc.nextLine();
        System.out.println(user_input);
    }
}