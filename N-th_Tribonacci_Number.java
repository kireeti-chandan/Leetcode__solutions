class N-th_Tribonacci_Number {
    public int tribonacci(int n) {
        int a=0;
        if(n == 0)return a;
        int b=1;
        if(n == 1)return b;
        int c=1;
        if(n == 2)return c;
        int res=a+b+c;
        for(int i=3;i<=n;i++){
            res=a+b+c;
            a=b;
            b=c;
            c=res;
        }
        return res;
    }
}
