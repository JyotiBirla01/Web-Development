

public class Str07 {
    public static void main(String[] args) {
       // Scanner sc= new Scanner(System.in);
        String s="67, 89, 23, 67, 12, 55, 66";
        String parts[]= s.split(", ");
        int sum=0;
        for (int i = 0; i < parts.length; i++) {
            String word=parts[i];
        int ele=Integer.parseInt(word);
        sum+=ele;

    }    
    System.out.println(sum);
        }
        
    
}
