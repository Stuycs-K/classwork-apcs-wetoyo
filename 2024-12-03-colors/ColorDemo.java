import java.lang.Math;
public class ColorDemo
{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  public static void main (String[] args)
  {
    int r = 0;
    int g = 0;
    int b = 0;
    for(int i = 0; i < 10; i++)
    {

    for(r = 0; r <= 256; r+=1)
    {
      for(int k = 0; k < 100; k++)
      {
        r = (int)(Math.random()*200);
        g = (int)(Math.random()*200);
        b = (int)(Math.random()*200);
        System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
      }
      System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
      g++;
      System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
      b++;
      System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
    }
    for(r = 256; r > 0; r-=1)
    {
      System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
      g--;
      System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
      b--;
      System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
    }
    }



  }

  public static void sleep(int milli)
  {
      try{
              Thread.sleep(milli);
      }catch(Exception e){
      }
  }

  public static void color(int foreground,int background)
  {
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }

  public static void color(int foreground, int background, int modifier)
  {
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + ";" + modifier + "m");
  }
}
