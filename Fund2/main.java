import java.util.*;


public class main{
  public static void main(String[] args) {
    Quadrilateral test = new Rectangle(new Point(0.0,0.0), new Point(5.0,0.0),new Point(5.2,2.0),new Point(0.0,2.0));
    Quadrilateral test2 = new Square(new Point(0.0,0.0),Quadrilateral.computeDiagPoint(new Point (0.0,0.0),5.0));
    Quadrilateral test3 = new Trapezoid(new Point(0.0,3.0), new Point(7.0,3.0),new Point(4.0,0.0),new Point(7.0,0.0));
    Quadrilateral test4 = new Parallelogram(new Point(2.0,4.0),new Point(8.0,4.0),new Point(0.0,0.0),new Point(6.0,0.0));
    System.out.println(test.getArea());
    System.out.println(test2.getArea());
    System.out.println(test3.getArea());
    System.out.println(test4.getArea());
  }
}
class Parallelogram extends Quadrilateral{
  public Parallelogram(Point p0,Point p1,Point p2,Point p3){
    super(p0,p1,p2,p3);
  }
  //return area
  public double getArea(){
    return (super.getEndpoint(3).getX() - super.getEndpoint(2).getX())*(super.getEndpoint(2).getY()-super.getEndpoint(1).getY());
  }
}
class Point {
  private double x;
  private double y;
  Point(double x,double y){
    this.x = x;
    this.y = y;
  }
  public double getX(){
    return this.x;
  }
  public double getY(){
    return  this.y;
  }
}

class Quadrilateral {
  private Point[] endpoints = new Point[4] ;

  public Quadrilateral(Point p0,Point p2){
    this.endpoints[0] = p0;
    this.endpoints[1] = p2;
  }
  public Quadrilateral(Point p0,Point p1,Point p2,Point p3){
  this.endpoints[0] = p0;
  this.endpoints[1] = p1;
  this.endpoints[2] = p2;
  this.endpoints[3] = p3;
  for(int i = 0;i<this.endpoints.length-1;i++){
    for(int j = 0 ; j<this.endpoints.length-1;j++){
      if (this.endpoints[j].getY() > this.endpoints[j+1].getY()){
        Point a = this.endpoints[j+1];
        this.endpoints[j+1] = this.endpoints[j];
        this.endpoints[j] =  a;
      }


    }
  }
  if (this.endpoints[0].getX() > this.endpoints[1].getX()){
    Point a = this.endpoints[0];
    this.endpoints[1] = this.endpoints[0];
    this.endpoints[0] =  a;
  }
  if (this.endpoints[2].getX() > this.endpoints[3].getX()){
    Point c = this.endpoints[2];
    this.endpoints[3] = this.endpoints[2];
    this.endpoints[2] =  c;

  }

}
  public Point getEndpoint(int index){
    return this.endpoints[index];
  }
  public static Point computeDiagPoint(Point p0,double r){
    double a = p0.getX() + r;
    double b = p0.getY();
    return new Point(a,b);
  }
  public double getArea(){
       return 0.0;
  }



}

class Rectangle extends Quadrilateral{
  public Rectangle(Point p0,Point p1,Point p2,Point p3){
    super(p0,p1,p2,p3);
  }
  //return area
  public double getArea(){
    return  (super.getEndpoint(1).getX()-super.getEndpoint(0).getX()) * (super.getEndpoint(2).getY() - super.getEndpoint(1).getY());
  }

}
class Square extends Quadrilateral
{
  public Square(Point p0,Point p1)
  {
    super(p0,p1);
  }
  //return area
  public double getArea(){
    return super.getEndpoint(1).getX() - super.getEndpoint(0).getX();
  }
}
class Trapezoid extends Quadrilateral{
  public Trapezoid(Point p0,Point p1,Point p2,Point p3){
    super(p0,p1,p2,p3);
  }
  public double getArea(){
    if(super.getEndpoint(0).getY() == super.getEndpoint(1).getY()){
      return 0.5*((super.getEndpoint(1).getX()-super.getEndpoint(0).getX())+(super.getEndpoint(3).getX()-super.getEndpoint(2).getX()))*(super.getEndpoint(3).getY()-super.getEndpoint(1).getY());
    }
    if(super.getEndpoint(0).getX() == super.getEndpoint(1).getX()){
      return 0.5*((super.getEndpoint(1).getY() - super.getEndpoint(3).getY()) + (super.getEndpoint(2).getY() -super.getEndpoint(4).getY()))*(super.getEndpoint(2).getX() -super.getEndpoint(1).getX());
    }
    return 0;
  }

}
