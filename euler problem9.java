public class Program
{
    
   
    public static void main(String[] args) 
    {
      
       
       int i,j,c; 
       for(i=1;i<=500;i++){ for(j=1;j<=500;j++)
       { c=1000-i-j; 
       if(i*i+j*j-c*c==0&&i<j)
       { System.out.println("a * b * c = "+(i*j*c));
System.exit(0); } }}
        
    }
}
