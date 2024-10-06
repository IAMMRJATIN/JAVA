import java.util.Scanner;

public class Find_Factorial {
    public static void main(String[] args) {
        // int num = 5, factorial = 1;
        // for( int i = 1; i <= num; i++){
        //     factorial *= i;
        // }
        // System.out.println(factorial);

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number who's factorial you want to print : ");
        int num = obj.nextInt();

        int i, factorial = 1;
        for ( i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("Factorial of the number " + num + " is : " + factorial);

        obj.close();
    }

}
