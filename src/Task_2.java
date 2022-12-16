import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void oop(int var) {

        for (int i = 0; i <= var; i++) {
            System.out.println(var);
        }
    }

    public static void oop(float var) {
        var *= 3;
        System.out.println(var);
    }

    //hello from git


    public static void oop(String var) {
        System.out.println(var);
    }

    public static void add(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] += 5;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number from 1-7:");
        int num = in.nextInt();
        int day = num - 1;
        switch (day) {
            case (0):
                int rows = 5, k = 0;
                for (int i = 1; i <= rows; ++i, k = 0) {
                    for (int j = 1; j <= rows - i; ++j) {
                        System.out.print("  ");
                    }
                    while (k != 2 * i - 1 && i != 3) {
                        System.out.print("* ");
                        ++k;
                    }
                    System.out.println();
                }
                break;
            case (1):
            case (2):
                int sum = 0;
                float avg;
                System.out.println("Enter Array Size:");
                int size = in.nextInt();
                int[] arr2 = new int[size];
                System.out.println("Enter Array Elements:");
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = in.nextInt();
                }
                for (int i = 0; i < arr2.length; i++) {
                    sum += arr2[i];
                }
                avg = sum / size;
                System.out.println(avg);

                break;
            case (3):
                break;
            case (4):

                System.out.print("Enter row for the array (max 3) : ");
                int row = in.nextInt();
                System.out.print("Enter column for the array (max 3) : ");
                int col = in.nextInt();
                System.out.println("Enter Array Elements");
                int[][] arr = new int[row][col];
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        arr[i][j] = in.nextInt();
                    }
                }
                System.out.print("The Array is :\n");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(arr[i][j] + "  ");
                    }
                    System.out.println();
                }
                break;

            case (5):
                int[] arr3 = {1,2,3,4};
                add(arr3);
                System.out.print(Arrays.toString(arr3));
                break;

            case (6):
                System.out.println("Enter an Integer:");
                int var = in.nextInt();
                oop(var);
                System.out.println("Enter a Floating Number:");
                float var2 = in.nextFloat();
                oop(var2);
                String var3 = ("\"Hello!\"+String");
                oop(var3);
            default:
        }
    }
}



