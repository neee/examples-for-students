package inheritance.task1.genres.content;

import inheritance.task1.genres.GenreEnum;

public class DetectiveGenre extends GenreByContent {

    public DetectiveGenre() {
        super("Жанр детектив");
    }

    @Override
    public String getGenreName() {
        return GenreEnum.DETECTIVE.toString();
    }
}
