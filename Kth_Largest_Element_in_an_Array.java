class Kth_Largest_Element_in_an_Array{
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            k--;
            if(k==0){
                return nums[i];
            }
        }
        return -1;        
    }
}
