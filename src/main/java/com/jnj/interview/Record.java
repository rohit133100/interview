package com.jnj.interview;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Record {

    String artist;
    String name;
    Double price;
}
