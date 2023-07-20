class Remove_Element{
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        int count=0;
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
        {
            if(nums[0] == val)
                return 0;
            else
                return 1;
        }
        while(true){
            while(i < nums.length && nums[i] != val){
                i++;
            }
            while(j >= 0 && nums[j] == val){
                count++;
                j--;
            }
            if(i >=j)
                break;
           if(i < nums.length && j>=0){
                nums[i]=nums[i]+nums[j];
                nums[j]=nums[i]-nums[j];
                nums[i]=nums[i]-nums[j];
                i++;
                j--;
                count++;
           }
        }
        return nums.length-count;
    }
}
