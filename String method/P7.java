/* 
  7)WAP to remove the duplicate letters from given String.
	Sample Input: “aabbccddd”
	Output: “abcd”
*/
import java.util.Scanner;
class RemoveString{
  public void removeString(String str){
    char ch[]=str.toCharArray();
    int i,j;
    for(i=0;i<ch.length;i++){
      for(j=0;j<i;j++){
        if(ch[i]==ch[j])
          break;
      }
      if(i==j)
        System.out.print(ch[i]);
    }
  }
}
public class P7{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println(" remove the duplicate letters from given String.\nSample Input: “aabbccddd”\nOutput: “abcd”\n");
    System.out.print("\n\nenter string : ");
    String str=sc.nextLine();
    RemoveString obj=new RemoveString();
    obj.removeString(str);
  }
}
