package com.url.shortener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UrlShortenerSbApplication {
    public static void main(String[] args) {
        // Dotenv dotenv = Dotenv.configure()
        // .directory("/app") // Correct directory path inside Docker container
        // .filename(".env.prod")
        // .load();

        // System.setProperty("DATABASE_URL", dotenv.get("DATABASE_URL"));
        // System.setProperty("DATABASE_USERNAME", dotenv.get("DATABASE_USERNAME"));
        // System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));
        // System.setProperty("DATABASE_DIALECT", dotenv.get("DATABASE_DIALECT"));
        // System.setProperty("JWT_SECRET", dotenv.get("JWT_SECRET"));
        // System.setProperty("FRONTEND_URL", dotenv.get("FRONTEND_URL"));

        System.setProperty("DATABASE_URL", System.getenv("DATABASE_URL"));
        System.setProperty("DATABASE_USERNAME", System.getenv("DATABASE_USERNAME"));
        System.setProperty("DATABASE_PASSWORD", System.getenv("DATABASE_PASSWORD"));
        System.setProperty("DATABASE_DIALECT", System.getenv("DATABASE_DIALECT"));
        System.setProperty("JWT_SECRET", System.getenv("JWT_SECRET"));
        System.setProperty("FRONTEND_URL", System.getenv("FRONTEND_URL"));

        SpringApplication.run(UrlShortenerSbApplication.class, args);

        SpringApplication.run(UrlShortenerSbApplication.class, args);
    }
}
