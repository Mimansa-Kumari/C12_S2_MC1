package org.example.configuration;

import org.example.domain.Movie;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("bean1")
    public Movie method1 ()
    {
        return new Movie(11,'A',"DRISHYAM",9);
    }

    @Bean("bean2")
    public Movie method2 ()
    {
        Movie movie = new Movie();
        movie.setMovieId(22);
        movie.setMovieName("Jurassic Park");
        movie.setGrade('A');
        movie.setRatingOutOfTen(10);
        return movie;
    }
}
