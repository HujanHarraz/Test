import java.util.Scanner;

class Bank {

    private long accnum;

    public Bank (long accnum)
    {
        this.accnum=accnum;
    }

    public long getAcc()
    {
        return accnum;
    }

    public void setAcc(long accnum)
    {
        this.accnum = accnum;
    }
}

class Customer extends Bank {

    private String name;
    
    public Customer (long accnum , String name)
    {
        super(accnum);
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }       
}

class Deposit extends Bank {

    private Double payment;

    public Deposit (long accnum , Double payment)
    {
        super(accnum);
        this.payment = payment;
    }
    
    public Double getPayment()
    {
        return payment;
    }

    public void setPayment(Double payment)
    {
        this.payment = payment;
    }
}

public class Main {
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine  ();

        System.out.print("Enter your account number: ");
        long     = scanner.nextLong();

        System.out.print("Enter your payment: ");
        Double payment = scanner.nextDouble();

        Customer customer = new Customer (accnum, name);
        Deposit deposit = new Deposit ( accnum, payment);

        System.out.println("\nCustomer Details:");
        System.out.println("Account Number: " + customer.getAcc());
        System.out.println("Customer Name: " + customer.getName());

        System.out.println("\nDeposit Details:");
        System.out.println("Account Number: " + deposit.getAcc());
        System.out.println("Deposit Amount: " + deposit.getPayment());
    }
}