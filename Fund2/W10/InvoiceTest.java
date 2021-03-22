public class InvoiceTest
{
  public static void main(String[] args)
  {
    Product pro1 = new Product("1","Pen",10);
    Product pro2 = new Product("2","Rubber",20);
    Product pro3 = new Product("3","Mouse",590);
    Product pro4 = new Product("4","Keyboard",250);
    Product pro5 = new Product("5","Monitor",2300);

    //Invoice#1 no Payment
    Customer cus1 = new Customer("1","John","Wick");//Customer Name
    Invoice inv1 = new Invoice("1",cus1);
    inv1.addItem(pro1,5);
    inv1.addItem(pro2,5);
    inv1.addItem(pro3,1);
    inv1.addItem(pro4,1);
    inv1.addItem(pro5,1);
    inv1.print();
    System.out.println();

    //Invoice#1.1  CashPayment
    CashPayment cash = new CashPayment(inv1.getAllPrice(),4000);
    inv1.setPayment(cash);
    inv1.print();
    System.out.println();
    
    //Invoice#2 CreditPayment
    Customer cus2 = new Customer("2","Khittipat","Khamlue");//Customer Name

    Invoice inv2 = new Invoice("2",cus2);
    inv2.addItem(pro1,1);
    inv2.addItem(pro2,2);
    inv2.addItem(pro3,1);
    inv2.addItem(pro4,1);
    inv2.addItem(pro5,2);
    CreditPayment credit = new CreditPayment(inv2.getAllPrice(),"6130300034");
    inv2.setPayment(credit);
    inv2.print();
    System.out.println();

    //Invoice#3 PlanPayment

    Invoice inv3 = new Invoice("3",cus2);
    inv3.addItem(pro1,2);
    inv3.addItem(pro2,1);
    inv3.addItem(pro3,1);
    inv3.addItem(pro4,2);
    inv3.addItem(pro5,2);

    Payment credit2 = new CreditPayment(inv3.getAllPrice(),"6130300034");
    Payment cash2 = new CashPayment(inv3.getAllPrice(),6000);
    PlanPayment plan = new PlanPayment(inv3.getAllPrice(),10);

    plan.setInstallment(0,credit2);plan.setInstallment(1,cash2);
    plan.setInstallment(2,credit2);
    inv3.setPayment(plan);
    inv3.print();
    System.out.println();


  }
}
