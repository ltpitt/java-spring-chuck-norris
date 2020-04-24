package it.davidenastri.javaspringchucknorris.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

// Commented to enable XML configuration
//@Configuration
public class JokeConfiguration {

    // Commented to enable XML configuration
    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }

}
