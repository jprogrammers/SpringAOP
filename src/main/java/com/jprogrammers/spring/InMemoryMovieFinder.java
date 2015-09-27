package com.jprogrammers.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alireza on 9/20/15.
 */
@Component
public class InMemoryMovieFinder implements Finder{

    //changes for testing jenkins!
    List<Movie> movies;

    public InMemoryMovieFinder() {
        movies = new ArrayList<Movie>();

        movies.add(new Movie("Saving Private Ryan" , "Steven Spielberg"));
        movies.add(new Movie("The Wolf of Wall Street" , "Martin Scorsese"));
        movies.add(new Movie("Blade Runner" , "Ridley Scott"));
        movies.add(new Movie("Face/Off" , "John Woo"));
        movies.add(new Movie("The Dark Knight" , "Christopher Nolan"));
        movies.add(new Movie("Spirited Away" , "Hayao Miyazaki"));
        movies.add(new Movie("The Lord of the Rings: The Fellowship of the Ring" , "Peter Jackson"));
        movies.add(new Movie("Aliens" , "James Cameron"));
        movies.add(new Movie("The Matrix" , "Lana Wachowski"));
    }


    @Override
    public List<Movie> findAll() {
        return movies;
    }
}
