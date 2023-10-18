public class GetterSetter {
    private String name;
    private int rollNumber;

    public String getName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public int getrollNumber() {
        return rollNumber;
    }

    public void SetrollNumberr(int rollNumber) {
        if (rollNumber <= 0) {
            throw new IllegalArgumentException("Invalide data ");
        }
        this.rollNumber = rollNumber;
    }

    public void display() {
        System.out.println(this.name);
        System.out.println(this.rollNumber);

        class Main {
            public static void main(String args[]) {
                GetterSetter gs = new GetterSetter();
                gs.SetName("ABC");
                gs.SetrollNumberr(22);
            }
        }
    }
}