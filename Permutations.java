//https://leetcode.com/problems/permutations/
class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        permute(ls,nums,0);
        return ls;
    }
    public static void permute(List<List<Integer>> ls,int[]nums,int i){
        if(i == nums.length-1){
            List<Integer> li=new ArrayList<>();
            for(int j: nums)
                li.add(j);
            ls.add(li);
            return;
        }
        for(int j=i;j<nums.length;j++){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            permute(ls, nums,i+1);
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
} 
