public class Cylinder
{
  private double radius;  // radius of the base
  private double height;  // height of the cone

  public Cylinder( double radius, double height )
  {
    this.radius = radius;
    this.height = height;
  }

  // areas of two circles plus flattened side
  public double area()
  {
    return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;  
  }

  // area of base times height
  public double volume()
  {
    return Math.PI*radius*radius*height ;
  }

  public void setHeight( double height )
  {
    if ( height >= 0 )
      this.height = height ;
  }

  public void setRadius( double radius )
  {
    if ( radius >= 0 )
      this.radius = radius ;
  }

  public double getHeight( )
  {
    return height ;
  }

  public double getRadius( )
  {
    return radius ;
  }

}
