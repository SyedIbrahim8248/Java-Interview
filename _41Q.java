public class _41Q {
    public static void main(String[] args) {
        // count spaces in a  string
        String s = "Java is easy";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println(count);
    }
    }

