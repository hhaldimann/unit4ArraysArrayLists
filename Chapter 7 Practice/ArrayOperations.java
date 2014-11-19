public class ArrayOperations
{
    public static void main(String[] args)
    {
        double[] a = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println(a.length);
        System.out.println(a[0]);
        System.out.println(a[8]);
        System.out.println(a[a.length-1]);
        for(int i = 1; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
        for(int i = 1; i<a.length; i++)
        {
            System.out.println("Number " + i + ":" + a[i]);
        }
        for(int i = a.length-1; i >= 0; i--)
        {
            System.out.println("Number " + i + ":" + a[i]);
        }
        for(double val : a)
        {
            System.out.println(val);            
        }
    }

}
