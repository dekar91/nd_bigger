package com.dekar;

import java.util.Random;

public class JokeTelling {

    private String[] jokes = {"Some people, when confronted with a problem, think, 'I know, I'll use threads' - and then two they have two poblems.",
            "Q: How many prolog programmers does it take to change a lightbulb? A: Yes.",
            "A programmer is told to \"go to hell\", he finds the worst part of that statement is the 'go to'",
            "Why do Java developers wear glasses? Because they can't C#"};

    private Random random;

    public JokeTelling() {
        random = new Random();
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
