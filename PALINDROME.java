package SESI_12;

public class PALINDROME {
    public static boolean isPalingdrome(String str, int start, int end){
        if(start >= end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return isPalingdrome(str, start+1, end-1);
    }
    public static void main(String[] args) {
        String str = "malam";
        palindrome p = new palindrome();
        boolean result = p.isPalingdrome(str, 0, str.length() - 1);
        if(result){
            System.out.println(str+" adalah palindrome");
        }else{
            System.out.println(str+" bukan palindrome");
        }
    }
}

