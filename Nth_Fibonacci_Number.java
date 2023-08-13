// https://practice.geeksforgeeks.org/problems/nth-fibonacci-number1335/1
class Nth_Fibonacci_Number {
    static int nthFibonacci(int n){
        // code here
        int a=0;
        int b=1;
        if(n== 1)
            return a;
        if(n == 2)
            return b;
        int c=0;
        for(int i=3;i<=n+1;i++){
            c=(a+b)%(1000000007);
            a=b;
            b=c;
        }
        return c;
    }
}
