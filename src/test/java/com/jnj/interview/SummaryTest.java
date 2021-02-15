package com.jnj.interview;

import java.util.List;
import java.util.Set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SummaryTest {

    public static final String TITANIC = "Titanic";

    public static final String INFINITY_WARS = "Infinity Wars";

    public static final String BAD_INTENTIONS = "Bad Intentions";

    private final Set<Movie> movies = Set.of(
            Movie.builder()
                    .title(TITANIC)
                    .build(),
            Movie.builder()
                    .title(INFINITY_WARS)
                    .build(),
            Movie.builder()
                    .title(BAD_INTENTIONS)
                    .build()
    );

    private final Set<User> users = Set.of(
            User.builder()
                    .name("Marco")
                    .liked(Set.of(TITANIC, INFINITY_WARS))
                    .build(),
            User.builder()
                    .name("Jeff")
                    .liked(Set.of(INFINITY_WARS, BAD_INTENTIONS))
                    .build(),
            User.builder()
                    .name("Kenny")
                    .liked(Set.of(BAD_INTENTIONS))
                    .build(),
            User.builder()
                    .name("Kristof")
                    .liked(Set.of(INFINITY_WARS))
                    .build()
    );


    @Test
    public void listOfMoviesSortedByLikeDescending() {
        Assertions
                .assertThat(movieTitlesByLikeDescending())
                .containsExactly(INFINITY_WARS, BAD_INTENTIONS, TITANIC);
    }

    private List<String> movieTitlesByLikeDescending() {
        return List.of();
    }
}
