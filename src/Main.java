public class Main {

    public static int sumOfNElements(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        else {
            return arr[n-1] + sumOfNElements(arr, n-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;
        System.out.println(sumOfNElements(arr, n));
    }
}
