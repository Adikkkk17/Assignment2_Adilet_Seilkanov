import java.util.Scanner;
public class toreverseArray

{
    public static void main(String[] args) {
        Scanner scannedarray = new Scanner(System.in);
        int n = scannedarray.nextInt();
        toreverseArray (scannedarray, n);
        scannedarray.close();
    }

    public static void toreverseArray(Scanner scannedarray, int n) {
        if (n > 0) {
            int num = scannedarray.nextInt();
            toreverseArray (scannedarray, n - 1);
            System.out.print(num + " ");
        }
        else{
            return;
        }
    }
}

