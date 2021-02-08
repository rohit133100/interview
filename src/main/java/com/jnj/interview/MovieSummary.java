package com.jnj.interview;

import java.util.Set;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class MovieSummary {

    String title;
    Set<String> userNames;
}
