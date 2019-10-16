package inheritance.book;

/**
 * @author Sergey Serdyuk (serdyuksa)
 */
public class CookBook extends Book {

    String type;

    String chiefName;

    String chiefSurname;

    public CookBook(String type, String chiefName, String chiefSurname, int size, String author, int year) {
        super(size, author, year);
        this.type = type;
        this.chiefName = chiefName;
        this.chiefSurname = chiefSurname;
    }

    public String getInfo() {
        int value = super.getSize();
        return type + chiefName + chiefSurname + super.getSize();
    }
}
