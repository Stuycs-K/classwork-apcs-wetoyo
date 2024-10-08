import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int[][] test1 = new int[][]{{},{}};
    int[][] test2 = new int[][]{{1,2,3},{-4,-5,-6}, {1,2,3},{4,5,6}};
    int[][] test3 = new int[][]{{10,30,50,40,102},{1111,111,111,1111,1}};
    int[][] test4 = new int[][]{{1,2,3},{3,4,0}};
    TestCase(test1);
    TestCase(test2);
    TestCase(test3);
    TestCase(test4);
  }
  public static void TestCase(int[][] ary)
  {
    System.out.println(countZeros2D(ary));
    System.out.println(arr2DSum(ary));
    System.out.println(arrToString(replaceNegative(ary)));
    System.out.println(arrToString(copy(ary)));
    System.out.println(arrToString(swapRC(ary)));
    System.out.println(htmlTable(ary));
  }
  public static String arrToString(int[] ary) {
    String out = "[";
    for (int i = 0; i < ary.length; i++) {
      out += ary[i];
      if (i != ary.length - 1) {
        out += ", ";
      }
    }
    return out + "]";
  }

  public static String arrToString(int[][]ary){
    String out = "[";
    for (int i = 0; i < ary.length; i++) {
      out += arrToString(ary[i]);
      if (i < ary.length-1) {
        out += ", ";
      }
    }
    return out + "]";
  }
  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int counter = 0;
    for (int i = 0; i < nums.length; i++)
    {
      for (int k = 0; k < nums[i].length; k++)
      {
        if (nums[i][k] == 0)
        {
          counter++;
        }
      }
    }
    return counter;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++)
    {
      for (int k = 0; k < nums[i].length; k++)
      {
          sum += nums[i][k];
      }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static int[][] replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++) {
      for (int k = 0; k < vals[i].length; k++) {
        if (vals[i][k] < 0) {
          vals[i][k] = i == k? 1 : 0;
        }
      }
    }
    return vals;
}

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] result = new int[nums.length][];
    for (int i = 0; i < nums.length; i++)
    {
      result[i] = new int[nums[i].length];
      for (int k = 0; k < nums[i].length; k++)
      {
        result[i][k] = nums[i][k];
      }
    }
    return result;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] result = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++)
    {
      for (int k = 0; k < nums[0].length; k++)
      {
        result[k][i] = nums[i][k];
      }
    }
    return result;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String result = "<table>";
    for(int i = 0; i < nums.length; i++)
    { result += "<tr>";
      for(int k = 0; k < nums[i].length; k++)
      {
        result += "<td>";
        result += nums[i][k];
        result += "</td>";
      }
      result += "</tr>";
    }
    result += "</table>";
    return result;
  }
}
