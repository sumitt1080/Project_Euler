public class Program
{
    public static void main(String[] args) {
        System.out.println(findMult(20));
    }
    
    public static boolean isMult(int num) {
        for (int i = 11; i < 20; i++) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int findMult(int num) {
        while (!isMult(num)) {
            num++;
        }
        return num;
    }
}
