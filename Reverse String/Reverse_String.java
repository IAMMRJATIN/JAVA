//Java code for Reverse a String.

public class Reverse_String{
    public static void main(String[] args){
        String str = "Automation";

        StringBuilder reversed = new StringBuilder(str).reverse();

        System.out.println("starting String: " + str);
        System.out.println("Reversed String: " + reversed);
        
    }
}