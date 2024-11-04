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
      int[] values = new int[3];
      int i =0;
      while(file.hasNextInt())
      {
        values[i] = file.nextInt();
        i++;
        if (i == 3)
        {
          count += isValid(values[0], values[1], values[2])? 1 : 0;
          i = 0;
        }
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
      while(file.hasNextInt())
        {
        int[] t0 = new int[3];
        int[] t1 = new int[3];
        int[] t2 = new int[3];
        boolean end = false;
        for (int k = 0; k < 3; k++)
          {
            if (file.hasNextInt())
            {t0[k] = file.nextInt();}
            else
            {end = true;}
            if (file.hasNextInt())
            {t1[k] = file.nextInt();}
            else
            {end = true;}
            if (file.hasNextInt())
            {t2[k] = file.nextInt();}
            else
            {end = true;}
          }
        if (end)
        {break;}
        count += (isValid(t0[0],t0[1],t0[2]))? 1 :0;

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
