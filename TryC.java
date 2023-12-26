import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        int ID; 
        
        try
        {
            System.out.print("Enter your ID : ");
            ID = scanner.nextInt();
        
            System.out.print("Your ID is : " + ID);
        }

        catch (Exception  e)
        {
            System.out.println("Please use the correct format , Try again ");
        }

        finally
        {
            System.out.println("\nThe catch try is succesfull");
        }
        
    }
}