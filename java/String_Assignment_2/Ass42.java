/*42. Write a program to First alphabet capital of each word in given string
 */



import java.util.Scanner;
 class Test {
     public void capitalAlpha(char ch[]) {
     /*String part[]=s.split(s);
     for(int i=0;i<part.length;i++){
      if( (part[i].charAt(0)) >=97  && (part[i].charAt(0))<=122){
                int c= (int)(part[i].charAt(0));
                  part[i].charAt(i)=(char)(c-32);
      }*/
      char c=' ';
      /*int r=(int)(ch[0]-32);
      ch[0]=(char)(r);*/
      String s=""; 
      for(int i=0;i<ch.length;i++){
        if(ch[0]>=97 && ch[0]<=122){
           int result=(int)(ch[0]-32);
           ch[0]=(char)(result); 
        }       
        if((ch[i]==c) && (ch[i+1]>=97 && ch[i+1]<=122) ){
           int result=(int)(ch[i+1]-32);
           ch[i+1]=(char)(result);
        }
         s=s+ch[i];
      }
       System.out.println("String is : "+s);
     }

    }
  
        
              
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s = sc.nextLine();
        char ch[]=s.toCharArray();
         new Test().capitalAlpha(ch);
        }
}
