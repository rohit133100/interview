package com.jnj.interview;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ArtistMean {
    String name;
    Double recordPriceMean;
}
