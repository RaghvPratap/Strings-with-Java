import java.util.Arrays;

public class anagram3 {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "baa";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr2);
        Arrays.sort(arr1);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("string are anagrams");
        } else {
            System.out.println("Not anagram");
        }
    }
}
