public class MyArrays{
  public static void main(String[] args)
  {
    int[] nums = new int[]{1,2,3,5,1,3,3};
    int[] nums1 = new int[]{12,3,51,21,5,23};
    System.out.println("//// Return Copy Tests");
    System.out.println("//Copied Array: " + arrayToString(returnCopy(nums)) + "\n// Original Address: " + nums + " | New Address: " + returnCopy(nums));
    System.out.println("//Copied Array: " + arrayToString(returnCopy(nums1)) + "\n// Original Address: " + nums1 + " | New Address: " + returnCopy(nums1));
    System.out.println("//// Concat Array Tests");
    System.out.println("// nums + nums1");
    System.out.println("// Expected: {1, 2, 3, 4, 5, 1, 3, 3, 12, 3, 51, 21, 5, 23}");
    System.out.println("// Result: " + arrayToString(concatArray(nums, nums1)));
    System.out.println("// nums1 + nums");
    System.out.println("// Expected: {12, 3, 51, 21, 5, 23, 1, 2, 3, 4, 5, 1, 3, 3}");
    System.out.println("// Result: " + arrayToString(concatArray(nums1, nums)));
  }

  public static String arrayToString(int[] nums)
  {
    String result = "[";
    for (int i = 0; i < nums.length; i++)
    {
      result += nums[i];
      if (i < nums.length -1)
      {
        result += ", ";
      }
    }
    result += "]";
    return result;
  }
  public static int[] returnCopy(int[] nums)
  {
    int[] result = new int[nums.length];
    for(int i = 0; i < nums.length; i++)
    {
      result[i] = nums[i];
    }
    return result;
  }
  public static int[] concatArray(int[]ary1,int[]ary2)
  {
    int[] result = new int[ary1.length + ary2.length];
    for(int i = 0; i < ary1.length; i++)
    {
      result[i] = ary1[i];
    }
    for(int i = ary1.length; i < ary1.length + ary2.length; i++)
    {
      result[i] = ary2[i - ary1.length];
    }
    return result;
  }
}
