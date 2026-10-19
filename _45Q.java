import java.util.Arrays;
public class _45Q {
    public static void main(String[] args) {
        // check whether two strings are anagrams
        // anagrams me dono strings ke characters same hote hai ,bs order alag ho skta hai
            String a = "listen";
            String b = "silent";

            char[] x = a.toCharArray();
            char[] y = b.toCharArray();

            Arrays.sort(x);
            Arrays.sort(y);

            System.out.println(Arrays.equals(x, y));
    }
}
