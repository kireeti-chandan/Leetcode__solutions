class Sort_The_Array{
    int sum[];
    public int[] sortArray(int[] nums) {
        int l=0;
        int r=nums.length-1;
        mergesort(nums,l,r);
        sum=nums;
        return sum;
    }
    public static void mergesort(int nums[],int l,int r){
        if(l < r){
        int mid=(l+r)/2;
        mergesort(nums,l,mid);
        mergesort(nums,mid+1,r);
        merge(nums,l,mid,r);
        }
    }
    public static void merge(int[] nums,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=nums[l+i];
        for(int i=0;i<n2;i++)
            right[i]=nums[mid+1+i];
        int i=0,j=0,k=l;
        while(i <n1 && j< n2){
            if(left[i] <= right[j]){
                nums[k]=left[i];
                k++;i++;
            }
            else{
                nums[k]=right[j];
                k++;j++;
            }
        }
        while(i<n1){
            nums[k]=left[i];
            k++;i++;
        }
        while(j<n2){
            nums[k]=right[j];
            k++;j++;
        }
    }
}
