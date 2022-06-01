 import java.util.*;
 public class BikeRace
 {
     public static void main (String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the distance travelled");
         int distance=sc.nextInt();
         if(distance<0)
         System.out.println("Invalid Input");
         else if(distance==0)
         System.out.println("Your bonus points is 0");
         else
         {
             String str=distance+"";
             int length=str.length();
             int eprod=1,oprod=1;
             int arr[]=new int[length];
             for(int i=0;i<length;i++)
             {
                 arr[i]=Integer.parseInt(str.charAt(i)+"");
                 if(i%2==0)
                 eprod*=arr[i];
                 else
                 oprod*=arr[i];
             }
             if(eprod>oprod)
             System.out.println("Your bonus points is "+eprod);
             else if(eprod<oprod)
             System.out.println("Your bonus points is "+oprod);
             else
             System.out.println("Your bonus points is "+(2*eprod));
         }
     }
 }
