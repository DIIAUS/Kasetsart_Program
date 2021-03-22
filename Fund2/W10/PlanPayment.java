public class PlanPayment extends Payment
{
  private Payment payments[];
  private int contype=1;
  
  public PlanPayment(double amount,int numberOfInstallments)
  {
    super(amount);
    this.payments = new Payment[numberOfInstallments];
  }
  public void setInstallment(int installment,Payment payment)
  {
    payments[installment] = payment;
  }

  public Payment[] getPayment(){
    return this.payments;
  }
  public Payment getInstallment(int installment)
  {
    return payments[installment];
  }
  public String toString()
  {
    return "Amount: "+super.amount + " Installment: "+payments.length;
  }
  @Override
  public int getContype()//get Key to confirm this type Payment
  {
    return this.contype;
  }
}
