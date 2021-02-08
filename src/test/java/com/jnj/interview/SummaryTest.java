package com.jnj.interview;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SummaryTest {

    private User marco = User.builder().name("Marco").build();

    private User jeff = User.builder().name("Jeff").build();

    private User kenny = User.builder().name("Kenny").build();

    private User kristof = User.builder().name("Kristof").build();

    private Movie titanic = Movie.builder()
            .title("Titanic")
            .likedBy(Set.of(marco, kenny, kristof))
            .build();

    private Movie infinityWars = Movie.builder()
            .title("Infinity Wars")
            .likedBy(Set.of(jeff, kenny))
            .build();

    private Movie badIntentions = Movie.builder()
            .title("Bad Intentions")
            .likedBy(Set.of(jeff, kristof))
            .build();

    private Set<User> users = Set.of(marco, jeff, kenny, kristof);

    private Set<Movie> movies = Set.of(titanic, infinityWars, badIntentions);

    @Test
    public void whoLikedTitanicAndBadIntentionsShouldReturnCorrectSummary() {
        Assertions.assertThat(whoLiked(titanic).getUserNames())
                .containsOnlyOnceElementsOf(Stream.of(marco, kenny, kristof).map(User::getName).collect(Collectors.toSet()));
    }

    private MovieSummary whoLiked(Movie movie) {
        return MovieSummary.builder()
                // TODO
                .build();
    }
}
