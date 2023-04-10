package MovieDataBase;

public class Movie {
    private final int releaseYear;
    private final String genre;
    private final double rating;

    // Constructor
    public Movie(String genre, int releaseYear, double rating) {
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.rating = rating;
    }

    // Getters
    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }
}
