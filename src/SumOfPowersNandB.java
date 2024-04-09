public class SumOfPowersNandB {
        public static int sumOfFirstNPowersNandB(int b, int n) {
            if (n == 0) {
                return 1;
            } else {


                return (int) Math.pow(b, n) + sumOfFirstNPowersNandB(b, n - 1);
            }
        }

        public static void main(String[] args) {
            int b = 4;
            int n = 3;
            System.out.println(sumOfFirstNPowersNandB(b, n));
        }
    }


