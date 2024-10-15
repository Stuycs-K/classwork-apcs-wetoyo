

public class Point{

  private double x,y;

  public String toString(){
    return "(" + x + ","  + y + ")";
  }

  //Initialize this Point to have the same values as the other Point.
  public Point(Point other){
    x = other.getX();
    y = other.getY();
  }

  //Initialize this Point to have the provided values
  public Point(double x, double y){
    this.x=x;
    this.y=y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  /*
  Write this method FOURTH, go to the main and do that one first.
  */
  public double distanceTo(Point other){
    return Math.sqrt((this.x - other.getX()) * (this.x - other.getX())  + (this.y - other.getY()) * (this.y- other.getY()) );
  }

  /*
  Write this method last. Re-use (NOT COPY/PASTE) prior work and
  do not write redundant code.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX())  + (a.getY() - b.getY()) * (a.getY() - b.getY()) );
  }


}
