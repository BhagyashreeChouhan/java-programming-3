import java.util.Scanner;
public class SumOfDigits {
    public static int sum(int num) {
        //Base Condition
        if(num == 0) {
            return 0;
        }else{
            //code expression
            return num % 10 + sum(num/10);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Sum of Digits = " + sum(n));
    }
}
