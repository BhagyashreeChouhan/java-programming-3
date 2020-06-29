import java.util.Scanner;
public class InvertedTriangularPattern {

    public static void pattern(int n)
    {
        if(n==0)
        {
            System.out.print(n+ " ");
        }
        else
        {
            System.out.print(n+" ");
            pattern(n-1);
            System.out.print(n+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any integer number : ");
        int i= sc.nextInt();
        InvertedTriangularPattern tr = new InvertedTriangularPattern();
        pattern(i);
    }
}