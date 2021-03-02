import java.util.ArrayList;

class Customer
{
  private String id;
  private String firstName;
  private String lastName;
  
  public Customer(String id, String firstName, String lastName)
  {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public String getId()
  {
    return this.id;
  }
  public String getFirstName()
  {
    return this.firstName;
  }
  public String getLastName()
  {
    return  this.lastName;
  }
}
class Invoice
{
  private String id;
  private Customer customer;
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
  //print customer name and all of older
  public void print()
  {
    double total = 0;
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
      System.out.printf("%d <%s> x <%d> = <%.2f>\n",i+1,namepro,quanpro,getLineItem(i).getProduct().getPrice());
    }
    //TotalPrice of  product in ArrayList items by getTotalPrice() apiece of product and sum total
    for(int j=0;j < items.size();j++ )
    {
      total += getLineItem(j).getTotalPrice();
    }
    System.out.printf("TOTAL: <%.2f>\n",total);
  }
}
class InvoiceTest
{
  public static void main(String[] args)
  {
    //Product
    Product pro1 = new Product("1","Old Blue Box01",10);
    Product pro2 = new Product("2","Old Blue Box02",20);
    Product pro3 = new Product("3","Old Blue Box03",30);
    Product pro4 = new Product("4","Old Blue Box04",40);
    Product pro5 = new Product("5","Old Blue Box05",50);
    Product pro6 = new Product("6","Table",2500);
    Product pro7 = new Product("7","Chair",400);
    Product pro8 = new Product("8","Bed",7900);
    Product pro9 = new Product("9","Fan",790);
    Product pro10 = new Product("10","Pillow",690);
    Product pro11 = new Product("11","lamborghini veneno",20000000);

    //Invoice#1
    Customer cus1 = new Customer("1","John","Smith");
    Invoice inv1 = new Invoice("1",cus1);
    inv1.addItem(pro1,5);
    inv1.addItem(pro2,5);
    inv1.addItem(pro3,5);
    inv1.addItem(pro4,5);
    inv1.addItem(pro5,5);
    inv1.print();
    System.out.println();

    //Invoice#2
    Customer cus2 = new Customer("2","kwanchai","Limpapanasitti");
    Invoice inv2 = new Invoice("2",cus2);
    inv2.addItem(pro6,1);
    inv2.addItem(pro7,2);
    inv2.addItem(pro8,1);
    inv2.addItem(pro9,1);
    inv2.addItem(pro10,2);
    inv2.print();
    System.out.println();

    //Invoice#3
    Invoice inv3 = new Invoice("3",cus2);
    inv3.addItem(pro11,1);
    inv3.addItem(pro7,2);
    inv3.addItem(pro6,1);
    inv3.addItem(pro2,1);
    inv3.addItem(pro10,2);
    inv3.print();
    System.out.println();


  }
}
class LineItem
{
  private Product item;
  private int quantity;
  
  //input product and quantity to LineItem
  public LineItem(Product product, int quantity)
  {
    this.item = product;
    this.quantity = quantity;

  }
  public Product getProduct()
  {
    return this.item;
  }
  public int getQuantity()
  {
    return  this.quantity;
  }
  //getPrice product from item and mutiple with quantity
  public double getTotalPrice()
  {
    return this.item.getPrice()*this.quantity;
  }
}
class Product
{
  private String id;
  private String name;
  private double price;
  
  public Product(String id, String name, double price)
  {
    if(price < 0)
    {
      this.price = 0.0;
    }
    this.id = id;
    this.name = name;
    this.price = price;

  }
  public String getId()
  {
    return this.id;
  }
  public String getName()
  {
    return this.name;
  }
  public void setPrice(double price)
  {
    if(price < 0)
    {
      this.price = 0.0;
    }
    this.price = price;
  }
  public double getPrice()
  {
    return this.price;
  }
}
