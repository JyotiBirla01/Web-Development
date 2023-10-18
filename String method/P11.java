/* 
  11) Input name of a person and count how many vowels it contains. Use String class methods.
*/
import java.util.Scanner;
class NoOfVowelsInStr{
  public void noOfVowelsInStr(String str){
    char ch[]=str.toCharArray();
    int count=0;
    for(int i=0;i<str.length();i++){
       if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
         count++;
       }
    }
    System.out.println("Number of vowels : "+count);
  }
}
public class P11{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Input name of a person and count how many vowels it contains. Use String class methods.");
    System.out.println("\nenter name of person: ");
    String str=sc.nextLine();
    NoOfVowelsInStr obj=new NoOfVowelsInStr();
    obj.noOfVowelsInStr(str);
  }
}