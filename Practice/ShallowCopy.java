class ShallowCopy {
    int x;
    int y;

    public void display() {
        System.out.println(x + "  " + y);
    }

    public static void main(String[] args) {
        ShallowCopy obj = new ShallowCopy();
        obj.x = 10;
        obj.y = 20;
        ShallowCopy obj1 = obj;
        obj.display();
        obj1.display();

    }
}