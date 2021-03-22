public class Product
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
