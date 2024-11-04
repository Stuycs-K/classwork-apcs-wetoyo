import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester
{
  public static int countTrianglesA(String filename)
  {
    try{
      File name = new File(filename);
      Scanner file = new Scanner(name);
      int count = 0;
      while(file.hasNextLine())
      {
        int v0 = Integer.parseInt(file.next());
        int v1 = Integer.parseInt(file.next());
        int v2 = Integer.parseInt(file.next());
        if (isValid(v0, v1, v2))
        {
          count++;
        }
        file.nextLine();
      }
      return count;
    }
    catch (FileNotFoundException e)
    {
      System.out.println("file not found");
      return -1;
    }
  }
  public static int countTrianglesB(String filename)
  {
    try{
      File name = new File(filename);
      Scanner file = new Scanner(name);
      int count = 0;
      while(file.hasNextLine())
        {
        int[] t0 = new int[3];
        int[] t1 = new int[3];
        int[] t2 = new int[3];
        for (int k = 0; k < 3; k++)
          {
            t0[k] = Integer.parseInt(file.next());
            t1[k] = Integer.parseInt(file.next());
            t2[k] = Integer.parseInt(file.next());
            file.nextLine();
          }
        count += (isValid(t0[0],t0[1],t0[2]))? 1 :0;
        count += (isValid(t1[0],t1[1],t1[2]))? 1 :0;
        count += (isValid(t2[0],t2[1],t2[2]))? 1 :0;
        }
        return count;
      }
      catch (FileNotFoundException e)
      {
        System.out.println("lol");
        return 0;
      }

    }
    private static boolean isValid(int v0, int v1, int v2)
    {
      return (v0 + v1 > v2 && v0 + v2 > v1 && v1 + v2 > v0);
    }
}
