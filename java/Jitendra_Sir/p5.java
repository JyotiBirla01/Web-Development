// Reverse word
public class p5 {
    public static void main(String[] args) {
        String s= "Java is simple ";
        String parts[]= s.split(" ");
        String word=" ";

        for(int i=parts.length-1; i>=0; i--){
            word+=parts[i];

        }
        System.out.println(word);
    }
}
