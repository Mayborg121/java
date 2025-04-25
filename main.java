import java.util.Scanner;


public class main{

     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        
        // JAVA BANKING PROGRAM

        
        double balance = 124.99;
        boolean IsRunning = true;
        int choice;

        while(IsRunning){
            clearConsole();
            System.out.println("*************************");
            System.out.println("---- BANKING PROGRAM ----");
            System.out.println("*************************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. EXIT");
            System.out.println("*************************");

            System.out.print("ENTER YOUR CHOICE 1-4 : ");
            choice = scanner.nextInt();
            System.out.println("*************************");

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit(balance);
                case 3 -> balance -= withdraw(balance);
                case 4 -> IsRunning = false;
                default -> System.out.print("Invalid Choice");
                }
        }



        System.out.println("--- Thank You! Have a Good Day. ---");
        System.out.println("*************************");
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Balance : $%.2f\n", balance);
    }

    static double deposit(double balance){
        double amount;
        System.out.print("Enter an Amount: ");
        amount = scanner.nextDouble();

        if(amount<0){
            System.out.println("Amount Cant be Negative");
            return 0;
        }else {
            System.out.printf("Deposited $%.2f, ", amount );
            System.out.printf("Current Balance : $%.2f \n",balance+amount);
            return amount;
        }
    }

    static double withdraw(double balance){

        double amount;

        System.out.print("Enter Amount to Withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.print("* Insufficient Balance *");
            return 0;
        }else if(amount<0){
            System.out.print("Cant Withdraw Negative.");
            return 0;
        } else{
            System.out.printf("Withdrawn $%.2f, ", amount);
            System.out.printf("Current Balance : $%.2f \n",balance-amount);
            return amount;
        }

    }

    public final static void clearConsole(){
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
}