class Flip_Bits {

    public static int maxOnes(int a[], int n) {
        // Your code goes here
        int count=0;
        int ones=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(a[i] == 0)
                count++;
            else
            {
                count--;
                ones++;
                if(count < 0)
                    count=0;
            }
            if(count > max)
                max=count;
        }
        return max+ones;
    }
}

