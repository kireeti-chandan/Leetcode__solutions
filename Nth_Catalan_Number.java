// https://practice.geeksforgeeks.org/problems/nth-catalan-number0817/1
class Nth_Catalan_Number {
    public static int findCatalan(int n) {
        // code here
        int arr[]=new int[n+1];
        int mod=1000000007;
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                long res=(long)arr[j]*arr[i-j-1];
                arr[i]=(int)((arr[i]+res)%mod);
            }
        }
        return arr[n];
    }
}
