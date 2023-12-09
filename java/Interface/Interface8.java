//can you local varoable inside exprestion in java ?

interface I {
    void m1();

}

class lamda2 {
    public static void main(String[] args) {
        int outside = 10; // local variable
        I obj = () -> {
            outside = 12;
            System.out.println(outside);
           
        };
        obj.m1();
    }
}