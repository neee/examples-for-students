package inheritance.book;

/**
 * @author Sergey Serdyuk (serdyuksa)
 */
public class Book {

    //todo: ProfessionalBook, CookBook (specialization, diff display)

    private int size;

    private int year;

    private String author;

    public Book(int size, String author, int year) {
        this.size = size;
        this.author = author;
        this.year = year;
    }

    final protected int getSize() {
        System.out.println("вызван метод get size");
        return size;
    }

    private int getYear() {
        return year;
    }

    private String getAuthor() {
        return author;
    }
}
