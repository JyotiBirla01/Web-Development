/* 
  10) WAP to count the word whose first letter is  vowel.
*/
import java.util.Scanner;
class ContVowelsInString{
  public void contVowelsInString(String parts[],int n){
    int count=0;
    for(int i=0;i<n;i++){
       if(parts[i].charAt(0)=='a'||parts[i].charAt(0)=='e'||parts[i].charAt(0)=='i'||parts[i].charAt(0)=='o'||parts[i].charAt(0)=='u'||parts[i].charAt(0)=='A'||parts[i].charAt(0)=='E'||parts[i].charAt(0)=='I'||parts[i].charAt(0)=='O'||parts[i].charAt(0)=='U'){
         count++;
       }
    }
    System.out.println("count : "+count);
  }
}
public class P10{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("count the word whose first letter is  vowel");
    System.out.println("\nenter string: ");
    String str=sc.nextLine();
    String parts[]=str.split(" ");
    int n=parts.length;;
    ContVowelsInString obj=new ContVowelsInString();
    obj.contVowelsInString(parts,n);
  }
}