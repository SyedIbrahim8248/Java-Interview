public class _65Q {
    public static void main(String[] args) {
        //Interview Question: Write a Java program to check whether one string is a rotation of another string.
        String s1 = "ABCD";
        String s2 = "CDAB";

        if (s1.length() == s2.length() &&
                (s1 + s1).contains(s2)) {

            System.out.println("Strings are rotations");
        } else {
            System.out.println("Strings are not rotations");
        }

    }
}
