public class Program
{
    
    public static boolean Triple(int i,int j,int k)
    {
        return ((i * i) + (j * j) == (k * k));
    }
    
    
    
    
    
    
    public static void main(String[] args) 
    {
       int i,j,k;
       for (i=1;i<998;i++)
          for (j=i+1;j<998;j++)
            for (k=j+1;k<998;k++)
             if(Triple(i,j,k))
               if(i+j+k==1000)
       {
 System.out.println("i="+i+" j="+j+" k="+k);
           System.out.println(i*j*k);
       }
        
    }
}