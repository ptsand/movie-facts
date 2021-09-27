package com.example.moviefacts.services;

import com.example.moviefacts.models.Movie;
import com.example.moviefacts.repositories.MovieDataRepository;

import java.util.*;

public class MovieService {

    public Movie getFirst() {
        return MovieDataRepository.getInstance().getMovies().get(0);
    }

    public Movie getRandom() {
        List<Movie> movies = MovieDataRepository.getInstance().getMovies();
        int index = new Random().nextInt(movies.size()-1);
        return movies.get(index);
    }

    public List<Movie> getTenSortByPopularity() {
        List<Movie> movies = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            movies.add(getRandom());
        }
        Collections.sort(movies);
        return movies;
    }

}
