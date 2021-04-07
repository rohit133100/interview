package com.jnj.interview;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SummaryTest {

    private static final String EXTRAWELT = "Extrawelt";
    private static final String TRENTEMOLLER = "Trentemoller";
    private static final String BREJCHA = "Boris Brejcha";

    private final List<Record> records = List.of(
            Record.builder()
                    .artist(EXTRAWELT)
                    .name("Schone Neue Extrawelt")
                    .price(12.45)
                    .build(),
            Record.builder()
                    .artist(EXTRAWELT)
                    .name("In Aufrhur")
                    .price(11.32)
                    .build(),
            Record.builder()
                    .artist(EXTRAWELT)
                    .name("Fear of an Extra Planet")
                    .price(10.50)
                    .build(),
            Record.builder()
                    .artist(TRENTEMOLLER)
                    .name("The Last Resort")
                    .price(13.34)
                    .build(),
            Record.builder()
                    .artist(TRENTEMOLLER)
                    .name("Lost")
                    .price(12.21)
                    .build(),
            Record.builder()
                    .artist(TRENTEMOLLER)
                    .name("Early Workx")
                    .price(11.99)
                    .build(),
            Record.builder()
                    .artist(BREJCHA)
                    .name("Fruhe Autisten")
                    .price(10.99)
                    .build(),
            Record.builder()
                    .artist(BREJCHA)
                    .name("Feuerfalter")
                    .price(11.99)
                    .build(),
            Record.builder()
                    .artist(BREJCHA)
                    .name("22")
                    .price(12.05)
                    .build()
    );

    @Test
    public void listOfMoviesSortedByLikeDescending() {
        Assertions
                .assertThat(bestPaidArtist(records))
                .hasValue(ArtistMean.builder()
                        .name(TRENTEMOLLER)
                        .recordPriceMean(12.513333333333334)
                        .build());
    }

    private Optional<ArtistMean> bestPaidArtist(List<Record> records) {
        return Optional.empty();
    }
}
