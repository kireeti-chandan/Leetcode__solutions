//https://practice.geeksforgeeks.org/problems/fraction-pairs-with-sum-1/1
class Fraction_pairs_with_sum_1 {
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        // code here
        int count=0;
        HashMap<String,Integer>  hs=new HashMap<>();
        for(int i=0;i<n;i++){
            int k=gcd(numerator[i],denominator[i]);
            int num=numerator[i]/k;
            int den=denominator[i]/k;
            String a=num+"/"+den;
            String d=den-num+"/"+den;
            if(hs.containsKey(d)){
                count+=hs.get(d);
            }
            int x=hs.getOrDefault(a,0) +1;
            hs.put(a,x);
        }
        return count;
        
    }
    public static int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
}
