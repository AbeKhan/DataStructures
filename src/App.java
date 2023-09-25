import java.util.HashMap;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Add student");
        System.out.println("2 - Find student");
        System.out.println("3 - Delete student");
        System.out.println("4 - Show all students");
        System.out.println("5 - Exit");

        String input = scan.nextLine();
    }
}
