class Valid_Palindrome{
    public boolean isPalindrome(String s) {
        int low=0;
        int high=s.length()-1;
        while(low < high){
            char lowchar=s.charAt(low);
            char highchar=s.charAt(high);
            if(!Character.isLetterOrDigit(lowchar)){
                low++;
                continue;
            }
            if(!Character.isLetterOrDigit(highchar)){
                high--;
                continue;
            }
            if(Character.toLowerCase(lowchar) != Character.toLowerCase(highchar))
                return false;
            low++;high--;
        }
        return true;
    }
}
