package SESI_12;

public class PALINDROME {
    public static boolean ispalindrome(String str, int start, int end){
        if(start >= end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return ispalindrome(str, start+1, end-1);
    }
    public static void main(String[] args) {
        String str = "malam";
        PALINDROME p = new PALINDROME();
        boolean result = p.ispalindrome(str, 0, str.length() - 1);
        if(result){
            System.out.println(str+" adalah palindrome");
        }else{
            System.out.println(str+" bukan palindrome");
        }
    }
}

