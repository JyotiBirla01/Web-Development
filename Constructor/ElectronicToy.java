class ElectronicToy {
    int modelNo;

    Toy toy;

    ElectronicToy(int modelNo, Toy toy) {

        this.modelNo = modelNo;
        // this.toyref = toyref;
        this.toy = toy;
    }

    void printAll() {
        System.out.println("Model No  " + modelNo);
        toy.display();
        Toy.staticdisplay();
    }
}