package inheritance.task1;

import inheritance.task1.genres.BookFilterService;
import inheritance.task1.genres.Genre;
import inheritance.task1.genres.content.FantasticGenre;
import inheritance.task1.genres.form.ProseGenre;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Властелин Колец", new Genre[]{new FantasticGenre()});
        Book book2 = new Book("Автостопом по галктике", new Genre[]{new FantasticGenre(), new ProseGenre()});

        BookFilterService.filter(new Book[]{book1, book2}, new FantasticGenre());
        System.out.println("---");
        BookFilterService.filter(new Book[]{book1, book2}, new ProseGenre());
    }
}
