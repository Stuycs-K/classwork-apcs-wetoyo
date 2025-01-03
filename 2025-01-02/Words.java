public class Words
{
  public static void main (String[] args)
  {
    makeWords(3, "", "abc");
  }
  public static void makeWords(int remaining, String partial, String alphabet)
  {
    if (remaining == 0)
    {
      System.out.println(partial);
    }
    else
    {
      for (int i = 1; i< alphabet.length() +1; i++)
      {
        String carry = alphabet.substring(i-1,i);
        makeWords(remaining-1, partial + carry, alphabet);
      }
    }
  }

}
