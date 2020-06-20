import java.util.Scanner;
public class Armstrong {
    static int armstrong(int num) {
        int sum=0 , a ,temp;
        temp = num;
        while(num>0){
            a = num%10;
            sum = sum + (a*a*a);
            num = num/10;
        }
        if(temp == sum ){
            System.out.println("Given number is Armstrong....");
        }else{
            System.out.println("Given number is not an armstrong number....");
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int n = sc.nextInt();
        armstrong(n);
    }
}
