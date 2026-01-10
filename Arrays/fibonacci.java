import java.util.Scanner;
class fibonacci
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the number :");
        int n=sc.nextInt();
       int a=0; int b=1;
       for(int i=1;i<=n;i++)
       {
        
    
       
       int c=a+b;
       a=b;
       b=c;
       System.out.println("the fibonacci series is:"+ a);
       }
         
    }
}