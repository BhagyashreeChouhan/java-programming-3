import java.util.Scanner;
public class test2 {
    public static int CatEyes(int cats){
         // Base condition
        if(cats == 0){
            return 0;
        }else{
            //Code expression
            // No of cats is 3 --> 2 + 2 + 2 = 6
            return 2 + CatEyes(cats-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number : ");
        int n = sc.nextInt();
        //Initialization : from user
        System.out.println("The CatEyes are : " + CatEyes(n));
    }
}
