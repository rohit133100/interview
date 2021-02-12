package com.jnj.interview;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

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
                    .liked(Set.of(TITANIC, BAD_INTENTIONS))
                    .build(),
            User.builder()
                    .name("Kristof")
                    .liked(Set.of(INFINITY_WARS))
                    .build()
    );


    @Test
    public void theBestMovieIsInfinityWars() {
        Assertions.assertThat(bestMovie()).hasValueSatisfying(movie ->
                Assertions.assertThat(movie.getTitle()).isEqualTo(INFINITY_WARS)
        );
    }

    private Optional<Movie> bestMovie() {
        return Optional.empty();
    }
}
