package inheritance.task1.genres.content;

import inheritance.task1.genres.GenreEnum;

public class FantasticGenre extends GenreByContent {

    public FantasticGenre() {
        super("Жанр фантастика");
    }

    @Override
    public String getGenreName() {
        return GenreEnum.FANTASTIC.toString();
    }
}
