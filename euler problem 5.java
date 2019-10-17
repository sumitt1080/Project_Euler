class Program
{
    public static void main(String[] args) {
        int c = 0;
        for (int i = 2; i <= 1000000000; i+=2) {
            boolean x = true;
            for(int j  = 1;j<=20;j++){
                x = true;
                if(i%j != 0) {
                    x = false;
                    break;
                }
            }
            if(x == true) {
                c = i;
                break;
            }
        }
        System.out.println(c);
    }
}