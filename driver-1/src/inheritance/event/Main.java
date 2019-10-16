package inheritance.event;

import java.time.LocalDate;

/**
 * @author Sergey Serdyuk (serdyuksa)
 */
public class Main {

    public static void main(String[] args) {
        Movie movie = new Movie(LocalDate.now(),"-", 10d, "Strangers", "USA", 2010);
        Concert concert = new Concert(LocalDate.now(), "Тату в Москве", 20d, "Тату", "Тату");

        Event [] events = {movie, concert};
        for (Event event : events) {
            System.out.println(event.getTitle());
            System.out.println(event.getDate());
            System.out.println("-------");
        }
    }
}
