class Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0 ;i<nums1.length;i++){
            arr[k]=nums1[i];
            k++;
        }
        for(int j=0;j<nums2.length;j++){
            arr[k]=nums2[j];
            k++;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        double res;
        int mid=(arr.length-1)/2;
        if(arr.length %2 != 0){
            res=arr[mid];
        }
        else{
            res=(double)(arr[mid]+arr[mid+1])/2;
        }
        return res;
            
    }  
}
