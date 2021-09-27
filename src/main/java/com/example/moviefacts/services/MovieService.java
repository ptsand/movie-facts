package com.example.moviefacts.services;
import com.example.moviefacts.models.Movie;
import com.example.moviefacts.repositories.MovieDataRepository;

import java.util.*;

public class MovieService {

    private List<Movie> movies = MovieDataRepository.getInstance().getMovies();

    public Movie getFirst() {
        return this.movies.get(0);
    }

    public Movie getRandom() {
        int index = new Random().nextInt(this.movies.size()-1);
        return this.movies.get(index);
    }

    public List<Movie> getTenSortByPopularity() {
        List<Movie> movies = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            movies.add(getRandom());
        }
        Collections.sort(movies);
        return movies;
    }

    public int howManyWonAnAward() {
        int count = 0;
        for (Movie m : this.movies) {
            if (m.isAwarded()) {
                count++;
            }
        }
        return count;
    }

}
