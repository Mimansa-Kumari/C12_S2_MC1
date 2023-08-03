package org.example.domain;

public class Movie {
    int movieId;
    char grade;
    String movieName;
    int ratingOutOfTen;

    public Movie() { }

    public Movie(int movieId, char grade, String movieName, int ratingOutOfTen) {
        this.movieId = movieId;
        this.grade = grade;
        this.movieName = movieName;
        this.ratingOutOfTen = ratingOutOfTen;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getRatingOutOfTen() {
        return ratingOutOfTen;
    }

    public void setRatingOutOfTen(int ratingOutOfTen) {
        this.ratingOutOfTen = ratingOutOfTen;
    }

    @Override
    public String toString() {
        return "Movie Id : "+getMovieId()+"\n"+
                "Movie Name : "+getMovieName()+"\n"+
                "Movie Grade : "+getGrade()+"\n"+
                "Movie Rating : "+getRatingOutOfTen();
    }
}
