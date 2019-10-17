import java.util.Scanner;
import java.lang.Math;
public class Program
{
    public static void main(String[] args) 
    {
       Scanner k=new Scanner(System.in);
       int n,pc=1,i;
       int j;   
       System.out.println ("Enter which prime number you want to know: ");
      n=k.nextInt();
       for(i=3;pc!=n;i+=2)
       {
           for(j=3;j<i;j+=2)
           {
               if(i%j==0)
               break;
           }
        
           if(j==i) 
           pc++;      
       }
    System.out.println(n+" th Prime Number is "+j);
    
 
    }
}