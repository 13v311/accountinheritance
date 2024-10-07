public class Checking extends Bank {
   private double fee;
    
   public Checking()
   {
       super();
       fee = 10;
   }
   
   public Checking(double balance, String name, double fee)
   {
       super(balance, name);
       this.fee = fee;
   }
   
   public double getFee()
   {
       return fee;
   }
   
   public void setFee(double fee)
   {
       this.fee = fee;
   }
   
   @Override
   public void withdraw(double amount, boolean checking)
   {
       super.withdraw(amount, true);
       if(super.getBalance() < 0)
       {
           double newBalance = super.getBalance() - fee;
           super.setBalance(newBalance);
           System.out.println("An additional fee of " + fee + " was taken out of your balance due to your request to withdraw an amount which exceeded your balance. ");
       }
   }
   
   public String toString()
   {
       return super.toString() + '\n' + "Fee: " + fee;
   }
}
