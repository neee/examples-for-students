package inheritance.task1.genres.form;

import inheritance.task1.genres.GenreEnum;

public class ProseGenre extends GenreByForm {

    public ProseGenre() {
        super("Жанр проза");
    }

    @Override
    public String getGenreName() {
        return GenreEnum.PROSE.toString();
    }
}
