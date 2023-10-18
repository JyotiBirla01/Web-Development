import java.util.Scanner;

public class Str12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = "Apple is a fruit";
        int length=s.length();
        char ch[] = s.toCharArray();
        System.out.println("Enter the first  index");
        int  index1= sc.nextInt();
        System.out.println("Enter the second indext");
        int index2=sc.nextInt();
        if(index1>0 && index1<length &&index2>0 && index2<length){
        for (int i =index1 ; i < index2; i++) {
            System.out.println(ch[i] + " ");
        }}
        else
        System.out.println("Invalid input");
    }
}
