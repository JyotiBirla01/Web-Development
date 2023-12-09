class Name {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 4 || (i == 5 && j <= 4) || (i == 4 && j == 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
            for (int l = 1; l <= 25; l++) {
                for (int k = 1; k <= 6; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 5; j++) {
                    if ((l == j && l <= 3) || (l > 3 && l == 3) || (l + l == 6 && l <= 3))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
               
            
            for (int m = 1; m <= 5; m++) {
                for (int k = 1; k <= 11; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 5; j++) {
                    if (m == 1 || m == 5 || j == 1 || j == 5)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
              
            for (int n = 1; n <= 5; n++) {
                for (int k = 1; k <= 16; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 5; j++) {
                    if (n == 1 || n >= 1 && j == 3)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
               
            System.out.println();
            for (int o = 1; o <= 5; o++) {
                for (int k = 1; k <= 21; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 5; j++) {
                    if (o == 1 || o == 5 || o >= 1 && j == 3)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        
                  }      } 
                     }         }
