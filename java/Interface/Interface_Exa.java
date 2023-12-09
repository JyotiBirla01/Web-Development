interface Bank {
    float rateOfInterest();

}

class SBI implements Bank {
    public float rateOfInterest() {
        return 9.5f;
    }

}

class HDFC implements Bank {
    public float rateOfInterest() {
        return 5.5f;
    }
}

class Main {
    public static void main(String[] args) {
        Bank obj = new SBI();
        Bank obj1 = new HDFC();
        System.out.println(obj.rateOfInterest());
        System.out.println(obj1.rateOfInterest());

    }
}