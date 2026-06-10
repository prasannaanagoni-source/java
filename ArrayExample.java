import java.util.Scanner;
class ArrayExample
{
    public static void main(String args[])
    {
       Scanner Sc=new Scanner(System.in);
       int size=Sc.nextInt();
       int[]arr=new int[size];
       for(int i=0;i<size;i++)
       {
        arr[i]=Sc.nextInt();

 }
 System.out.println("elements are:");
 for(int i=0;i<size;i++)
 {
    System.out.println(arr[i]);
 }
        
    }
}