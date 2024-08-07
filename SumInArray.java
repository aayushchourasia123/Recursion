public class SumInArray {
    public static int sumArray(int arr[],int idx)
    {
        if(idx==arr.length-1)
        {
            return arr[idx];
        }
        int res=0;
        res+=arr[idx]+sumArray(arr,idx+1);
        return res;

    }
    public static void main(String[] args) {
        int arr[]={2,5,1,1,1,5};
        System.out.println("sum of array "+sumArray(arr,0));
    }
}
