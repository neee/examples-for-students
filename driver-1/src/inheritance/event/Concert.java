package inheritance.event;

import java.time.LocalDate;

/**
 * @author Sergey Serdyuk (serdyuksa)
 */
public class Concert extends Event {

    private String mainPerson;

    private String band;

    public Concert(LocalDate date, String title, double price) {
        super(date, title, price);
    }

    public Concert(LocalDate date, String title, double price, String mainPerson, String band) {
        this(date, title, price);
        this.mainPerson = mainPerson;
        this.band = band;
    }

    public String getMainPerson() {
        return mainPerson;
    }

    public void setMainPerson(String mainPerson) {
        this.mainPerson = mainPerson;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 10;
    }
}

