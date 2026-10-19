public class _66Q {
    public static void main(String[] args) {
        //Interview Question: Write a Java program to count uppercase and lowercase English letters in a string.

        String str = "Java Programming";

        int upper = 0;
        int lower = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            }
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
