// https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
class Leaders_in_an_array{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code her
        ArrayList<Integer> nums=new ArrayList<>();
        int max=arr[n-1];
        nums.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i] >= max){
                max=arr[i];
                nums.add(max);
            }
                
        }
        Collections.reverse(nums);
        return nums;
    }
}

