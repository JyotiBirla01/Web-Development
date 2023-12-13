// 1
// 32
// 543
// 7654
// 98765
// 11109876
// 13121110987
public class p11 {
    public static void main(String[] args) {
        int n=7;
        int k=1;
         for(int i=1; i<=n; i++){
        int print =k;
        for(int j =1; j<-n-i; j++ ){
System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print(print--);
        }
        k=k+2;
        System.out.println();
    }
    }
}
