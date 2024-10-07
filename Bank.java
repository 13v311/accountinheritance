public class Bank extends Account {
   private String name;
    
    public Bank()
    {
        super();
        name = "unknown";
    }
    
    public Bank(double balance, String name)
    {
        super(balance);
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
    
    public void deposit(double amount)
    {
        double newBalance = super.getBalance() + amount;
        super.setBalance(newBalance);
    }
    
    public void withdraw(double amount, boolean checking)
    {
        if(super.getBalance() - amount < 0)
        {
            if(checking)
            {
                double newBalance = super.getBalance() - amount;
                super.setBalance(newBalance);
            }
            else
            {
                System.out.println("The amount you'd like to withdraw exceeds your balance.");
            }
        }
        else if(super.getBalance() - amount > 0)
        {
            double newBalance = super.getBalance() - amount;
                super.setBalance(newBalance);
        }
    }
    
    @Override
    public String toString()
    {
        return "Name: " + name + '\n' + super.toString();
    }
}
