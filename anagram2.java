public class anagram2 {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "baa";
        StringBuilder sb = new StringBuilder(s2);
        char[] arr1 = s1.toCharArray();
        int i = 0;
        while (i < arr1.length) {
            int j = 0;
            // boolean found = false;
            while (j < sb.length()) {
                if (arr1[i] == sb.charAt(j)) {
                    sb.deleteCharAt(j);
                //    found =true;
                    break;
                } else {
                    j++;
                }
            }
            // if(!found){
            //     found=false;
            //     break;
            // }
            i++;
        }

        if (sb.length() == 0) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Not anagram");
        }
    }
}
