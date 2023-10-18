 import java.util.Scanner;
 class CommandLineArguments {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // if (args.length == 0) {
        //     System.out.println("No command-line arguments provided.");
        // } else {
        //     System.out.println("Command-line arguments provided:");
        //     for (String arg : args) {
        //         System.out.println(arg);
        //     }

        // }
        // for (int i = 0; i < args.length; i++) {
        //     args[i]=sc.nextLine();
        // }
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
