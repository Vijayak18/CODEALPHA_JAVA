import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean checkedOut;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void checkIn() {
        checkedOut = false;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Checked Out: " + checkedOut;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        System.out.println("Library Catalog:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void checkOutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isCheckedOut()) {
                book.checkOut();
                System.out.println("You have successfully checked out: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found or already checked out.");
    }

    public void checkInBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isCheckedOut()) {
                book.checkIn();
                System.out.println("You have successfully checked in: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found or not checked out.");
    }
}

class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Add some initial books to the library
        library.addBook(new Book("Book 1", "Author 1"));
        library.addBook(new Book("Book 2", "Author 2"));
        library.addBook(new Book("Book 3", "Author 3"));

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. List Books");
            System.out.println("2. Check Out a Book");
            System.out.println("3. Check In a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    library.listBooks();
                    break;
                case 2:
                    System.out.print("Enter the title of the book you want to check out: ");
                    String checkOutTitle = scanner.nextLine();
                    library.checkOutBook(checkOutTitle);
                    break;
                case 3:
                    System.out.print("Enter the title of the book you want to check in: ");
                    String checkInTitle = scanner.nextLine();
                    library.checkInBook(checkInTitle);
                    break;
                case 4:
                    System.out.println("Exiting the Library Management System.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
