interface I {
    int A = 10;
    int B = 20;
}

class Main {
    public static void main(String[] args) {
        System.out.println(I.A + I.B);
        System.out.println(I.A - I.B);
        System.out.println(I.A * I.B);
        if (I.A > I.B)
            System.out.println(I.A);
        else
            System.out.println(I.B);

    }

}