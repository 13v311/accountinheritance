import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's make some accounts for you!");
        System.out.println("Please enter your name: ");
        String name = input.next();
        System.out.println();
        
        System.out.println("What is your starting credit card balance?");
        double creditBalance = input.nextDouble();
        System.out.println();
        
        System.out.println("What is your credit card's APR?");
        double apr = input.nextDouble();
        System.out.println();
        
        System.out.println("What is your starting checking account balance?");
        double checkingBalance = input.nextDouble();
        System.out.println();
        
        System.out.println("What is your overdraft fee?");
        double fee = input.nextDouble();
        System.out.println();
        
        System.out.println("What is your starting savings account balance?");
        double savingsBalance = input.nextDouble();
        System.out.println();
        
        System.out.println("What is your interest rate?");
        double interest = input.nextDouble();
        
        System.out.println("Loading all account information...");
        //creates all account classes
        Credit creditCard = new Credit(creditBalance, apr);
        Checking checkingAccount = new Checking(checkingBalance, name, fee);
        Savings savingsAccount = new Savings(savingsBalance, name, interest);
        System.out.println("...");
        System.out.println("Welcome to the Bank!");
        System.out.println("...");
        // start of outer while loop with all of the options
        while(true)
        {
            System.out.println("Welcome to the Main Menu!");
            System.out.println();
            System.out.println("Please choose one of the following options (1,2,3,4):");
            System.out.println("1. Credit Card");
            System.out.println("2. Checking");
            System.out.println("3. Savings");
            System.out.println("4. Exit");
            int choice = input.nextInt();
            
            //if user chooses 1, starts inner while loop for credit card
            if(choice == 1)
            {                    
                System.out.println("..."); 
                System.out.println("Credit Card account selected! Loading information...");
                System.out.println("...");
                while(true)
                {
                    System.out.println();
                    //options
                    System.out.println("Please select one of the following options (1,2,3,4,5):");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Make Purchase");
                    System.out.println("3. Display Monthly Statement");
                    System.out.println("4. Create Monthly Payments");
                    System.out.println("5. Back to Main Menu");
                    int option = input.nextInt();
                    
                    //if statements for each option
                    if(option == 1)
                    {
                        System.out.println();
                        System.out.println(creditCard);
                    }
                    
                    else if(option == 2)
                    {
                        System.out.println();
                        System.out.println("How much was your purchase?");
                        double purchase = input.nextDouble();
                        creditCard.makePurchase(purchase);
                        System.out.println("OK! $" + purchase + " was added to your credit balance.");
                    }
                    
                    else if(option == 3)
                    {
                        System.out.println();
                       creditCard.monthlyStatement();
                        
                    }
                    
                    else if(option == 4)
                    {
                        System.out.println();
                        System.out.println("Great choice! Please enter the number of months you would like your balance paid off by: ");
                        int months = input.nextInt();
                        String result = " " + creditCard.monthsToPayOff(months);
                        
                        //rounding the result
                            double payOff = creditCard.monthsToPayOff(months);
                              double roundOff = Math.round(payOff * 100.0) / 100.0;  
              
                            System.out.println("Your monthly payment will be: $" + roundOff);
                    }
                
                    else if(option == 5)
                    {
                        System.out.println();
                        System.out.println("Logging out of Credit Account...");
                       System.out.println("...");
                        break;
                    }
                    
                //if they choose a number other than 1-5, while inner loop restarts
                    else
                    {
                        System.out.println();
                        System.out.println("You typed a choice that isn't here, please try again!");
                    }
                    System.out.println();
                }
            }   
            
            //if user chooses 2, inner while loop starts for checking account
            else if(choice == 2)
            {
                System.out.println("...");
                System.out.println("Checking Account selected! Loading information...");
                System.out.println("...");
                while(true)
                {
                    System.out.println();
                    //options
                    System.out.println("Please choose one of the following options (1,2,3,4):");
                    System.out.println("1. Check Balance & Other Details");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Back to Main Menu");
                    int option = input.nextInt();
                    
                    //options
                    if(option == 1)
                    {
                        System.out.println();
                        System.out.println("Here are the details of your Checking Account: " + '\n' + checkingAccount);
                    }
                    
                    else if (option == 2)
                    {
                        System.out.println();
                        System.out.println("How much would you like to withdraw?");
                        double withdraw = input.nextDouble();
                        checkingAccount.withdraw(withdraw, true);
                        System.out.println("OK! A total of $" + withdraw + " was withdrawn from your checking account!");
                    }
                    
                    else if (option == 3)
                    {
                        System.out.println();
                        System.out.println("How much would you like to deposit?");
                        double deposit = input.nextDouble();
                        checkingAccount.deposit(deposit);
                        System.out.println("OK! A total of $" + deposit + " was deposited into your checking account!");
                    }
                    
                    else if (option == 4)
                    {
                        System.out.println();
                        System.out.println("Logging out of Checking Account...");
                       System.out.println("...");
                        break;
                    }
                    
                    else
                    {
                        System.out.println();
                        System.out.println("You typed a choice that isn't here, please try again!");
                    }
                    System.out.println();
                }
            }
            
            else if(choice == 3)
            {
                System.out.println("...");
                System.out.println("Savings Account selected! Loading information...");
                System.out.println("...");
                while(true)
                {
                   System.out.println();
                   System.out.println("Please choose one of the following options (1,2,3,4,5): ");
                   System.out.println("1. Check Balance & Additional Info");
                   System.out.println("2. Withdraw");
                   System.out.println("3. Deposit");
                   System.out.println("4. Display Months After Goal");
                   System.out.println("5. Back to Main Menu");
                   int option = input.nextInt();
                   
                   if(option == 1)
                   {
                       System.out.println();
                       System.out.println("Here are the details of your Savings Account: " + '\n' + savingsAccount);
                   }
                   
                   else if(option == 2)
                   {
                       System.out.println();
                       System.out.println("How much would you like to withdraw?");
                       double withdraw = input.nextDouble();
                       savingsAccount.withdraw(withdraw, false);
                    System.out.println("OK! A total of $" + withdraw + " was withdrawn from your savings account!");
                       
                   }
                   
                   else if(option == 3)
                   {
                       System.out.println();
                       System.out.println("How much would like to deposit?");
                       double deposit = input.nextDouble();
                       savingsAccount.deposit(deposit);
                       System.out.println("OK! A total of $" + deposit + " was deposited into your savings account!");
                   }
                   
                   else if(option == 4)
                   {
                       System.out.println();
                       System.out.println("How much would you like to save up to?");
                       double amount = input.nextDouble();
                       int months = (int)(savingsAccount.amountInAccount(amount));
                       System.out.println("To get to $" + amount + ", you will need to save for " + months + " months.");
                       
                   }
                   
                   else if(option == 5)
                   {
                       System.out.println();
                       System.out.println("Logging out of Savings Account...");
                       System.out.println("...");
                       break;
                   }
                   else
                   {
                       System.out.println("You typed a choice that isn't here, please try again!");
                   }
                }
            }
            
            else if(choice == 4)
            {
                System.out.println();
                System.out.println("Signing off...");
                System.out.println("...");
                break;
            }
            
            // if they choose a number other than 1-4, starts whole loop over
            else
            {
                System.out.println();
                System.out.println("You typed a choice that isn't here, please try again!");
            }
            input.nextLine();
        }
    }
}