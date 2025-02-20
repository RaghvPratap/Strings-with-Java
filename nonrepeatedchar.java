public class nonrepeatedchar {
    public static void main(String[] args) {
    String str="aabbccd";
    // char[] charArr=str.toCharArray();
    int charCount[]=new int[256];
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      charCount[ch]++;
    }
    for (int i = 0; i < str.length(); i++) {
        char ch=str.charAt(i);
        if(charCount[ch]==1){
           System.out.println(ch);
           break;
        }
    }
    }
}
