package inheritance.task1.genres;

import inheritance.task1.Book;

public class BookFilterService {

    public static void filter(Book[] books, Genre filterGenre) {
        for(Book book : books) {
            for (Genre genre : book.getGenres()) {
                if (filterGenre.getGenreName().equals(genre.getGenreName())) {
                    System.out.println("Жанр: " + filterGenre.toString() + " Название книги" + book.getTitle());
                }
            }
        }
    }
}
