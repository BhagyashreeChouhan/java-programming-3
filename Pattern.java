import java.util.Scanner;
public class Pattern {
    public static void Pat(int n, int k) {
        if (n <= 0) {
            System.out.print(n + " ");
        } else {
            System.out.print(n + " ");
            Pat(n - k, k);
            System.out.print(n + " ");
        }
    }
}


class test{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        Pattern pt = new Pattern();
        pt.Pat(n , k);
    }
}

