package inheritance.event;

import java.time.LocalDate;

/**
 * @author Sergey Serdyuk (serdyuksa)
 */
public class Movie extends Event {

    private String originalTitle;

    private String country;

    private int year;

    public Movie(LocalDate date, String title, double price) {
        super(date, title, price);
    }

    public Movie(LocalDate date, String title, double price, String originalTitle, String country, int year) {
        this(date, title, price);
        this.originalTitle = originalTitle;
        this.country = country;
        this.year = year;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String getTitle() {
        return super.getTitle() + " "  + this.year +  " " + this.country;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.2;
    }
}
