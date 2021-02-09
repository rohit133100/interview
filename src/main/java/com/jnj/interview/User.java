package com.jnj.interview;

import java.util.Set;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class User {

    String name;
    Set<Movie> liked;
}
