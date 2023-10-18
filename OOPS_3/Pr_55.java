/* Write a Java program to create a class called "Book" with attributes
 for title, author, and ISBN, and methods to add and remove books from a collection.
 */

import java.util.Scanner;

 class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public Book() {

    }

    public void setTitle(String title) {
        this.title = title;

    }

    public void setAuthor(String author) {
        this.author = author;

    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;

    }

    public String getAuthor() {
        return this.author;

    }

    public String getISBN() {
        return this.ISBN;

    }

    public String getTitle() {
        return this.title;
    }

}

class MainBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size of the array : ");
        int n = sc.nextInt();
        Book book[] = new Book[n];
        System.out.println("Enter the number of books : ");
        int num = sc.nextInt();
        String title, author, ISBN;
        for (int i = 0; i < num; i++) {
            System.out.println("Enter title for " + i + "book");
            title = sc.next();
            System.out.println("Enter author for " + i + "book");
            author = sc.next();
            System.out.println("Enter ISBN for " + i + "book");
            ISBN = sc.next();
            book[i] = new Book(title, author, ISBN);
        }
        boolean flag = true;
        while (true) {
            System.out.println("\nEnter 1 to remove book form the collection ");
            System.out.println("Enter 2 to add Book to the collection");
            System.out.println("Enter 3 to exit : ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter the  number of Books to be removed(int ) : ");
                    int rembook = sc.nextInt();
                    Book rembookArr[] = new Book[rembook];
                    for (int i = 0; i < rembook; i++) {
                        System.out.println("Enter the detail of " + i + " book to remove ");
                        title = sc.next();
                        author = sc.next();
                        ISBN = sc.next();
                        rembookArr[i] = new Book(title, author, ISBN);
                    }
                    for (int i = 0, j = 0; i < num; i++) {
                        if (book[i].getTitle().equalsIgnoreCase(rembookArr[j].getTitle())
                                && book[i].getAuthor().equalsIgnoreCase(rembookArr[j].getAuthor())
                                && book[i].getISBN().equalsIgnoreCase(rembookArr[j].getISBN())) {
                            for (int j2 = i; j2 < num; j2++) {
                                book[i] = book[i + 1];
                            }
                            j++;
                        }
                    }
                    num -= rembookArr.length;
                    System.out.println("The required Book collection is (After remove : )");
                    for (int i = 0; i < num; i++) {
                        System.out.println(book[i].getTitle() + "          ");
                        System.out.print(book[i].getAuthor() + "          ");
                        System.out.print(book[i].getISBN() + "           ");
                    }
                    break;
                case 2:
                    System.out.println("Enter the  number of Books to be add (int): ");
                    int addbook = sc.nextInt();
                    Book addbookArr[] = new Book[addbook];
                    for (int i = 0; i < addbook; i++) {
                        System.out.println("Enter the detail of " + i + " book to add ");
                        title = sc.next();
                        author = sc.next();
                        ISBN = sc.next();
                        addbookArr[i] = new Book(title, author, ISBN);
                    }
                    for (int i = num, j = 0; i < (num + addbookArr.length); i++) {
                        book[i] = addbookArr[j];
                        j++;
                    }
                    num += addbookArr.length;
                    System.out.println("The required Book collection is (After Adding  : )");
                    for (int i = 0; i < book.length; i++) {
                        System.out.println(book[i].getTitle() + "          ");
                        System.out.print(book[i].getAuthor() + "          ");
                        System.out.print(book[i].getISBN() + "           ");
                    }
                    break;
                case 3:
                    flag = false;
                    break;
            }
 }
}
}