import java.util.*;

public class string4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter any string:");
        // String st = "aeiouAEIOU";
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {

            /*if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U')*/
                    
                    if("aeiouAEIOU".contains(String.valueOf(0))){
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}
