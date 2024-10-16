import java.util.Scanner;

public class numberPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            // print spaces
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }

            // print *s
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
