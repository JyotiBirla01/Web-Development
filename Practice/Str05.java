




import java.util.Scanner;
public class Str05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        String parts[]= s.split(" ");
        int max=0;
        String temp=" ";
        int i=0;
        for (i = 0; i < parts.length; i++) {
            int length=parts[i].length();
            if(length>max){
                max=length;
                temp=parts[i];

            }
            
        }
        System.out.println(temp);

    }
}
