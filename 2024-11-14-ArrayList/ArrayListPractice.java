import java.util.ArrayList;
public class ArrayListPractice
{
  public static ArrayList<String>createRandomArray(int size)
  {
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i < size; i++)
    {
      String add = "";
      int rand = 0;
      add += rand == 0? "" : rand;
      result.add(add);
    }
    return result;
  }
  public static void replaceEmpty(ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
    for (int i = 0; i < original.size(); i++)
    {
      if (original.get(i).equals(""))
        original.set(i, "Empty");
    }
  }

  public static ArrayList<String> makeReversedList(ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> result = new ArrayList<String>();
    for (int i = original.size(); i > 0; i++)
    {
      result.add(original.get(i));
    }
    return result;
  }

  public static ArrayList<String> mixLists(ArrayList<String> a, ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i < (a.size() > b.size()? a.size(): b.size()); i++)
    {
        if (i < a.size())
        {
          result.add(a.get(i));
        }
        if (i < b.size())
        {
          result.add(b.get(i));
        }
    }
    return result;
  }


}
