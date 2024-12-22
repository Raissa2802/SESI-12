package SESI_12;

public class NILAIMAX {
     public static int findMax(int[] arr, int n, int max) {
        if (n == 0) {
            return max;
        }
            if (arr[n - 1] > max) {
                max = arr[n - 1];
            }
                return findMax(arr, n - 1, max);
        }
    
        public static void main(String[] args) {
            int arr[] = {3, 5, 15, 70, 45, 76, 80, 30, 55, 70, 36};
            int max = Integer.MIN_VALUE;
            int result = findMax(arr, arr.length, max);
            System.out.println("Nilai Maksimumnya: " + result);
        }
    }

