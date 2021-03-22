public class CashPayment extends Payment
{
  private double tendered;
  private int contype = 0;

  public CashPayment(double amount,double tendered)
  {
    super(amount);
    this.tendered = tendered;
  }
  public double getTendered()
  {
    return this.tendered;
  }

  public double getChange()//Change of this payments
  {
    return this.tendered-super.amount;
  }
  @Override
  public int getContype()//get Key to confirm this type Payment
  {
    return this.contype;
  }

  public String toString()
  {
    return "\"Amount: " +super.amount+" Tendered: "+this.tendered+" Change: "+getChange()+"\"";
  }
}
