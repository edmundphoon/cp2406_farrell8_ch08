import java.util.Scanner;

public class DistanceFromAverage
{
   public static void main(String args[])
   {

      Scanner input = new Scanner(System.in);

      double[] numbers = new double[20];
      double value;
      double total = 0;
      double average;

      final int QUIT = 99999;
      int x = 0, y;
      System.out.print("Enter a numeric value or " + QUIT + " to quit >> ");
      value = input.nextDouble();
      while (value != QUIT)
         while (x < numbers.length)
         {
            numbers[x] = value;
            total += numbers[x];
            ++x;
            if (x < numbers.length)
            {
               System.out.print("Enter a numeric value or " + QUIT + " to quit >> ");
               value = input.nextDouble();
            }
         }
      if (x != 0) {
         average = total / x;
         System.out.println("Average of " + x + " numbers is " + average);
         for (y = 0; y < x; ++y)
            System.out.println(numbers[y] + " is " +
                    (numbers[y] - average) + " away from the average");
      }
   }
}
