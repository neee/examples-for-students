package inheritance.event;

import java.time.LocalDate;

/**
 * @author Sergey Serdyuk (serdyuksa)
 */
public class Event {

    private final LocalDate date;

    private final String title;

    private double price;

    public Event(LocalDate date, String title, double price) {
        this.date = date;
        this.title = title;
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
