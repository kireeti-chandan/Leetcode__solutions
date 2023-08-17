class Next_Smallest_Palindrome {

    Vector<Integer> generateNextPalindrome(int num[], int n) {
        // code here
        Vector<Integer> ans=new Vector<>();
        int arr[]=new int[n];
        boolean flag=false;
        for(int i=0;i<n/2;i++){
            arr[i]=num[i];
        }
        for(int i=0;i<n/2;i++){
            if(arr[n/2-1-i] > num[n - n/2 +i]){
                flag=true ;
                break;
            }
            else if(arr[n/2 - 1 -i] < num[n - n/2 +i])
                break;
        }
        if(flag){
            Vector<Integer> res=new Vector<>();
            for(int i=0;i<n/2 ;i++){
                res.add(arr[i]);
            }
            if(n%2 == 1)
                res.add(num[n/2]);
            for(int i=n/2-1;i>=0;i--){
                res.add(arr[i]);
            }
            return res;
        }
        int[] half=new int[n - n/2];
        for(int i=0;i<n-n/2;i++){
            half[i]=num[i];
        }
        int carry=1;
        for(int i=n-n/2-1;i>=0;i--){
            int x=half[i]+carry;
            carry=x/10;
            half[i]=x%10;
        }
        if(carry == 1)
        {
            ans.add(1);
            for(int i=0;i<n-1;i++)
                ans.add(0);
            ans.add(1);
        }
        else{
            for(int i=0;i<n-n/2 ;i++){
                ans.add(half[i]);
            }
            for(int i=n/2 -1;i>=0;i--){
                ans.add(half[i]);
            }
        }
        return ans;
    }
}
