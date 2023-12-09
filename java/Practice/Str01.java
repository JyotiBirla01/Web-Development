import java.util.Scanner;

//5) Write a java program to reverse each word of String.
	Sample Input: “Java Is Plateform Independent”
	Output: “avaJ sI mrofetalP tnednepednI”

public class Str01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String parts[] = s.split(" ");
        String temp = " ";
for (int i = 0; i < parts.length; i++) {
    String word= parts[i];
    String temp1=" ";
    for (int j =word.length()-1; j >=0; j--) {
        temp1+=word.charAt(j);

    }
    temp+=temp1+" ";


}
System.out.println(temp);
    }

}
