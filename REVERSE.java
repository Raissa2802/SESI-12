package SESI_12;

public class REVERSE {
    public static void printReverse(int n) {
        if(n<1){
            return;
        }else{
            System.out.print(n+" ");
            printReverse(n-1);
        }
    }
    public static void main(String[] args){
        int n = 10;
        printReverse(n);
    }
}

