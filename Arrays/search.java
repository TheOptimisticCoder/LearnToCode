import java.util.Scanner;


class search
{
    public static void main(String[]args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int number=sc.nextInt();
     int arr[]={10,11,12,13,14};
     boolean found=false;
     for(int i=0;i<arr.length;i++)
     {
     if(arr[i]==number)
     {
        found=true;
         System.out.println("Array found at index : "+ i);
        break;
     }
     }
     if(found!=true)
     {
        System.out.println("array not found : " + number);
     
     }
     
    }   

    
}  