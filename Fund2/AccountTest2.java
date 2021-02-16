import java.util.*;
class AccountTest2
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    BankAccount x1 = new BankAccount("Bob","55879",101.5);
    System.out.println("#1 BankAccount1");
    System.out.println("NAMR: "+x1.getCustomerName());
    System.out.println("ADDR: "+x1.getAccountNumber());
    System.out.println("BALANCE: "+x1.getBalance());
    System.out.println("");

    BankAccount x2 = new BankAccount("Mary","48537",100824.5);
    System.out.println("#2 BankAccount2");
    System.out.println("NAMR: "+x2.getCustomerName());
    System.out.println("ADDR: "+x2.getAccountNumber());
    System.out.println("BALANCE: "+x2.getBalance());
    System.out.println("");

    CheckingAccount x3 = new CheckingAccount("Jane","25837",1253,15);
    System.out.println("#3 CheckingAccount1");
    System.out.println("NAMR: "+x3.getCustomerName());
    System.out.println("ADDR: "+x3.getAccountNumber());
    System.out.println("BALANCE: "+(int)x3.getBalance());
    System.out.println("FEE: "+(int)x3.getOverdraftFee());
    System.out.println("");

    CheckingAccount x4 = new CheckingAccount("Max","52428",12.251523,0.0007);
    System.out.println("#4 CheckingAccount2");
    System.out.println("NAMR: "+x4.getCustomerName());
    System.out.println("ADDR: "+x4.getAccountNumber());
    System.out.println("BALANCE: "+x4.getBalance());
    System.out.printf("FEE: %.4f\n",x4.getOverdraftFee());
    System.out.println("");

    for(int i=0;i<3;i++)
    {
      System.out.print("Choose Account: ");
      String N = scan.nextLine();

      if( N.equals(x1.getAccountNumber()))
      {
          System.out.print("Choose Action (1. Withdraw 2. Deposit): ");
          int con1 = scan.nextInt();
          if( con1 == 1)
          {
            System.out.print("Value: ");
            double val1 = scan.nextDouble();
            x1.withdraw(val1);
          }
          else
          {
            System.out.print("Value: ");
            double val2 = scan.nextDouble();
            x1.deposit(val2);

          }

      }
      if( N.equals(x2.getAccountNumber()))
      {
          System.out.print("Choose Action (1. Withdraw 2. Deposit): ");
          int con2 = scan.nextInt();
          if( con2 == 1)
          {
            System.out.print("Value: ");
            double val3 = scan.nextDouble();
            x2.withdraw(val3);
          }
          else
          {
            System.out.print("Value: ");
            double val4 = scan.nextDouble();
            x2.deposit(val4);

          }

      }
      if( N.equals(x3.getAccountNumber()))
      {
          System.out.print("Choose Action (1. Withdraw 2. Deposit): ");
          int con3 = scan.nextInt();
          if( con3 == 1)
          {
            System.out.print("Value: ");
            double val5 = scan.nextDouble();
            x3.withdraw(val5);
          }
          else
          {
            System.out.print("Value: ");
            double val6 = scan.nextDouble();
            x3.deposit(val6);

          }

      }
      if( N.equals(x4.getAccountNumber()))
      {
          System.out.print("Choose Action (1. Withdraw 2. Deposit): ");
          int con4 = scan.nextInt();
          if( con4 == 1)
          {
            System.out.print("Value: ");
            double val7 = scan.nextDouble();
            x4.withdraw(val7);
          }
          else
          {
            System.out.print("Value: ");
            double val8 = scan.nextDouble();
            x4.deposit(val8);

          }
      }
    }
  }
}


class BankAccount
{
  protected String customerName;
  protected String accountNumber;
  protected static double balance;

  public BankAccount(String customerName  , String accountNumber, double balance)
  {
    this.customerName = customerName;
    this.accountNumber = accountNumber;
    this.balance =  balance;
  }
  public String getCustomerName()
  {
    return this.customerName;
  }
  public void setCustomerName(String name)
  {
    this.customerName = name;
  }
  public String getAccountNumber()
  {
    return this.accountNumber;
  }
  public void setAccountNumber(String number)
  {
      this.accountNumber = number;
  }
  public double getBalance()
  {
    return this.balance;
  }
  public void setBalance(double b)
  {
    this.balance = b;
  }
  public void withdraw(double amount)
  {
    if(amount <= this.balance)
    {
      System.out.println("Withdraw Complete!!");
      this.balance -= amount;
      System.out.println(this.accountNumber +  this.customerName +" Withdraw "+amount+" Balance "+this.balance);
      System.out.println("#######");
      System.out.println("");
    }
    else
    {
      System.out.println("Withdraw Fail!!");
      System.out.println("#######");
      System.out.println("");
    }
  }
  public void deposit(double amount)
  {
    if(amount > 0)
    {
      System.out.println("Deposit Complete!!");
      this.balance += amount;
      System.out.print(this.accountNumber + this.customerName + " Deposit "+amount);
      System.out.printf(" Balance %.6f\n",this.balance);
      System.out.println("#######");
      System.out.println("");
    }
    else
    {
      System.out.println("Deposit Fail!!");
      System.out.println("#######");
      System.out.println("");
    }
  }
}


class CheckingAccount extends BankAccount
{
  private static double overdraftFee;

  public CheckingAccount(String customerName, String accountNumber, double balance,
double overdraftFee)
  {
    super(customerName,accountNumber,balance);
    this.overdraftFee = overdraftFee;
  }
  public double getOverdraftFee()
  {
    return this.overdraftFee;
  }
  public void setOverdraftFee(double fee)
  {
    this.overdraftFee = fee;
  }
  public void withdraw(double amount)
  {
    double i = amount + this.overdraftFee;
    if(super.balance >= i)
    {
      System.out.println("Withdraw Complete!!");
      super.balance -= i;
      System.out.print(this.accountNumber + this.customerName +" Withdraw "+amount);
      System.out.printf(" FEE %.4f balance %.6f\n",this.overdraftFee,this.balance);
      System.out.println("#######");
      System.out.println("");
    }
    else
    {
    System.out.println("Withdraw Fail!!");
    System.out.println("#######");
    System.out.println("");
  }
}
}



