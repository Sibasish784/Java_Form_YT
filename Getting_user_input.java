import java.util.*;

public class Getting_user_input {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the value A");
        int A = sc.nextInt();
        System.out.println("Enter the value B");
        int B = sc.nextInt();
        int sum = A + B;
        System.out.print("The sum is:");
        System.out.println(sum);
    }
}
