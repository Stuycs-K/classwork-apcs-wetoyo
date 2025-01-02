public class Fib
{
  public static void main(String[] args)
  {
    System.out.println(fibonacci(10));
  }
  public static int fib(int n)
  {
    if (n<2)
    return n;
    return fib(n-1) + fib(n-2);
  }
  public static int fibhelper(int n, int[] prev)
  {
    if (n<2)
      return n;
    if (prev[n] != 0)
    {
      return prev[n];
    }
    else
    {
      prev[n] = fibhelper(n-1, prev) + fibhelper(n-2, prev);

    }
    return prev[n];
  }
  public static int fibonacci(int n)
  {
    int[] prev = new int[n +1];
    return fibhelper(n, prev);
  }
}
