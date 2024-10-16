import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        // print a number pyramid
        int num = 0;

        for (int i = 1; i <= row; i++) {
            num++;
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
