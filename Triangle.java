public class Triangle
{
  //instance data in 3 Line segments
  LineSegment p1p2;
  LineSegment p2p3;
  LineSegment p3p1;
public Triangle(Point p1, Point p2, Point p3)
    {
        // initialise instance variables
        p1p2 = new LineSegment(p1, p2);
        p2p3 = new LineSegment(p2, p3);
        p3p1 = new LineSegment(p3, p1);
    }
public LineSegment getLineSegmentP1P2()
    {
      return p1p2;
    }
public LineSegment getLineSegmentP2P3()
    {
      return p2p3;  
    }
public LineSegment getLineSegmentP3P1()
    {
      return p3p1;
    }
public double area()
{
    double s = (p1p2.length() + p2p3.length() + p3p1.length())/2;
    
    return Math.sqrt(s *(s - p1p2.length() * Math.pow(s - p2p3.length(),2) * Math.pow(s - p3p1.length(),2)));
  
}
public double perimeter()
{
    double p = p1p2.length() + p2p3.length() + p3p1.length();
    
    return p;
    
}
}