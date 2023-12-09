
public class DeepCopy {
    int x;
    int y;

    public void display() {
        System.out.println(x + "   " + y);
    }

    public static void main(String[] args) {
        DeepCopy obj = new DeepCopy();
        obj.x = 10;
        obj.y = 20;
        DeepCopy obj1 = new DeepCopy();
        // obj1.x = obj.x;
        // obj1.y = obj.y;
        obj1.x = 30;
        obj1.y = 40;
        obj1.x = obj.x;
        obj1.y = obj.y;
        obj.display();
        obj1.display();
    }

}
