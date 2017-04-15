package com.github.nikit.cpp.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by nik on 15.04.17.
 */
public abstract class AnimalCatMixin {
    @JsonCreator
    public AnimalCatMixin(
            @JsonProperty("weight") int weight,
            @JsonProperty("name") String name
    ) {}
}
