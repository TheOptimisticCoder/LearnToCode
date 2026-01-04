

class count
{
    public static void main(String[] args)
    {
        int arr[] ={10,-20,30,0,-40,50};
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                pos++;
            }
            else if(arr[i]<0)
            {
                neg--;    
            }
            else 
            {
                zero=0;
            }
            
            

        
        }
         System.out.println("Count is: " + pos);
          System.out.println("Count is: " + neg);
           System.out.println("Count is: " + zero);
       
    }
}