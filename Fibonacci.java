import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the number of terms you want: ");
    int term = obj.nextInt();
    int prev_no = 0, current_no = 1;
    System.out.print(prev_no + " " + current_no);
    for (int i = 3; i <= term; i++) {
      int next_no = prev_no + current_no;
      System.out.print(" " + next_no);
      prev_no = current_no;
      current_no = next_no;
    }
    obj.close();
  }
}
