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
    //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++) {
      for (int k = 0; k < vals[i].length; k++) {
        if (vals[i][k] < 0) {
          vals[i][k] = i == k? vals[i][k] : 0;
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
      for (int k = 0; k < nums[i].length; k++);
      {
        result[i][k] = nums[i][k];
      }
    }
    return result;
  }


}
