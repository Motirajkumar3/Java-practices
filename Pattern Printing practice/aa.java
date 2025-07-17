import java.util.Scanner;

public class aa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of top rows
        int num = 3;

        // Top half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

        // Bottom half
        int temp = num - (n - 1);
        for (int i = n - 1; i >= 1; i--) { // ✅ changed i >= 0 to i >= 1
            int val = temp;
            for (int j = 0; j <= i; j++) {
                System.out.print(val++ + " ");
            }
            temp -= i;
            System.out.println();
        }

        sc.close();
    }
}
