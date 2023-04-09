package MovieDataBase;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


/*
Question:
You are given a dataset containing information about movies, including their title, release year, genre, and rating. You need to implement a Java class called "MovieDatabase" that can efficiently store and retrieve movie information based on the movie title. The class should have the following methods:

void addMovie(String title, int releaseYear, String genre, double rating):
Adds a movie to the database with the given title, release year, genre, and rating.


void removeMovie(String title):
Removes a movie from the database based on its title.


double getAverageRating(String genre):
Returns the average rating of all movies in the database with the given genre.


int getLatestReleaseYear():
Returns the latest release year among all movies in the database.

void updateRating(String title, double rating):
Updates the rating of a movie in the database based on its title.

You need to choose an appropriate complex data structure to efficiently implement the MovieDatabase class and its methods.
Explain your choice of data structure and provide the Java implementation for the MovieDatabase class.
 */

public class MovieDatabase {

    private String title;
    private int releaseYear;
    private String genre;
    private double rating;

    private final HashMap<String, Movie> database = new HashMap<>();


    public void addMovie(String tile, String genre, int releaseYear, double rating) {

        Movie newMovie = new Movie(genre, releaseYear, rating);
        database.put(title, newMovie);
    }

    public void removeTitle(String title) {
        database.remove(title);

    }

    public Integer getLatestReleaseYear() {
        Collection<Movie> values = database.values();

        List<Integer> releaseList = values.stream().map(Movie::getReleaseYear).collect(Collectors.toList());

        return releaseList.stream()
                .max(Integer::compareTo)
                .orElse(null);
    }

    public void updateRating(String title, double rating) {
        Movie movie = database.get(title);
        Movie newMovie = new Movie(movie.getGenre(), movie.getReleaseYear(), rating);
        database.replace(title, movie, newMovie);
    }

}
