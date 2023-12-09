//Write a Java program to create a class called "Library" with a collection of books and methods to add and remove boooks

import java.util.Scanner;

class Library {
    private String book[] = new String[100];

    public Library(String books[]) {

        for (int i = 0; i < books.length; i++)
            book[i] = books[i];
    }

    public void add(String addbook) {
        for (int i = 0; i < book.length; i++)
            if (book[i] == null) {
                book[i] = addbook;
                break;
            }
    }

    public void remove(String removebook) {
        int k = 0;
        for (int i = 0; i < book.length; i++) {
            if (book[i] != removebook) {
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
        books[0] = "Physics ";
        books[1] = " Chemistry ";
        books[2] = "Maths";
        Library obj = new Library(books);
        // System.out.println("Collection of books");
        obj.print();
        obj.add("shrimathbhagwat");
        System.out.println("After adding new  book in syllabus ");
        obj.print();
        obj.remove("Maths");
        System.out.println("After removing book from syllabus ");
        obj.print();

    }
}