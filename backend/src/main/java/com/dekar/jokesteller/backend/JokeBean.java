package com.dekar.jokesteller.backend;

import com.dekar.JokeTelling;

/**
 * The object model for the data we are sending through endpoints
 */
public class JokeBean {

    private JokeTelling jokeTelling;

    public JokeBean() {
        jokeTelling = new JokeTelling();
    }

    public String getJoke() {
        return jokeTelling.getRandomJoke();
    }
}