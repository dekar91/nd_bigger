package com.dekar;

import java.util.Random;

public class JokeTelling {

    private String[] jokes;
    private Random random;

    public JokeTelling() {
        jokes = new String[4];
        jokes[0] = "Some people, when confronted with a problem, think, 'I know, I'll use threads' - and then two they have two poblems.";
        jokes[1] = "Q: How many prolog programmers does it take to change a lightbulb? A: Yes.";
        jokes[2] = "A programmer is told to \"go to hell\", he finds the worst part of that statement is the 'go to'";
        jokes[3] = "Why do Java developers wear glasses? Because they can't C#";
        random = new Random();
    }

    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
