package library.service;

import java.util.ArrayList;
import java.util.List;
import library.model.Lendable;
// L'import de "library.model.*" n'est plus nécessaire,
// on ne dépend que de l'interface Lendable.

public class Library {
    private List<Lendable> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Lendable item) {
        items.add(item);
    }

    public void removeItem(Lendable item) {
        items.remove(item);
    }

    /**
     * Renvoie les items qui ne sont pas actuellement empruntés.
     * Cette méthode utilise la méthode isBorrowed() de l'interface.
     */
    public List<Lendable> getAvailableItems() {
        List<Lendable> availableItems = new ArrayList<>();
        for (Lendable item : items) {
            if (!item.isBorrowed()) {
                availableItems.add(item);
            }
        }
        return availableItems;
    }

    /**
     * Affiche les détails de tous les items.
     * N'utilise plus "instanceof" et ne dépend plus de la classe Book.
     * Le Couplage (CBO) est réduit.
     */
    public void listAllItems() {
        System.out.println("--- All Items in Library ---");
        for (Lendable item : items) {
            // Appelle la méthode getDetails() définie dans l'interface
            System.out.println("- " + item.getDetails());
        }
    }
}
