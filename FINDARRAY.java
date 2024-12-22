package SESI_12; 

public class FINDARRAY {
        public static boolean search(int[] arr, int n, int target){
            if (n == 0) {
                return false;
            }
            if (arr[n -1] == target) {
                return true;
            }
            return search(arr,n - 1, target);
        }
        public static void main(String[] args) {
            int[] arr = {15, 2, 45, 27, 60};
            int target = 27;
            boolean found = search(arr, arr.length, target);
            if(found == true) {
                System.out.println("Element '"+target+"' ada di dalam array.");
            }else{
                System.out.println("Element tidak ada di dalam array.");
            }
        }
    }

