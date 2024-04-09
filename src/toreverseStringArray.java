import java.util.Scanner;
public class toreverseStringArray {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            toreverseStringArray(scanner, n);

        }

        public static void toreverseStringArray(Scanner scanner, int n) {
            if (n > 0) {
                String string = scanner.next();
                toreverseStringArray(scanner, n - 1);
                System.out.println(string);
            }
            else return ;
        }
    }


