public class _40Q {
    public static void main(String[] args) {
//       // count vowels in a strings
//                String s = "hello";
//                int count = 0;
//
//                for (int i = 0; i < s.length(); i++) {
//                    char ch = Character.toLowerCase(s.charAt(i));
//
//                    if (ch == 'a' || ch == 'e' || ch == 'i' ||
//                            ch == 'o' || ch == 'u') {
//                        count++;
//                    }
//                }
//
//                System.out.println(count);

        // count consonants in a string

        String s = "hello";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch >= 'a' && ch <= 'z' &&
                    ch != 'a' && ch != 'e' && ch != 'i' &&
                    ch != 'o' && ch != 'u') {
                count++;
            }
        }

        System.out.println(count);
            }
        }


