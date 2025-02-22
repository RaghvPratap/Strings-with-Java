import java.util.Arrays;

public class reversestring {
    public static void main(String[] args) {
        String s="hello world     mukul";
        String[] str=s.split("   ");
        int l=str.length;
        String[] str2=new String[str.length];
        int j=0;
        for (int i = l-1; i >=0; i--) {
            str2[j]=str[i];
            j++;
        }
        String reverse=Arrays.toString(str2);
        System.out.println(reverse);
    }
}
