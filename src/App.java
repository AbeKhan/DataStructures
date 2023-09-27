import java.util.HashMap;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<String, Student>();
        boolean exit = false;
        
        while (!exit)
        {
            menu();

            System.out.println("Please enter a value.");
            String holder = scan.nextLine();
            
            int input = Integer.parseInt(holder);
            switch(input)
            {
            case 1:
                System.out.println("Please enter student ID: ");
                String ID = scan.nextLine();
                System.out.println("Please enter Name: ");
                String name = scan.nextLine();
                Student a = new Student(name, ID);
                students.put(ID, a);
                System.out.println(students);
                break;

            case 2:
                //System.out.println("It works");
                System.out.println("Please enter student ID: ");
                 ID = scan.nextLine();
                 boolean found = false;
                 for (String i : students.keySet()) 
              {
                if (ID.equals(i))
                {
                    System.out.println("Found student: " + "ID: " + i + " Name: " + students.get(i).getName());
                    found = true;
                    break;
                }
              }      
              if (!found)
              {
                System.out.println("Student not found.");
              }
               
                break;
            case 3:
                System.out.println("Please enter student ID: ");
                ID = scan.nextLine();
              if(students.containsKey(ID))
              {
                System.out.println("Student has been removed.");
                students.remove(ID);
              }
              else
              {
                System.out.println("ID invalid, try again.");
              } 
                break;
            
            case 4:
            for (String i : students.keySet()) 
              {
                System.out.println("ID: " + i + " Name: " + students.get(i).getName());
              }
              break;
            case 5:
                exit = true;
                System.out.println("You have exited the program.");
                break;
            }
            

        }

    }


    public static void menu()
    {
        System.out.println("1 - Add student");
        System.out.println("2 - Find student");
        System.out.println("3 - Delete student");
        System.out.println("4 - Show all students");
        System.out.println("5 - Exit");
    }
}
