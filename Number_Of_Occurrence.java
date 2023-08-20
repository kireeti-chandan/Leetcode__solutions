// https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1
class Number_Of_Occurrence {
    int count(int[] arr, int n, int x) {
        // code here
        int leftIndex=binarySearchLeft(arr,0,n-1,x);
        int rightIndex=binarySearchRight(arr,0,n-1,x);
        return (rightIndex- leftIndex);
    }
    public static int binarySearchLeft(int[] arr,int low,int high,int target){
        while(low <= high){
            int mid=(low+high)/2;
            if( target <= arr[mid])
                high=mid-1;
            else
                low = mid+1;
        }
        return high;
    }
    public static int binarySearchRight(int[] arr,int low,int high,int target){
        while(low <=high){
            int mid=(low + high)/2;
            if(arr[mid] <= target)
                low=mid+1;
            else
                high=mid-1;
        }
        return high;
    }
}
