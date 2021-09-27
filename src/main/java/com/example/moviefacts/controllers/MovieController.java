package com.example.moviefacts.controllers;


import com.example.moviefacts.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/")
    public String index() {
        return "Welcome";
    }

    @GetMapping("/getFirst")
    public String getFirst() {
        return MovieService.getFirst().toString();
    }

    @GetMapping("/getRandom")
    public String getRandom() {
        return "Welcome";
    }

    @GetMapping("/getTenSortByPopularityThis")
    public String getTenSortByPopularityThis() {
        return "Welcome";
    }

    @GetMapping("/howManyWonAnAwardThis")
    public String howManyWonAnAwardThis() {
        return "Welcome";
    }

}
