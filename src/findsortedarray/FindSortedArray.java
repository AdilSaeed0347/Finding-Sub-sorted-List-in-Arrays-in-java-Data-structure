
package findingsubarrays;
import java.util.Random;
import java.util.Scanner;

public class FindSorted {
public void FindingSubArrays(int [] array)
{   System.out.println("Sub sorted list in array are :");
    System.out.print("[");
    for(int i=0; i<array.length-1; i++)
    {
        System.out.print(array[i]+" ");
        if(array[i]>array[i+1])
        {
            System.out.print("]");
            System.out.println("");
            System.out.print("[");
        }
    }
    System.out.print(array[array.length-1]+"");
        
   
   


}
    
    public static void main(String[] args) {
      Random rand= new Random ();
      Scanner kb= new Scanner(System.in);
      FindingSubArrays obj= new FindingSubArrays();
      System.out.println("Enter size of array");
      int size=kb.nextInt();
      int [] array = new int [size];
      for(int i=0; i<size; i++)
      {array[i]=rand.nextInt(50);}
        System.out.println("Array element are :");
      for(int num:array)
      {System.out.print(num+" ");
      }
        System.out.println();
      obj.FindSubArrays(array);
      
      }
      
    }
    

