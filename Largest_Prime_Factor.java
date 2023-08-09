class Largest_Prime_Factor{
    static long largestPrimeFactor(int n) {
        // code here
        int max=Integer.MIN_VALUE;
        if(n<=1)
            return 0;
        while(n%2 == 0){
            n=n/2;
            max=max > 2?max:2;
        }
        while(n%3 == 0){
            n=n/3;
            max=max > 3? max:3;
        }
        for(int i=5;i*i<=n;i+=6){
            while(n%i == 0){
                n=n/i;
                max=max > i?max :i;
            }
            while(n%(i+2) == 0){
                n=n/(i+2);
                max=max > (i+2)?max :(i+2);
            }
        }
        if(n > 3)
            max=max> n?max:n;
        return max;
    }
    
}
