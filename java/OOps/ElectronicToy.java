package OOps;

class ElectronicToy extends Toy {
    int modelNo = 0;
    String toy_ref = null;

    Toy toy = new Toy("car", 786, toy_ref);

    ElectronicToy(int modelNo, String toy_ref) {
        super("car", 600, "India");
        this.modelNo = modelNo;
        this.toy_ref = toy_ref;

    }

    void printAll() {
        System.out.println("Model No  " + modelNo);
        System.out.println("Toy ref  " + toy_ref);
        toy.display1();
        toy.staticdisplay();
    }
}