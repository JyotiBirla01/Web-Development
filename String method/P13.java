/* 
  13)WAP check if two Strings are anagrams of each other?
     (Hint Anagram words: LISTEN - SILENT 
	 TRIANGLE - INTEGRAL)

*/
import java.util.Scanner;
class CheckStringAnagrams{
  public boolean checkStringAnagrams(String str1,int s1,String str2,int s2){
    boolean res=false;
    int count=0;
    char ch1[]=str1.toCharArray();
    char ch2[]=str2.toCharArray();
    if(s1!=s2)
        res=false;
    else{
      for(int i=0;i<s1;i++){
        for(int j=0;j<s2;j++){
          if(ch1[i]==ch2[j]){
            count++;
            break;
          }
        }
      }
      if((count==s1)&&(count==s2))
        res=true;
    }
    return res;
  }
}
public class P13{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("check if two Strings are anagrams of each other?\n(Hint Anagram words: LISTEN - SILENT \nTRIANGLE - INTEGRAL)\n\n");
    System.out.println("\nenter first String : ");
    String str1=sc.nextLine();
    System.out.println("\nenter secound String : ");
    String str2=sc.nextLine();
    int s1=str1.length();
    int s2=str2.length();
    CheckStringAnagrams obj=new CheckStringAnagrams();
    boolean res=obj.checkStringAnagrams(str1,s1,str2,s2);
    System.out.println("OUTPUT: "+res);
  }
}