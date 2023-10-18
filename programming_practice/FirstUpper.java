import java.util.Scanner;

 class StringUpp {
    public String ConverToUpper(String s){
char a[]= s.toCharArray();
String s1=" ";
if(a[0]>=97 && a[0]<=122){
    a[0]-=32;
    s1+=a[0];

}
else{
    s1+=a[0];

}
for (int i = 1; i < a.length; i++) {
    if(a[i-1]==' ' && a[i]>=97 && a[i]<=122){
        a[i]-=32;
        s1+=a[i];

    }
    else{
        s1+=a[i];
    }
}return s1;
    }
    
}
class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String s= sc.nextLine();
        StringUpp p = new StringUpp();
        System.out.println(p.ConverToUpper(s));
        
    }
}