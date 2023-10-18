
/*Create a class phone number having  field the name,address and also containing nested class personal having field 
like relation and method like getinput() and putinput() take all necessary input for record .
a) Create  another nested static class business having field the organisation,dept,Mobile and method like accept and show.
b) Create another class  containg main function that ask employee choice.
c) If choice of user is  ask personal one ask personal record else take buisness entry and 
 * 
 */
// 1. Create a class Phonebook having felid like name, phone, address and also contains nested class personal having feild like realation
//  and method like getinput() and putiniput() take all neccessary input for the record 
//  a. Create another nested static class business having feild like organization, dept. mobile no, and method like accept and show
//  b. create another class containing main function that ask employee choice
//  c. if choice of user is one ask personal record else take the business entry and display them
import java.util.Scanner;

class PhoneBook {
    String name;
    int phone;
    String address;

    public PhoneBook(String name, int phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;

    }

    class Personal {
        String relation;

        public void putiniput(String relation) {
            this.relation = relation;
        }

        public void getinput() {

        }

        static class business {
            String Organisation;
            String dept;
            int mobile;

            public business() {
                this.Organisation = Organisation;
                this.dept = dept;
                this.mobile = mobile;
            }

            public void accept(int Organisation, int dept, int mobile) {

            }

            public void show() {
                System.out.println("Organisation name " + Organisation);
                System.out.println("Department " + dept);
                System.out.println("mobile " + mobile);

            }

        }
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the phone ");
        int phone = sc.nextInt();
        System.out.println("Enter the address");
        String address = sc.nextLine();
        System.out.println("Enter the department");
        String dept = sc.nextLine();
        System.out.println("Enter the mobile number ");
        int number = sc.nextInt();
        System.out.println("Enter the relation");
        String relation=sc.nextLine();
        PhoneBook obj= new PhoneBook(name, phone, address);
        PhoneBook.Personal obj1= obj.new Personal();
        PhoneBook.Personal.business obj2= obj.obj1.new buisness();

    }
}