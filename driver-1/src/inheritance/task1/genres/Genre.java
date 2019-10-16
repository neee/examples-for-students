package inheritance.task1.genres;

public class Genre {

    private String attribute;

    public Genre(String attribute) {
        this.attribute = attribute;
    }

    public String getAttributeOfGenre() {
        return attribute;
    }

    public String getGenreName() {
        return "Жанр не указан";
    }
}
