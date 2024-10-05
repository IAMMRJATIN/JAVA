public class Check_Palindrome {
    public static void main(String[] args){
        String str = "Copilot";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str);
        System.out.println(reversed);
        //Compare both of the strings here.
        System.out.println(str.equals(reversed));
    }
}
