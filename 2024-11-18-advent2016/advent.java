import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
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
      ArrayList<int[]> tracked = new ArrayList<int[]>();

      while(scan.hasNext())
      {
        String item = scan.next().replace(",", "");
        int direct = item.substring(0,1).equals("R")? 1 : -1;
        direction += direct;
        direction = (4 + direction) % 4;
        int amount = Integer.parseInt(item.substring(1));
        int x = direction % 2 == 1? 1 : 0;
        int y = direction % 2 == 0? 1 : 0;
        int north = (direction == 2? -1 : 1);
        int right = (direction == 3? -1 : 1);
        coords[0] += right * north * amount * x;
        coords[1] += right * north * amount * y;
        String axis = "";
        switch (direction) {
          case 0:
            axis = "north";
            break;
          case 1:
            axis = "right";
            break;
          case 2:
            axis = "south";
            break;
          case 3:
            axis = "left";
            break;
        }
        System.out.println("coords" + item + ":" + axis+ "=" + coords[0] + ":" + coords[1]);
        for (int i = 0; i < tracked.size(); i++)
        {
          System.out.println("coords" + item + ":" + axis+ "=" + coords[0] + ":" + coords[1]);
          System.out.println("tracked" + tracked.get(i)[0] + ":" + tracked.get(i)[1]);
          if (Arrays.equals(tracked.get(i), coords))
          {

            System.out.println(item + ":" + axis+ "=" + coords[0] + ":" + coords[1]);
            return Math.abs(coords[0]) + Math.abs(coords[1]);
          }
        }
        tracked.add(coords);


      }
      return Math.abs(coords[0]) + Math.abs(coords[1]);
    }
    catch (FileNotFoundException e)
    {
      return -1;
    }
  }
  public static ArrayList<String> parseArray (String filename)
  {
    ArrayList<String> result = new ArrayList<String>();

    try
    {
      File file = new File(filename);
      Scanner scan = new Scanner(file);
      while(scan.hasNext())
      {
        String item = scan.next();
        result.add(item.replace(",", ""));
      }
    }
    catch (FileNotFoundException e)
    {
      System.out.println("FileNotFoundException");
    }
    return result;
  }
}
