//Write a Java program to create a class called "Library" with a collection of books and methods to add and remove boooks

import java.util.Scanner;

class Library {
    private String book[] = new String[100];

    public Library(String books[]) {

        for (int i = 0; i < books.length; i++)
            book[i] = books[i];
    }

    public void add(String addBook[]) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                book[i] = addBook[i];
                break;
            }
           // System.out.println(addBook[i]);
        }
    }

    public void remove(String removeBook[]) {
        int k = 0;
        for (int i = 0; i < book.length; i++) {
            if (book[i] != removeBook[i]) {
                book[k] = book[i];
                k++;
            }

            else if (book[i] == null) {
                break;
            }
        }
    }

    public void print() {
        System.out.println("Books name : ");
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null)
                break;
            System.out.println(book[i]);
        }
        System.out.println();
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String books[] = new String[100];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the name of " + (i + 1) + " books");
            books[i] = sc.nextLine();
        }
        System.out.println("How many books you want to add  ");
        int add = sc.nextInt();
        String addBook[] = new String[add];
        for (int i = 0; i < add; i++) {
            System.out.println("Enter the name of " + (i + 1) + " add books ");
            addBook[i] = sc.next();
        }
        System.out.println("How many books you want to remove   ");
        int remove = sc.nextInt();
        String removeBook[] = new String[remove];
        for (int i = 0; i < remove; i++) {
            System.out.println("Enter the name of " + (i + 1) + " remove  books ");
            books[i] = sc.next();
        }

        Library obj = new Library(books);
        // System.out.println("Collection of books");
        obj.print();
        obj.add(addBook);
        System.out.println("After adding new  book in syllabus ");
        obj.print();
        obj.remove(removeBook);
        System.out.println("After removing book from syllabus ");
        obj.print();

    }
}