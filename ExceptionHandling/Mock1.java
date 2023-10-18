public class Mock1 {
    public static void main(String[] args) {
        int a=1;
        float b=1.0f;
        System.out.println(1==1);//t
        System.out.println(a==b);//t
        System.out.println(1==1.0f);//t
        double z=1.0;
        System.out.println(b==z);//t
//Because it is relational operator
        Object s= "Hello";
        String s1= "Hello";
        System.out.println(s.equals(s1)); //t

    }
}
