import java.util.Scanner;
public class InvertedTriangularPattern {
    public static int pattern(int num){
        for(int i=1; i<num; i++){
            for(int j=1; j<=i; j++){
               // System.out.println(i);
                return i;
            }
        }return 0;
    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter an integer number : ");
         int n = sc.nextInt();
         System.out.println("Inverted triangular pattern is : " + pattern(n));
    }
}
