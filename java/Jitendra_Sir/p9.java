// 12345677654321
// 123456**654321
// 12345****54321
// 1234******4321
// 123********321
// 12**********21
// 1************1
public class p9 {
    public static void main(String[] args) {
        int n=7;
        for(int i=1; i<=7; i++){
            int k=1;
            for(int j=1; j<=7*2; j++){
                if(j<=n-i+1){
                    System.out.print(k++);
                }
                else if(j>n && j>=n+i){
                    System.out.print(--k);
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
