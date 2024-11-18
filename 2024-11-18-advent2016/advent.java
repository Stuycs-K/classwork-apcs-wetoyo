import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class advent
{
  public static void main (String[] arg)
  {
    System.out.println(solution("thing.txt"));
  }
  public static int solution(String filename)
  {
    try{
      File name = new File(filename);
      Scanner scan = new Scanner(name);
      int direction = 0;
      // north right south left 0 1 2 3
      int[] coords = new int[2];

      while(scan.hasNext())
      {
        String item = scan.next();
        int direct = item.substring(0,1).equals("R")? 1 : -1;
        direction += direct;
        direction = direction % 4;
        int amount = Integer.parseInt(item.substring(1,2));
        int x = direction % 2 == 1? 1 : 0;
        coords[0] += direct * amount * x;
        int y = direction % 2 == 0? 1 : 0;
        coords[1] += direct * amount * y;
        System.out.println(coords[0] + ":" + coords[1]);

      }
      return coords[0] + coords[1];
    }
    catch (FileNotFoundException e)
    {
      return -1;
    }
  }
}
