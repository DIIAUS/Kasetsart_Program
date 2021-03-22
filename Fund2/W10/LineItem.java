public class LineItem
{
  private Product item;
  private int quantity;
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
  public double getTotalPrice()
  {
    return this.item.getPrice()*this.quantity;
  }
}
