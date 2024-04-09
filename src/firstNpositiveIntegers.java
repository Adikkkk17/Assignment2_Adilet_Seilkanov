public class firstNpositiveIntegers {
    public static int firstNpositiveInteger(int n) {
        if (n <= 0)
        {
            return 0;
        } else {





            return n + firstNpositiveInteger(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstNpositiveInteger(n));
    }
}
