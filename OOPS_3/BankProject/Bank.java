import java.util.Scanner;
import java.io.*; // we can also write console here
import java.util.Random;

class Bank {
    public static void main(String args[]) throws IOException {
        String reset = "\u001b[0m";
        String Red = "\u001b[31m";
        String Green = "\u001b[32m";
        String Yellow = "\u001b[33m";
        String Blue = "\u001b[34m";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mail-id");
        String mail = sc.nextLine();

        System.out.println("Enter your full name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        Random random = new Random();
        int number = random.nextInt(999999);

        System.out.println(reset
                + " what typ of account you want 1 -> for joint account \n 2 -> for saving account \n 3 -> for child account");
        int account = sc.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        switch (account) {
            case 1: {
                System.out.println(Blue + "*** you want to open joint account *");

                System.out.println(reset + "Enter your  name ");
                name = sc.nextLine();
                name = sc.nextLine();

                System.out.println("What your husband work");
                String work = sc.nextLine();
                System.out.println("Enter your  age ");
                age = sc.nextInt();
                System.out.println(
                        Yellow + "Enter ammount you want to be deposit minimum you have to enter 5000 rupee\\-");
                int ammount = sc.nextInt();
                if (ammount > 5000) {
                    System.out
                            .println(reset + "***your account is successfully generated*** \n you deposit " + ammount);
                    System.out.println("your account number is " + number);

                    System.out.println("what you want 1 -> for deposit /n 2 -> for withdraw");
                    int ans = sc.nextInt();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    switch (ans) {
                        case 1: {
                            System.out.println("Enter your password ");

                            Console Con = System.console();
                            char[] chars = Con.readPassword();
                            String Password = new String(chars);

                            if (Password.equals("vishu123")) {
                                System.out.println("*** entry successful.......");
                                System.out.println(Green + "How many rupees you want to deposit");
                                float deposite = sc.nextFloat();
                                System.out.println("****you depocit proccess is complete***** \n your name is " + name
                                        + "\n your account number is " + number + "\n you deposit " + deposite
                                        + "rupee in join account");
                                System.out.println("your total balance is " + (ammount + deposite));
                                System.exit(0);
                            }

                        }
                            break;
                        case 2: {
                            System.out.println("Enter your password ");

                            Console Con = System.console();
                            char[] chars = Con.readPassword();
                            String Password = new String(chars);

                            if (Password.equals("vishu123")) {
                                System.out.println("*** entry successful.......");
                                System.out.println("How many rupees you want to withdeaw");
                                float withdraw = sc.nextFloat();
                                if (withdraw <= ammount) {
                                    System.out
                                            .println(Blue + "****you depocit proccess is complete***** \n your name is "
                                                    + name + "\n your account number is " + number + "\n you withdraw "
                                                    + withdraw + "rupee in join account");
                                    System.out.println(Red + "your total balance is " + (ammount - withdraw));
                                    System.exit(0);
                                } else {
                                    System.out.println("not available");
                                }
                            }
                        }
                            break;
                    }
                } else if (ammount < 5000) {
                    System.out.println(Blue + "you can not able to make this account" + reset);
                }

            }
                break;

            case 2: {
                System.out.println(Blue + "***** you want to open saving account ****");
                System.out.println("Enter your nominee name");
                name = sc.nextLine();
                name = sc.nextLine();
                System.out.println(" Enter your age");
                age = sc.nextInt();
                System.out.println(
                        Yellow + "Enter ammount you want to be deposit minimum you have to enter 2000 rupee\\-");
                int ammount = sc.nextInt();
                if (ammount > 2000) {
                    System.out.println(Blue + "***** your account is successfully generated *** \n  you deposit "
                            + ammount + "you account number is " + account);

                    System.out.println("what you want 1 -> for deposit /n 2 -> for withdraw");
                    int ans = sc.nextInt();
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    switch (ans) {
                        case 1: {
                            System.out.println("Enter password ");
                            Console Con = System.console();
                            char[] chars = Con.readPassword();
                            String Password = new String(chars);

                            if (Password.equals("vishu123")) {
                                System.out.println(Green + "*** entry successful.......");
                                System.out.println("How many rupees you want to deposit");
                                float deposite = sc.nextFloat();
                                System.out.println(Blue + "****you depocit proccess is complete***** \n your name is "
                                        + name + "\n your account number is " + number + "\n you deposit " + deposite
                                        + "rupee in join account");
                                System.out.println("your total balance is " + (ammount + deposite));
                                System.exit(0);
                            }
                        }
                            break;
                        case 2: {
                            System.out.println("Enter your password ");

                            Console Con = System.console();
                            char[] chars = Con.readPassword();
                            String Password = new String(chars);

                            if (Password.equals("vishu123")) {
                                System.out.println("*** entry successful.......");
                                System.out.println("How many rupees you want to withdeaw");
                                float withdraw = sc.nextFloat();
                                if (withdraw <= ammount) {
                                    System.out
                                            .println(Blue + "****you depocit proccess is complete***** \n your name is "
                                                    + name + "\n your account number is " + number + "\n you withdraw "
                                                    + withdraw + "rupee in join account");
                                    System.out.println(Yellow + "your total balance is " + (ammount - withdraw));
                                    System.exit(0);
                                } else {
                                    System.out.println("not available" + reset);
                                }
                            }
                        }
                            break;
                    }
                } else if (ammount < 2000) {
                    System.out.println(Green + "you can not able to make this account" + reset);
                }

            }
                break;

            case 3: {
                System.out.println(Blue + "*** you want to open child account * ");
                System.out.println("Enter child name");
                name = sc.nextLine();
                name = sc.nextLine();
                System.out.println("Enter your father name/mother name");
                String f_name = sc.nextLine();
                String m_name = sc.nextLine();
                System.out.println("Enter your father age");
                int f_age = sc.nextInt();
                System.out.println(
                        Yellow + "Enter ammount you want to be deposit minimum you have to enter 1000 rupee\\-");
                int ammount = sc.nextInt();
                if (ammount > 1000) {
                    System.out.println(Green + " * your account is successfully generated * \n your account number is "
                            + number + " \n you deposit " + ammount);
                    // else if(ammount<1000)
                    // {
                    // System.out.println("you can not deposit this ammount");
                    // }}break;

                    System.out.println(Blue + "what you want 1 -> for deposit /n 2 -> for withdraw");
                    int ans = sc.nextInt();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    switch (ans) {
                        case 1: {
                            System.out.println("Enter your password ");

                            Console Con = System.console();
                            char[] chars = Con.readPassword();
                            String Password = new String(chars);

                            if (Password.equals("vishu123")) {
                                System.out.println(Green + "*** entry successful.......");
                                System.out.println("How many rupees you want to deposit");
                                float deposite = sc.nextFloat();
                                System.out.println(Blue + "****you depocit proccess is complete***** \n your name is "
                                        + name + "\n your account number is " + number + "\n you deposit " + deposite
                                        + "rupee in join account");
                                System.out.println(Yellow + "your total balance is " + (ammount + deposite));
                                System.exit(0);
                            }

                        }
                            break;
                        case 2: {
                            System.out.println("Enter your password ");

                            Console Con = System.console();
                            char[] chars = Con.readPassword();
                            String Password = new String(chars);

                            if (Password.equals("vishu123")) {
                                System.out.println(Blue + "*** entry successful.......");
                                System.out.println("How many rupees you want to withdeaw");
                                float withdraw = sc.nextFloat();
                                if (withdraw <= ammount) {
                                    System.out.println(
                                            Green + "****you depocit proccess is complete***** \n your name is " + name
                                                    + "\n your account number is " + number + "\n you withdraw "
                                                    + withdraw + "rupee in join account");
                                    System.out.println(Blue + "your total balance is " + (ammount - withdraw));
                                    System.exit(0);
                                } else {
                                    System.out.println("not available" + reset);
                                }
                            }
                        }
                            break;
                    }
                } else if (ammount < 1000) {
                    System.out.println(Blue + "you can not able to make this account" + reset);
                }

            }
                break;
            default:
                System.out.println(Blue + "not valid !" + reset);
                break;
        }
    }
}