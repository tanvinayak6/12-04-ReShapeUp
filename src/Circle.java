// A Circle object represents a circle defined by a center point and a radius.
import java.lang.Math;
public class Circle
{
  private Point center = new Point();
  private double radius;
  //Add in 2nd parameter later
  public Circle(Point p, double r)
  {
    center = p;
    radius = r;
  }
  public double getRadius()
  {
    return radius;
  }
  public double area()
  {
    return Math.PI*(Math.pow(radius,2));
  }
  public double circumference()
  {
    return 2*Math.PI*radius;
  }
  public double diameter()
  {
    return 2*radius;
  }
  public String toString()
  {
    return "("+center.getX()+","+center.getY()+"), " +radius;
  }
  public Circle(Point startPoint, Point endPoint)
  {
    center=startPoint;
    radius=center.distance(endPoint);
  }
  public void changeRadius(double add)
  {
    radius+=add;
  }
  public Circle()
  {
    radius=0.0;
    center.setX(0);
    center.setY(0);
  }
  public void translate(int a, int b)
  {
    center.setX(center.getX()+a);
    center.setY(center.getY()+b);
  }
  
}
    
  
    
  
