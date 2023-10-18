//Q 03.WAP using parameterized constructor with two parameters id and name. While creating the objects obj1 and obj2
// passed two arguments so that this constructor gets invoked after creation of obj1 and obj2 
class Ass3 {

    Ass3(int id, String name) {
        System.out.println(id);
        System.out.println(name);

    }

    public static void main(String[] args) {
        Ass3 a = new Ass3(101, "Ram");
        Ass3 b= new Ass3(102,"Shyam");
    }

}