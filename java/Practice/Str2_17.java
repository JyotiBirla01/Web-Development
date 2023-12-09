
public class Str2_17 {
    public static void main(String[] args) {
        String s="asdfghj";
        char ch[]= s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>=97 && ch[i]<=122){
           int result=(ch[i]-32);
           ch[i]=(char)result; 
        }}
        for (char c : ch) {
            System.out.print(c+" ");
        }
    }
}
