class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

}

class Main {
    public static void main(String[] args) {
        Person obj = new Person("jyoti ", 21);

    }
}