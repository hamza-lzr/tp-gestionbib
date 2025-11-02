package library.model;

public class DigitalBook extends Book {
    private int fileSizeMB;

    public DigitalBook(String title, String author, int fileSizeMB) {
        super(title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public int getFileSizeMB() {
        return fileSizeMB;
    }

    @Override
    public String getDetails() {
        // Appelle la méthode de la classe mère et ajoute ses propres infos
        return super.getDetails() + " [Digital, " + fileSizeMB + "MB]";
    }
}
