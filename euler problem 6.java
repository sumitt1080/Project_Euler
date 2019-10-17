import java.util.Scanner;
import java.lang.Math;

public class Program
{
    public static void main(String[] args) 
    {
        int s1=0,s2=0,i,n;
        System.out.println("Enter the upper limit");
        Scanner k=new Scanner(System.in);
        n=k.nextInt();
       
    System.out.println(((int)Math.pow(((n*(n+1))/2),2))-((n*(n+1)*((2*n)+1))/6));
        
        
        
        
        
    }
}