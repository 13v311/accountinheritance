public class Credit extends Account{
   private double apr;
    
   public Credit()
   {
       super();
       apr = 0;
   }
   
   public Credit(double balance, double apr)
   {
       super(balance);
       this.apr = apr;
   }
   
   public double getAPR()
   {
       return apr;
   }
   
   public void setAPR(double apr)
   {
       this.apr = apr;
   }
   
   public void makePurchase(double purchase)
   {
       double newBalance = super.getBalance() + purchase;
       super.setBalance(newBalance);
   }
   
   public void monthlyStatement()
   {
       double pastDue = (super.getBalance() * ((apr/100)/12)) + super.getBalance();
       System.out.println("Your balance will be " + super.getBalance() + " if you pay it on time.");
       System.out.println("If you do not pay it on time, it will be " + (pastDue));
   }
   
   public double monthsToPayOff(int months)
   {
       double r = (apr/100)/12;
       double p = super.getBalance();
       double a = p * (r * ((Math.pow(1+r, months)/((Math.pow(1+r, months))-1))));
       return a;
   }
   
   @Override
   public String toString()
   {
       return super.toString() + '\n' + "APR: " + apr;
   }
}
