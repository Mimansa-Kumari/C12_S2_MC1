package org.example;

import org.example.configuration.AppConfig;
import org.example.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie1 = applicationContext.getBean("bean1",Movie.class);
        System.out.println(movie1);
        System.out.println();
        Movie movie2 = applicationContext.getBean("bean2",Movie.class);
        System.out.println(movie2);
    }
}
