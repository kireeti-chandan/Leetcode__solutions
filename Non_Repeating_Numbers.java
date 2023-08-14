// https://practice.geeksforgeeks.org/problems/finding-the-numbers0215/1
class Non_Repeating_Numbers
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int[] arr=new int[2];
        int xor=0;
        int res1=0;
        int res2=0;
        for(int i=0;i<nums.length;i++)
            xor=xor^nums[i];
        int sn=xor &  ~(xor -1);
        for(int i=0;i<nums.length;i++){
            if((nums[i] & sn) != 0){
                res1=res1 ^ nums[i];   
            }
            else
                res2=res2^ nums[i];
        }
        if(res1<res2){
            arr[0]=res1;
            arr[1]=res2;
        }
        else{
            arr[0]=res2;
            arr[1]=res1;
        }
        return arr;
    }
}
