import java.util.Scanner;


public class test1 {
    //Function --> 1.Declare 2.Define 3.Call
    // Loop : for(initialize; basecondition; Inc/Dec)
    // Q1. we want to show user numbers from 10 to 1.
    public static void print(int num){
        //body
        //calling the same function
        //print();
        //Backtracking
        //base condition --> Ask one qustion : where will the code stop
        //base condition --> when i get number as 0, I need to stop
        if(num == 0){
            System.out.println("code ended");
            return;
        }
        //General case --> Execute the problem statement --> 2 things(1st code execution ,2nd Inc/Dec)
        else{
            System.out.println(num);
            print(num-1);
        }
    }
    public static int CatEyes(int cats) {
        // Base condition
        if (cats == 0) {
            return 0;
        } else {
            //Code expression
            // No of cats is 3 --> 2 + 2 + 2 = 6
            return 2 + CatEyes(cats - 1);
        }
    }
    public static void main(String[] args){

        // ERROR --> Stack overflow
        //print(10);
        //this loop is going to iterate 10 times(starting from 0 ending at 10)
       // for(int i=0; i<10; i++){
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number : ");
        int n = sc.nextInt();
        //Initialization : from user
        print(n);
    }
}
