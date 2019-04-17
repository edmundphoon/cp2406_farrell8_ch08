public class TwelveInts
{
   public static void main(String args[])
   {
      int[] twelveNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
      int i;
      for(i = 0; i < twelveNums.length; i++)
        System.out.println(twelveNums[i] + " ");
      for(i = twelveNums.length - 1; i >= 0; i--)
         System.out.println(twelveNums[i] + " ");
   }
}
