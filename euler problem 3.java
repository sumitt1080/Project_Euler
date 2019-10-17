public class Program
{
    public static void main(String[] args) {
        long ans=600851475143l;
        for (long i=3,a=ans;a!=1;i+=2)
            if(a%i==0)
            {
                while (a%i==0)
                    a/=i;
                ans=i;
            }
        System.out.println(ans);
    }
}