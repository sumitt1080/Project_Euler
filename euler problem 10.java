import java.math.BigInteger; 

public class Program {
  public static void main(String[] args) {
    isPrime p = new isPrime();
    BigInteger sum = new BigInteger("2");
    for(int i = 3;i <= 2000000;i++){
      if(p.check(i) == true){
        sum = sum.add(BigInteger.valueOf(i));
      }
    }
    System.out.print(sum);
  }
}

class isPrime {
  boolean check(int input) {
    if (input % 2 == 0) {
      return false;
    }
    for (int c = 3; c*c <= input; c +=2) {
      if (input % c == 0) {
        return false;
      }
    }
    return true;
  }
}
