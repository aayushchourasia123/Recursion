public class MaxArray {
    public static int maxArray(int arr[],int idx)
    {
        if(idx==(arr.length-1))
        {
        return arr[idx];
        }
        
        int max=maxArray(arr, idx+1);
        if(max>arr[idx])
        {
            return max;
        }
        else
        return arr[idx];
    }
    public static void main(String[] args) {
        int arr[]={2,5,6,65,8,10};
        System.out.println("max array "+maxArray(arr,0));
    }
}
