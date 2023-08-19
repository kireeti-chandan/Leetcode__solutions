// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
class Subarray_with_given_sum
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        HashMap<Integer,Integer> hs=new HashMap<>();
         ArrayList<Integer> nums=new ArrayList<>();
        int presum=0;
        for(int i=0;i<n;i++){
            presum+=arr[i];
            if(presum == s){
                nums.add(1);
                nums.add(i+1);
                return nums;
            }
            if(hs.containsKey(presum - s)){
                nums.add(hs.get(presum - s)+2);
                nums.add(i+1);
                return nums;
            }
            hs.put(presum,i);
        }
        nums.add(-1);
        return nums;
    }
}
