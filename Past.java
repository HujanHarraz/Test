import java.util.Scanner;
import java.text.DecimalFormat;

class Bank
{

    public String name;
    public int id;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            Account1 account1 = new Account1();
            Account2 account2 = new Account2();
    
            System.out.println("Account 1");
            System.out.print("Enter your name: ");
            String name1 = scanner.nextLine();
            account1.setName(name1);
    
            System.out.print("Enter your ID: ");
            int id1 = scanner.nextInt();
            account1.id = id1; // Set ID using the superclass variable directly
    
            System.out.print("Enter your amount: ");
            double amount1 = scanner.nextDouble();
            account1.setAmount(amount1);
    
            // Displaying entered information for Account 1
            System.out.println("Your name is: " + account1.getName());
            System.out.println("Your ID is: " + account1.id); // Access ID using the superclass variable directly
            DecimalFormat decimalFormat1 = new DecimalFormat("RM#.00");
            System.out.println("Your amount is: " + decimalFormat1.format(account1.getAmount()));
    
            scanner.nextLine(); // Consume newline character
    
            System.out.println("\nAccount 2");
            System.out.print("Enter your name: ");
            String name2 = scanner.nextLine();
            account2.setName(name2);
    
            System.out.print("Enter your ID: ");
            int id2 = scanner.nextInt();
            account2.id = id2; // Set ID using the superclass variable directly
    
            System.out.print("Enter your amount: ");
            double amount2 = scanner.nextDouble();
            account2.setAmount(amount2);
    
            // Displaying entered information for Account 2
            System.out.println("Your name is: " + account2.getName());
            System.out.println("Your ID is: " + account2.id); // Access ID using the superclass variable directly
            DecimalFormat decimalFormat2 = new DecimalFormat("RM#.00");
            System.out.println("Your amount is: " + decimalFormat2.format(account2.getAmount()));
    
            scanner.close();
        }
    }
}

class Account1 extends Bank
{

    public double amount;
    
    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getID()
    {
        return id;
    }

    public void setID()
    {
        this.id = id;
    }

}

class Account2 extends Account1
{
    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getID()
    {
        return id;
    }

    public void setID()
    {
        this.id = id;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account1 account1 = new Account1();
        Account2 account2 = new Account2();

        System.out.println("Account 1");
        System.out.print("Enter your name: ");
        String name1 = scanner.nextLine();
        account1.setName(name1);

        System.out.print("Enter your ID: ");
        int id1 = scanner.nextInt();
        account1.id = id1; // Set ID using the superclass variable directly

        System.out.print("Enter your amount: ");
        double amount1 = scanner.nextDouble();
        account1.setAmount(amount1);

        // Displaying entered information for Account 1
        System.out.println("Your name is: " + account1.getName());
        System.out.println("Your ID is: " + account1.id); // Access ID using the superclass variable directly
        DecimalFormat decimalFormat1 = new DecimalFormat("RM#.00");
        System.out.println("Your amount is: " + decimalFormat1.format(account1.getAmount()));

        scanner.nextLine(); // Consume newline character

        System.out.println("\nAccount 2");
        System.out.print("Enter your name: ");
        String name2 = scanner.nextLine();
        account2.setName(name2);

        System.out.print("Enter your ID: ");
        int id2 = scanner.nextInt();
        account2.id = id2; // Set ID using the superclass variable directly

        System.out.print("Enter your amount: ");
        double amount2 = scanner.nextDouble();
        account2.setAmount(amount2);

        // Displaying entered information for Account 2
        System.out.println("Your name is: " + account2.getName());
        System.out.println("Your ID is: " + account2.id); // Access ID using the superclass variable directly
        DecimalFormat decimalFormat2 = new DecimalFormat("RM#.00");
        System.out.println("Your amount is: " + decimalFormat2.format(account2.getAmount()));

        scanner.close();
    }
}