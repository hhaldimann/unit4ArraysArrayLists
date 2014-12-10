import java.util.Scanner;
import java.util.ArrayList;
public class TopCustomer
{
    public static void main(String[] args)
    {
       ArrayList<String> customers = new ArrayList<String>();
       ArrayList<Double> amounts = new ArrayList<Double>();
       boolean set = true;
       
       while(set = true)
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a customer name: ");
           String name = in.nextLine();
           customers += <name>;
           Scanner in2 = new Scanner(System.in);           
           System.out.println("Enter a dollar amount: ");
           double amount = in.nextDouble();
           amounts += <amount>;
        }
       
    }
    public void addSale(String customerName, double amount)
    {
        
    }
}
