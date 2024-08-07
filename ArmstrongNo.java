public class ArmstrongNo {
    public static int power(int n,int digit)
    {
        if(digit==1)
        return n;
        else{
            int mid=digit/2;
            int result=power(n, mid);
            int finalresult=result*result;
            if(digit%2==0)
            {
                return finalresult;
            }
            else{
                return n*finalresult;
            }
            
        }
    }
    public static int armstrongNo(int n,int digit)
    {
       if(n==0) return 0;
        int res=0;
        res+=power(n%10,digit)+armstrongNo(n/10, digit);
        return res;

    } 
    public static void main(String[] args) {
        int n=407;
        int temp=n;
        int digit=0;
        while(temp>0)
        {
            temp/=10;
            digit++;
        }
        if(n==armstrongNo(n,digit))
        {
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}
