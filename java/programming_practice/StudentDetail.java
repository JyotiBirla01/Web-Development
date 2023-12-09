 import java.util.Scanner;
class Student {
    protected int stId,percetage ,phone;
    protected String stName;
    public Student(int stId,String stName,int percetage ,int phone){
        this.stId= stId;
        this.stName= stName;
        this.percetage= percetage;
        this.phone=phone;

    }
    public Student(){

    }
    public void display(){
        System.out.println(stId+"\t\t"+"\t\t"+stName+"\t\t"+percetage+"\t\t"+phone);
    }
}
class MainStudent extends Student{
public void sortStudet(Student obj[]){
    for (int i = 0; i < obj.length; i++) {
        for (int j = i+1; j < obj.length; j++) {
            if(obj[i].percetage>=obj[j].percetage){
                Student temp= obj[i];
                obj[i]=obj[j];
                obj[j]=temp;  
            }
        }
    }
  for (int i = 0; i < obj.length; i++) {
    obj[i].display();
    
}

}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student");
        int n= sc.nextInt();
        Student obj[] = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Student Id  ");
            int stId = sc.nextInt();
            System.out.println("Enter Student  name");
            String stName = sc.next();
            System.out.println("Enter the percentage ");
            int percentage = sc.nextInt();
            System.out.println("Enter the student phone number ");
            int phone = sc.nextInt();
            obj[i] = new Student(stId, stName, percentage, phone);
        }
        System.out.println("-------------------Employee  detail ---------------------------------");
System.out.println("stId\t\tstName\t\tpercentage\t\tphone ");

      
        MainStudent obj2 = new MainStudent();
        obj2.sortStudet(obj);
    }
}
    