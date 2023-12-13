
//     1 
//    2 1
//   3 2 1
//  4 3 2 1
// 5 4 3 2 1

//     1
//    21
//   321
//  4321
// 54321

public class p4 {
   public static void main(String[] args) {
  
//     for(int i=1; i<=5; i++){
    
//           int k=i;
//         for( int j=1; j<=5; j++){
//             if(j<5-i)
// System.out.print(" ");
// else
// System.out.print(k);
// k--;
//         }
//         System.out.println();
//     }
for(int i =1; i<=5; i++){
    for(int j=1; j<=5-i; j++){
        System.out.print(" ");

    }
    for(int k=i; k>=1;k--){
        System.out.print(k+" ");

    }
    System.out.println();
}
   } 
}
