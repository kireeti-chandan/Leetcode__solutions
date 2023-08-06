class String_Permutations
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> arr=new ArrayList<>();
        permute(S,0,arr);
        Collections.sort(arr);
        return arr;
    }
    public static void permute(String str,int i,ArrayList<String> arr){
        if(i == str.length() -1){
            arr.add(str);
        }
        for(int j=i;j<str.length();j++){
            str=swap(str,i,j);
            permute(str,i+1,arr);
            str=swap(str,i,j);
        }
    }
    public static String swap(String str,int i,int j){
        char[] ch=str.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
    
	   
}

