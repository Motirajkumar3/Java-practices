class Solution {
    public static boolean isPalindrome(String s) {
        s=rem(s);
        if(s.isEmpty())
        {
            return true;
        }
        int l=0;
        int r=s.length()-1;
        while (l < r)
        {
            if(s.charAt(l)==s.charAt(r))
            {
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static String rem(String s){
        String snew="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)) && s.charAt(i)!=' ')
            {
                snew=snew+s.charAt(i);
            }
        }
        return snew.toLowerCase().trim();
    }
//     public static void main(String[] args) {
//         String s=" ";
//         s=rem(s);
//         System.out.println("\n"+isPalindrome(s));
//     }
}