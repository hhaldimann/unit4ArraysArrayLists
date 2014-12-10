import java.util.ArrayList;

public class ArrayListRunner
{
   public ArrayListRunner(ArrayList<String> names2)
   {
   }
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       
       System.out.println(names);
       
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("Edward");
       names.add("David");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       System.out.println(names);
       
       System.out.println("First: " + names.get(0) + " Last: " + names.get(names.size()-1));
       System.out.println(names.size());
       
       names.set(0, "Alice B. Toklas");
       System.out.println(names);
       
       names.add(5, "Doug");
       System.out.println(names);
       
       for( String i :  names)
       {
           System.out.println(i);
       }
       
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.println(names2);
       
       names.remove(0);
       System.out.println(names);
       System.out.println(names2);
   }
    
} 