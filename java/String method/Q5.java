/* 
  5) Write a java program to reverse each word of String.
	 Sample Input: “Java Is Plateform Independent”
	 Output: “avaJ sI mrofetalP tnednepednI”
*/
class Test{
    String s;
    public void str(String s[]){
       for (int i = 0; i < s.length; i++) {
            this.s = s[i];
        } 
    } 
}
public class Q5 {
    public static void main(String[] args) {
        String n = "Java Is Plateform Independent";
        String s[] = n.split(" ");
        String reverse = "";
        for(int i = 0; i < s.length; i++){
            String word = s[i];
            reverse = "";
            for(int j = word.length()-1; j >= 0; j--){
                reverse = reverse + word.charAt(j);
            }
            System.out.print(reverse+" ");
        }
        Test obj = new Test();
        obj.str(s);
    }
}