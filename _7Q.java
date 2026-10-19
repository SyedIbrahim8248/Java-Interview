public class _7Q {
    public static void main(String[] args) {
        // check palindrome number or not
        int n = 121;
        int original = n;
        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        if(original == reverse){
            System.out.println("Palidrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
