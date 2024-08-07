public class SumOfDigit {
    public static int sumDigit(int n) {
        if(n==0)
        return 0;
        else
        {
            return (n%10)+sumDigit(n/10);
        }

        
    }
    public static void main(String[] args) {
        int n=12345;
        System.out.println("sum of digit ==> "+sumDigit(n));
    }
}
