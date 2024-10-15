public class Demo{
  /* other methods here not shown */
  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(2,2);
    //p1.x = 10;//Runtime error cannot access private variable.

    System.out.println( distance(p1,p2)      );//1
    System.out.println( Point.distance(p1,p2));//2
    System.out.println( p1.distanceTo(p2)    );//3
  }
}
