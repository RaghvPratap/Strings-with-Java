public class anagram {
    public static void main(String[] args) {
        isAnangram("aab", "baa");
    }
    public static boolean isAnangram(String s1,String s2){
        int count[]=new int[256];
        
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i)]--;
        }
        
        for (int i = 0; i <count.length; i++) {
            if(count[i]!=0){
                return false;
            }
        }
      return true;
    }
}
