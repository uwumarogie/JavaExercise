package MovieDataBase;

public class Movie {
    private int releaseYear;
    private String genre;
    private double rating;

    // Constructor
    public Movie( String genre,int releaseYear, double rating) {
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
