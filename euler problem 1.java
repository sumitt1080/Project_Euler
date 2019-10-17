public class Program
{
    public static void main(String[] args)
    {
      int i; 
      long s=0; 
          for(i=1;i<1000;i++)
      {        if((i%3==0)||(i%5==0))
         s+=i;        
      }           
      System.out.println("Multiples of 3 or 5 below 1000 are : "+s);    
        
    }
}