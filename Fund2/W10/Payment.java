public abstract class Payment
{
  protected double amount;
  protected int contype = 0;

  public Payment(double amount)
  {
    if(amount<0){this.amount = 0;}
    else{this.amount = amount;}
  }
  public double getAmount()
  {
    return this.amount;
  }
  public int getContype()//get Key to confirm this type Payment
  {
    return this.contype;
  }
}
