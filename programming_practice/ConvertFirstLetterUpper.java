import java.util.Scanner;
public class ConvertFirstLetterUpper {
    
public void check(String s) {
        String parts[] = s.split(" ");
        for (int i = 0; i < parts.length; i++) {
            char partsArray[] = parts[i].toCharArray();
          
        if(partsArray[0]>=97 && partsArray[0]<=122){
            partsArray[0]-=32;
        } 
        for(int j=0;j<partsArray.length;j++){
        System.out.print(partsArray[j]);
        }System.out.print(" ");
    }
    }}
class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String ");
        String s= sc.nextLine();
        ConvertFirstLetterUpper obj= new ConvertFirstLetterUpper();
        obj.check(s);


    }
}