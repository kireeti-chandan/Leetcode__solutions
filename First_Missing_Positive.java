class First_Missing_Positive{
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++)
            h.add(nums[i]);
        int max=Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++){
            if(max < nums[i])
                max=nums[i];
        }
        if(max <= 0)
            return 1;
        System.out.println(max);
        for(int i=1;i<=max;i++){
            if(!h.contains(i)){
                System.out.println(!h.contains(i));
                return i;
            }
        }
        return max+1;
    }
}
