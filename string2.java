import java.util.*;

public class string2 {
    public static void main(String[] args) {
        String st = ("Very handsome boi");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start inedx:");
        int start = sc.nextInt();
        System.out.print("Enter the end inedx:");
        int end = sc.nextInt();
        System.out.print(st.substring(start, end));
    }
}
