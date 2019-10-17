public class program
{

public static void main(String[] args)
 {
   
     int a=1,b=2,c,s=2;
      int i;
       for(i=3;i<=40;i++)
       {
           c=a+b;
           a=b;
           b=c;
           if(c%2==0)
           s=s+c;
       }
       System.out.println(" Sum is: "+s);
   
    
}}