public class Account {
   private int id;
   private double balance;
   
   public Account()
   {
       id = (int)(Math.random()*99999) + 1;
       balance = 0;
   }
   
   public Account(double balance)
   {
       id = (int)(Math.random()*99999) + 1;
       this.balance = balance;
   }
   
   public int getID()
   {
       return id;
   }
   
   public double getBalance()
   {
       return balance;
   }
   
   public void setID(int newID)
   {
       if(newID >= 1 && newID <= 99999)
       {
           id = newID;
       }
   }
   
   public void setBalance(double balance)
   {
       this.balance = balance;
   }
   
   //method that changes the ID to print as five digits as instructed
   public String fiveDigits()
   {
       String fiveDigits = "";
       if(id >=1 && id < 10)
       {
           fiveDigits = "0000" + id;
           return fiveDigits;
       }
       else if(id < 100)
       {
           fiveDigits = "000" + id;
           return fiveDigits;
       }
       else if(id < 1000)
       {
           fiveDigits = "00" + id;
           return fiveDigits;
       }
       else if(id < 10000)
       {
          fiveDigits = "0" + id;
          return fiveDigits;
       }
       fiveDigits = id + "";
       return fiveDigits;
   }
   
   public String toString()
   {
       return "Account ID: " + fiveDigits() + '\n' + "Balance: " + balance;
   }
}
