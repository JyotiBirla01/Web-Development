/*
10. Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods
to add and remove courses. */

import java.util.Scanner;

class Student {
    private String name, grade;
//private String courses[]= new String[]
    public Student(String name, String grade, String courses[]) {
        this.name = name;
        this.grade = grade;
       // this.courses[] = courses[];

    }

    public void addCourse(String courses[]) {
        for (int i = 0; i < courses.length; i++) {

            
        }

    }

}

class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the library: ");
        int capacity = scanner.nextInt();
        Library library = new Library(capacity);

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the ISBN: ");
                    String isbn = scanner.nextLine();
                    Book newBook = new Book(title, author, isbn);
                    library.addBook(newBook);
                    break;
                case 2:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the ISBN of the book to remove: ");
                    String removeIsbn = scanner.nextLine();
                    library.removeBook(removeIsbn);
                    break;
                case 3:
                    scanner.close();
                    System.out.println("End !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}