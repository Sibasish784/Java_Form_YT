
import java.util.*;

public class exp_in_java_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of v:");
            int v = sc.nextInt();

        System.out.println("Enter the value of u:");
            int u = sc.nextInt();

        System.out.println("Enter the value of a:");
            int a = sc.nextInt();

        System.out.println("Enter the value of s:");
            int s = sc.nextInt();


        System.out.println("Expression is:");
        System.out.println (v*v - u*u / (2*(a * s)));

    }
}
