public class AlternateSum {

    public static int alternateSum(int n)
    {
        int res=0;
        if(n==0)
        return 0;
        else if(n%2==0)
        {
            res+=alternateSum(n-1)-n;
        }
        else{
            res+=alternateSum(n-1)+n;
        }
        return res;
    }
    
        public static void main(String[] args) {
            int n=5;
        System.out.println("sum of digit ==> "+alternateSum(n));
        }
    }
