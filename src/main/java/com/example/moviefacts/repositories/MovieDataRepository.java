package com.example.moviefacts.repositories;

import com.example.moviefacts.models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieDataRepository {

    private static MovieDataRepository instance;

    private List<Movie> movies;

    public static MovieDataRepository getInstance(){
        if(instance == null){
            instance = new MovieDataRepository();
        }
        return instance;
    }

    public List<Movie> getMovies() {
        if (this.movies == null) this.setMovies(parseCSV());
        return this.movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    private List<Movie> parseCSV() {
        List<Movie> movies = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("resources/imdb-data.csv"));
            // skip Year;Length;Title;Subject;Popularity;Awards
            if(scanner.hasNextLine()) scanner.nextLine();
            while (scanner.hasNextLine()) {
                Scanner rowScanner = new Scanner(scanner.nextLine());
                rowScanner.useDelimiter(";");
                int year = Integer.parseInt(rowScanner.next());
                int length = Integer.parseInt(rowScanner.next());
                String title = rowScanner.next();
                String subject = rowScanner.next();
                int popularity = Integer.parseInt(rowScanner.next());
                boolean awards = rowScanner.next().equalsIgnoreCase("Yes");
                Movie movie = new Movie(year, length, title, subject, popularity, awards);
                movies.add(movie);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return movies;
    }

}
