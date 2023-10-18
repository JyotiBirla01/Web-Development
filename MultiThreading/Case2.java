

class Task {
    synchronized public void m1() {
        System.out.println(" m1 ");
    }

} 

class Thread1 {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("t1");

        }
    }
}

class Thread2 {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("t2");

        }
    }
}