import java.util.Scanner;


public class printAllSequences {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("n and k:");
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            prepareSequences(n, k, new int[n], 0);
            scanner.close();
        }

        public static void prepareSequences(int n, int k, int[] sequense, int index) {
            if (index == n) {
                printSequenses(sequense);
                return;
            }

            for (int i = 1; i <= k; i++) {
                sequense[index] = i;
                prepareSequences(n, k, sequense, index + 1);
            }
        }

        public static void printSequenses(int[] sequense) {
            for (int num : sequense) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


