package library.app;

import library.model.*;
import library.service.*;
import library.utils.DemoUtils; // Import de la nouvelle classe utilitaire

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        DigitalBook book3 = new DigitalBook("Digital Fortress", "Dan Brown", 5);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);

        library.listAllItems();

        // Appel à la méthode statique extraite
        DemoUtils.complexMethodExample(10);
    }
}