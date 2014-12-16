import java.util.Scanner;
public class RandomDistribution
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many random numbers: ");
        int numberRandoms = in.nextInt();
        System.out.println("What is the number of values: ");
        int maxValue = in.nextInt();
        
        int[] values = new int[maxValue];
        for (int i = 0; i < numberRandoms; i++)
        {
            int value = (int)Math.random()*maxValue;
            for (int j = 0; j < values.length; j++)
            {
                if (value == j)
                  {
                      values[j]++;
                      System.out.println(values[j]);
                  }              
            }           
        }
        for (int k = 0; k < values.length; k++)
        {
            System.out.println(k+": "+values[k]);
        }
    }   
}
