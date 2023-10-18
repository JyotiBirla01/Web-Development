public class ICICI {
    private int bal = 10000;

    public void balanceEnquiary() {
        System.out.println(" Your Balance " + bal);
    }

    public void deposite(int amount) {
        bal = bal + amount;
        System.out.println("Total balance " + bal);
    }

    public void withDraw(int amount) {
        if (amount > bal) {
            System.out.println("Insufficinet balance " + amount);
        } else {
            System.out.println("Succesful " + amount);
        }
    }

}

class TestMain {
    public static void main(String[] args) {

        ICICI ram = new ICICI();
        ram.balanceEnquiary();
        ram.deposite(5000);
        ram.withDraw(5000);
    }

}
