
public class Sigature {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        char ch[] = { 'h', 'e', 'l', 'l', 'o' };
        String s3 = new String(ch);
        byte b[] = { 65, 66, 67, 68, 69, 70 };
        String s4 = new String(b);
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println("hello".length());
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s5 = new String("Hello").intern();

    }

}
