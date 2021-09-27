package com.example.moviefacts.services;

import com.example.moviefacts.models.Movie;
import com.example.moviefacts.repositories.MovieDataRepository;

import java.util.List;
import java.util.Random;

public class MovieService {

    public static Movie getFirst() {
        return MovieDataRepository.getInstance().getMovies().get(0);
    }

    public static Movie getRandom() {
        List<Movie> movies = MovieDataRepository.getInstance().getMovies();
        Random random = new Random();
        int index = random.nextInt(movies.size()-1);
        return movies.get(index);
    }

}
