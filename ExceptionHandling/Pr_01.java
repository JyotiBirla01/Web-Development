import java.util.Scanner;

class IBE extends Exception {
    public IBE() {
        // System.out.println("llll");
        super(" insufficient balance exception");
        System.out.println("Hello");// age piche ho skta he sir ne bola
    }
}

class ICICI {
    public void withdrowwal(int amount) throws IBE {
        if (amount > 10000)
            throw new IBE();
        System.out.println("withrowal succes");
    }
}

class Main {
    public static void main(String[] args) {
        try {
            ICICI obj = new ICICI();
            obj.withdrowwal(1000000);
        } catch (Exception E) {
            System.out.println("ecption");
        }
    }
}
