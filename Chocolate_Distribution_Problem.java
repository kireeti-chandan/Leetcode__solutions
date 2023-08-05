// https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
class Chocolate_Distribution_Problem
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
         long res=Integer.MAX_VALUE;
        Collections.sort(a);
        for(int i=0;i<=n-m;i++){
            if(a.get(i+m-1) - a.get(i) < res)
                res=a.get(i+m-1) - a.get(i);
        }
        return res;
    }
}
