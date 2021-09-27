package com.example.moviefacts.services;

import com.example.moviefacts.models.Movie;
import com.example.moviefacts.repositories.MovieDataRepository;

public class MovieService {

    public static Movie getFirst() {
        return MovieDataRepository.getInstance().getMovies().get(0);
    }

}
