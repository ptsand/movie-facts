package com.example.moviefacts.models;

// POJO
public class Movie implements Comparable<Movie> {

    private int year, length;
    private String title, subject;
    private int popularity;
    private boolean isAwarded;

    public Movie(int year, int length, String title, String subject, int popularity, boolean isAwarded) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.isAwarded = isAwarded;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "year=" + year +
                ", length=" + length +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", popularity=" + popularity +
                ", isAwarded=" + isAwarded +
                '}' + "<br>";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public boolean isAwarded() {
        return isAwarded;
    }

    public void setIsAwarded(boolean isAwarded) {
        this.isAwarded = isAwarded;
    }

    @Override
    public int compareTo(Movie m) {
        if (this.popularity == m.popularity) return 0;
        else if (this.popularity < m.popularity) return 1;
        else return -1;
    }
}
