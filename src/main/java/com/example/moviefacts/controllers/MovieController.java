package com.example.moviefacts.controllers;

import com.example.moviefacts.models.Movie;
import com.example.moviefacts.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    MovieService service = new MovieService();

    @GetMapping("/")
    public String index() {
        return "Welcome";
    }

    @GetMapping("/getFirst")
    public String getFirst() {
        return service.getFirst().toString();
    }

    @GetMapping("/getRandom")
    public String getRandom() {
        return service.getRandom().toString();
    }

    @GetMapping("/getTenSortByPopularity")
    public String getTenSortByPopularity() {
        return service.getTenSortByPopularity().toString();
    }

    @GetMapping("/howManyWonAnAward")
    public String howManyWonAnAward() {
        return "Welcome";
    }

}
