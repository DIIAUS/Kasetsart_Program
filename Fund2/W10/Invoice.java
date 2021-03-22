import java.util.ArrayList;
public class Invoice
{
  private String id;
  private Customer customer;
  private Payment payment = null;
  private ArrayList<LineItem> items = new ArrayList<LineItem>();
  
  public Invoice(String id, Customer customer)
  {
    this.id = id;
    this.customer = customer;
  }
  //add LineItem to ArrayList items
  public void addItem(Product product, int quantity)
  {
    LineItem cos = new LineItem(product,quantity);
    items.add(cos);
  }
  public String getId()
  {
    return this.id;
  }
  public Customer getCustomer()
  {
    return this.customer;
  }
  public LineItem getLineItem(int i)
  {
    return items.get(i);
  }
  //get price of product form LineItem in ArrayList and plus sum
  public double getTotalPrice()
  {
    double sum = 0.0;

    for(int j=0;j<items.size();j++)
    {
      sum +=(items.get(j)).getTotalPrice();
    }
    return sum;
  }

  public double getAllPrice()
  {//TotalPrice of  product in ArrayList items by getTotalPrice() apiece of product and sum total
    double total =0;
    for(int j=0;j < items.size();j++ )
    {
      total += getLineItem(j).getTotalPrice();
    }
    return total;

  }

  public void setPayment(Payment payment)
  {
    this.payment = payment;
  }
  public Payment getPayment()
  {
    return this.payment;
  }

  public void print()
  {
    System.out.println("INVOICE: #<"+this.id+">");
    //getCustomer name from method getCustomer.get(First/Last)Name
    System.out.println("CUSTOMER: <"+getCustomer().getFirstName()+ " " +getCustomer().getLastName()+">");
    for(int i=0;i < items.size();i++)
    {
      //getName of product from method getLineItem().getProduct.getName()
      String namepro = getLineItem(i).getProduct().getName();
      //getQuantity of product from method getLineItem().getQuantity()
      int quanpro = getLineItem(i).getQuantity();
      //getPrice of product from method getLineItem().getProduct.getPrice()
      System.out.printf("%d <%s> x <%d> = <%,.2f>\n",i+1,namepro,quanpro,getLineItem(i).getProduct().getPrice());
    }
    System.out.printf("TOTAL: <%,.2f>\n",getAllPrice());

    if(this.payment != null )//check Payment
      {
        if (this.payment.getContype() == 0) {//check type of Payment
          System.out.println(this.payment.toString());
        }
        else{//complieler can't found  PlanPayment method because it see only Payment method
        // so we cast this.payment to PlanPayment
          System.out.println(this.payment.toString());
          for(int i = 0;i < ((PlanPayment)this.payment).getPayment().length;i++){
            if (((PlanPayment)this.payment).getInstallment(i) != null) {//check empty Payment in PlanPayment arrays
              System.out.printf("Installment %d: %s\n",i,((PlanPayment)this.payment).getInstallment(i).toString());
          }
        }
        }

      }
    }
  }
