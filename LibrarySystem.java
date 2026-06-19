class LibraryItem {
    private String title;
    private String author;
    private int id;

    public LibraryItem(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public void getInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ID: " + id);
    }
}

class Book extends LibraryItem {
    private int pages;

    public Book(String title, String author, int id, int pages) {
        super(title, author, id);
        this.pages = pages;
    }

    @Override
    public void getInfo() {
        System.out.println("Book: " + getTitle() + ", Author: " + getAuthor() + ", ID: " + getId() + ", Pages: " + pages);
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, int id, int issueNumber) {
        super(title, author, id);
        this.issueNumber = issueNumber;
    }

    @Override
    public void getInfo() {
        System.out.println("Magazine: " + getTitle() + ", Author: " + getAuthor() + ", ID: " + getId() + ", Issue No: " + issueNumber);
    }
}

class Newspaper extends LibraryItem {
    private String publicationFrequency;

    public Newspaper(String title, String author, int id, String publicationFrequency) {
        super(title, author, id);
        this.publicationFrequency = publicationFrequency;
    }

    @Override
    public void getInfo() {
        System.out.println("Newspaper: " + getTitle() + ", Author: " + getAuthor() + ", ID: " + getId() + ", Frequency: " + publicationFrequency);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] catalog = {
            new Book("Java Basics", "James Gosling", 101, 300),
            new Magazine("Tech Monthly", "Editor Team", 102, 12),
            new Newspaper("Daily News", "News Group", 103, "Daily")
        };

        for (LibraryItem item : catalog) {
            item.getInfo();
        }
    }
}