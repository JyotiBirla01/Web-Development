    // A B C D E D C B A 
    //  B C D E D C B 
    //    C D E D C 
    //      D E D
    //        E
public class Pr11 {
    public static void main(String[] args) {
    for(int i=1; i<=5; i++){
        for(int j=1; j<i; j++){
            System.out.print(" ");
        }
        for(int k=i; k<=5; k++){
            System.out.print((char)(k+64));
        }
         for(int k=4; k>=i; k--){
            System.out.print((char)(k+64));
        }
        
        System.out.println();
    }

       
}
    
}
