
class Task {
    synchronized public void m1() {
        System.out.println(" m1 ");
    }
}

class First extends Thread {
    Task task;

    public First( Task task) {
        this.task = task;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("GM....");
            task.m1();

        }
    }
}

class Second extends Thread {
    Task task;

    public Second(Task task ) {
        this.task = task;

    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("GE....");
            task.m1();
        }
    }
}

class TestMain {
    public static void main(String args[]) {
        Task task = new Task();
        First t1 = new First(task);
        Second s1 = new Second(task);

        t1.start();
        s1.start();

    }
}