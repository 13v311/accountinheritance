public class Savings extends Bank{
   private double interest;
    
    public Savings()
    {
        super();
        interest = 0;
    }
    
    public Savings(double balance, String name, double interest)
    {
        super(balance, name);
        this.interest = interest;
    }
    
    public double getInterest()
    {
        return interest;
    }
    
    public void setInterest(double interest)
    {
        this.interest = interest;
    }
    
    public int amountInAccount(double a)
    {
        double b = super.getBalance();
        double r = interest/100;
        int t = (int)((Math.log(a/b))/(12 * (Math.log(1+(r/12)))));
        return t + 1;
    }
    
    @Override
    public void withdraw(double amount, boolean checking)
    {
        super.withdraw(amount, false);
    }
    
    public String toString()
    {
        return super.toString() + '\n' + "Interest Rate: " + interest + "%";
    }
}
