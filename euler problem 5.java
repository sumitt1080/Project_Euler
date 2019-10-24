public class euler_Problem_5 
{ 
	





public static void main(String[] args) 
{		



int sum = 1, pN = 0;	
	


for (int i = 1; i <= 20; i++)
	{			pN = Prime(i);		
	

if (pN > 0)	
{				
sum *= pN;			
}		
	


while ( pN < 0 && !(sum%i == 0) )	
{				
	

if ((sum*2)%i == 0)		
{					sum *= 2;				}			
	


else if ((sum*3)%i == 0)
	{					sum *= 3;				}			
}		
}		


System.out.println("Smallest Divisible Number: " + sum);	
}		



private static int Prime(int num)	
{	

   	int j;	
	    if (num == 2 || num == 3)
	
   {return num; }	
	
    for (j = 0; (j <= num/2) && ( !((num % (j+2)) == 0 )) ; j++);		

    return (j > num/2) ? num:-1;	} 
}

	
