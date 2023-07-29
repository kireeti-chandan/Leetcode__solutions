class Find_Minimum_In_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int pivot=pivot(nums);
        if(pivot == -1)
            return nums[0];
        else
            return nums[pivot +1];
    }
    public static int pivot(int[] nums){
        int low=0;
        int high=nums.length-1;
        while(low <= high){
            int mid=(low+high)/2;
            if( mid < high && nums[mid] > nums[mid+1])
                return mid;
            if(mid > low && nums[mid ] < nums[mid -1] )
                return mid-1;
            if(nums[mid] <= nums[low])
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
}
