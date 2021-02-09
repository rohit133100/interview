package com.jnj.interview;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SummaryTest {

    private Movie titanic = Movie.builder()
            .title("Titanic")
            .build();

    private Movie infinityWars = Movie.builder()
            .title("Infinity Wars")
            .build();

    private Movie badIntentions = Movie.builder()
            .title("Bad Intentions")
            .build();

    private User marco = User.builder()
            .name("Marco")
            .liked(Set.of(titanic, infinityWars))
            .build();

    private User jeff = User.builder()
            .name("Jeff")
            .liked(Set.of(infinityWars, badIntentions))
            .build();

    private User kenny = User.builder()
            .name("Kenny")
            .liked(Set.of(titanic, badIntentions))
            .build();

    private User kristof = User.builder()
            .name("Kristof")
            .liked(Set.of(infinityWars))
            .build();

    private Set<User> users = Set.of(marco, jeff, kenny, kristof);

    private Set<Movie> movies = Set.of(titanic, infinityWars, badIntentions);

    @Test
    public void theBestMovieIsInfinityWars() {
        Assertions.assertThat(bestMovie()).hasValue(infinityWars);
    }

    private Optional<Movie> bestMovie() {
        return Optional.empty();
    }
}
