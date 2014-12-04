// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
public class Rectangle
{
  private Point origin;
  private int height;
  private int width;
  public Rectangle()
  {
    origin=new Point();
    width=0;
    height=0;
  }
  public Rectangle(Point bottomLeft, Point topRight)
  {
    origin=bottomLeft;
    height=topRight.getY()-origin.getY();
    width=topRight.getX()-origin.getX();
  }
  public Rectangle(Point bottomLeft, int a, int b)
  {
    origin=bottomLeft;
    width=a;
    height=b;
  }
  public Point getBottomLeft()
  {
    return origin;
  }
  public Point getTopRight()
  {
    Point topRight=new Point();
    topRight.setX(origin.getX()+width);
    topRight.setX(origin.getY()+height);
    return topRight;
  }
  public int getHeight()
  {
    return height;
  }
  public int getWidth()
  {
    return width;
  }
  public double area()
  {
    return height*width;
  }
  public double diagonal()
  {
    return origin.distance(this.getTopRight());
  }
  public int perimeter()
  {
    return 2*width+2*height;
  }
  public boolean isSquare()
  {
    if(height==width)
    {
      return true;
    }
    return false;
  }
  public String toString()
  {
    String s="[ ("+origin.getX()+","+origin.getY()+"), ("+this.getTopRight().getX()+","+this.getTopRight().getY()+") ]";
    return s;
  }
  public void translate(int dx, int dy)
  {
    this.getTopRight().translate(dx, dy);
  }
  public void scale(int dx, int dy)
  {
    width+=dx;
    height+=dy;
  }
}
  
