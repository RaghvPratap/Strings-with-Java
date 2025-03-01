import java.util.*;

public class string5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any string:");
        String str = sc.nextLine();
        int alpha = 0, digit = 0, sp = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                alpha++;
            } else if (ch >= 0 && ch <= 9) {
                digit++;
            } else {
                sp++;
            }

        }
        System.out.print(alpha + digit + sp);
    }
}
