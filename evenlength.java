public class evenlength {
    public static void main(String[] args) {
        String str="Hell world";
        String[] s=str.split(" ");
        for (String string : s) {
            if(string.length()%2==0){
                System.out.println(string);
            }
        }
    }
}
