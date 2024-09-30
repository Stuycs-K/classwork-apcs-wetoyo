public class ArrayMethods {
  //1. Write both your names + emails at the top of the document as a comment.
  //Evan Khosh evank43@nycstudents.net Wesley Leon wesleyl30@nycstudents.net
  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static void main (String[] args)
  {
    System.out.println(arrToString(swapRC(new int[][]{{1,2,3},{4,5,6}})));
    System.out.println(arr2DSum(new int[][]{{1,2,3},{4,5,6}}));
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

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
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

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++)
    {
      int tempsum = 0;
      for (int k = 0; k < nums[i].length; k++)
      {
        tempsum += nums[i][k];
      }
      sum += tempsum;
    }
    return sum;//place holder return value so it compiles.
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
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


}
