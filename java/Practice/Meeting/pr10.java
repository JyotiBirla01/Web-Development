//         A
//       A B A
//     A B C B A
//   A B C D C B A
// A B C D E D C B A

class Test {
    public static void main(String[] args) {
        // for(int i=1; i<=5; i++){
        // for(int j=1; j<=5-i; j++){
        // System.out.print(" ");
        // }
        // for(int k=1; k<=i; k++){
        // System.out.print((char)(k+64)+" ");
        // }
        // for(int k=i-1; k>=1; k--){
        // System.out.print((char)(k+64)+" ");
        // }
        // System.out.println();
        // }

        // int p = 1;
        // int k = 0;
        // for (int i = 1; i <= 5; i++) {
        //     char a=64;
        //     for (int j = 1; j <= 5 - i; j++) {
        //         System.out.print(" ");
        //         for (int c = 1; c <= p; c++) {
        //             a = (c <= i) ? ++a : --a;
        //         }
        //         p += 2;
        //         System.out.println();
        //     }
        // }{

        for(int r=1; r<=5; r++){
            char a=64;
            for(int c=1; c<=9; c++){
                if(c>=(6-r) &&c<=(4+r)){
                    a=(c<=5)?++a :--a;
                    System.out.print(a+" ");
                }
            else
        System.out.print(" ");
    }
    System.out.println();
            }
        }
    }
