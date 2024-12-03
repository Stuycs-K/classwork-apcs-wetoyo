public class ColorDemo
{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  public static void main (String[] args)
  {

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

  public static Void color(int foreground, int background, int modifier)
  {
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + + ";" + modifier + "m");
  }
}
