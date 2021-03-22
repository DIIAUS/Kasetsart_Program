public class CreditPayment extends Payment
{
  private String cardNumber;
  private int contype=0;
  
  public CreditPayment(double amount,String cardNumber)
  {
    super(amount);
    this.cardNumber = cardNumber;
  }
  public String getCardNumber()
  {
    return this.cardNumber;
  }
  public String toString()
  {
    return "\"Amount: "+super.amount+ " Card Number: "+this.cardNumber+"\"";
  }
  @Override
  public int getContype()//get Key to confirm this type Payment
  {
    return this.contype;
  }
}
