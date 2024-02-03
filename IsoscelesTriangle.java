import java.util.Scanner;

class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the isosceles triangle: ");
        int height = input.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = height - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
