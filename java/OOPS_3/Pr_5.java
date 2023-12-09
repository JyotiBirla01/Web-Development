
/*5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods
 to add and remove books from a collection. */
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

class Library {
    private Book[] books;
    private int numberOfBooks;

    public Library(int capacity) {
        books = new Book[capacity];
        numberOfBooks = 0;
    }

    public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks] = book;
            numberOfBooks++;
            System.out.println("Book added to the library.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(String isbn) {
        boolean found = false;
        for (int i = 0; i < numberOfBooks; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                found = true;
                // Shift the remaining books to fill the gap
                for (int j = i; j < numberOfBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[numberOfBooks - 1] = null; // Remove the last reference
                numberOfBooks--;
                System.out.println("Book removed from the library.");
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ISBN " + isbn + " not found in the library.");
        }
    }

    public void display() {
        System.out.println("\n\n---------------------Books in the library --------------------------------");
        for (int i = 0; i < numberOfBooks; i++) {
            //System.out.println(books[i]);
            Book book= books[i];
            System.out.println("Title :" + book.getTitle());
            System.out.println(" Author : "+ book.getAuthor());
            System.out.println( " ISBN : "+ book.getIsbn());
        }
    }

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
                    library.display();
                    break;
                case 2:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the ISBN of the book to remove: ");
                    String removeIsbn = scanner.nextLine();
                    library.removeBook(removeIsbn);
                    library.display();
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