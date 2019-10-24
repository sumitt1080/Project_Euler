class GFG{ 

  

static long gcd(long a, long b) 

{ 

   if(a%b != 0)  

      return gcd(b,a%b); 

   else 

      return b; 

} 

  

 

static long lcm(long n) 

{ 

    long ans = 1;     

    for (long i = 1; i <= n; i++) 

        ans = (ans * i)/(gcd(ans, i)); 

    return ans; 

} 

   

 

public static void main(String []args)  

{ 

    long n = 20; 

    System.out.println(lcm(n)); 

  

} 

} 

