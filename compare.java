public class compare {
    public static void main(String[] args) {
        String str1="Mello";
        String str2="Hello";
        int i=0;
        if (str1.length()!=str2.length()) {
           System.out.println("false");
        }
        while(i<str1.length()){
          if(str1.charAt(i)!=str2.charAt(i)){
            System.out.println("false");
            break;
          }
          i++;
        }
        System.out.println("true");
    }
}
