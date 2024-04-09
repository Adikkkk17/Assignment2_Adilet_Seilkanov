public class SumOfSquares {
    public static int sumOfSquares(int n) {
        if (n<= 0)  {
            return 0;
        }
        if (n==1){
            return 1;
        }
        else {
            return n * n + sumOfSquares(n - 1);
        }
    }
}

