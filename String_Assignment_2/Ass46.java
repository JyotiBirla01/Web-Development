/*46. Write a program to separate all tokens (words) using StringTokenizer */
/*import java.util.StringTokenizer;  
public class Simple{  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("my name is khan"," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}  
 */
import java.util.StringTokenizer;
class Test {
    public void  tokens(String s){
        /*  String part[]=s.StringTokenizer(" ");
         String r[]=new String[part.length];
         for(int i=0;i<part.length;i++){    
            r[i]=part[i];*/
    StringTokenizer st = new StringTokenizer(s);  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
  
         }
        
        
    }

class Testmain{
  public static void main(String args[]){
    String s="Java is Plateform Independent";
    Test obj=new Test();
    obj.tokens(s);
  }

}
