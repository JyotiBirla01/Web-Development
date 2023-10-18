/* 
  14) WAP check if a String contains only digits?
*/
import java.util.Scanner;
class CheckStringNum{
  public boolean checkStringNum(String str1){
    boolean res=false;
    int count=0;
    char ch1[]=str1.toCharArray();
      for(int i=0;i<ch1.length;i++){
        if(ch1[i]=='0'||ch1[i]=='1'||ch1[i]=='2'||ch1[i]=='3'||ch1[i]=='4'||ch1[i]=='5'||ch1[i]=='6'||ch1[i]=='7'||ch1[i]=='8'||ch1[i]=='9'){
          count++;
       }
      }
      if(count==ch1.length)
        res=true;
    return res;
  }
}
public class P14{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("check if a String contains only digits?\n\n");
    System.out.println("\nenter String : ");
    String str1=sc.nextLine();
    CheckStringNum obj=new CheckStringNum();
    boolean res=obj.checkStringNum(str1);
    System.out.println("OUTPUT: "+res);
  }
}