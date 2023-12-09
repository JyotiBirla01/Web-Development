public class ReverseWord {
    public static void main(String[] args) {
        String s = "I love Coding ";
//         String parts[] = s.split(" ");
//         String word = " ";
//        String letter= " ";
//        for(int i=parts.length-1; i>=0; i--){
//        word+=parts[i];
//        String reverseWord="";
//          for(int j=word.length()-1; j>=0; j--){
// letter+=word.charAt(j);
//        }
//        word+=reverseWord+" ";
//     //    letter+=parts[i]+" ";
//        }
     
//        System.out.println(word+" ");
//        System.out.println("================");
//        System.out.println(letter);
String []str= s.split(" ");
String t="";
String  sen="";
for(int i=str.length-1;i>=0; i--){
    String temp=str[i];
    String reverseword=" ";
    for(int j=temp.length()-1; j>=0; j--){
        reverseword+=temp.charAt(j);
    }
    t+=reverseword+" ";
    sen+=str[i]+"";
}
System.out.println(t);
System.out.println(sen);


    }
}
