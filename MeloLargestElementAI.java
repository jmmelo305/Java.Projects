import java.util.Scanner;

public class MeloLargestElementAI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int rowNum = input.nextInt();
        int colNum = input.nextInt();

        double[][] array = new double[rowNum][colNum];

        System.out.println("Enter the array: ");
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        int[] location = locateLargest(array);
        System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");
        
        input.close();
    }

    public static int[] locateLargest(double[][] a) {
        int[] location = new int[2]; // [row, col]
        double max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }
}
