public class Customer
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
