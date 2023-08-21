class Repeated_Substring_Pattern {
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        for(int i=len/2;i>= 1;i--){
            if(len % i == 0){
                int numrepeat=len/i;
                String subString=s.substring(0,i);
                StringBuilder sb=new StringBuilder();
                for(int j=0;j< numrepeat;j++){
                    sb.append(subString);
                }
                if(sb.toString().equals(s))
                    return true;
            }
        }
        return false;
    }
    
}
