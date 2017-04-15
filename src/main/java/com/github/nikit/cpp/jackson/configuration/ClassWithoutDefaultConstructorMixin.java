package com.github.nikit.cpp.jackson.configuration;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.nikit.cpp.jackson.thirdparty.AbstractAnimal;

import java.util.Collection;

/**
 * Created by nik on 15.04.17.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE)
public abstract class ClassWithoutDefaultConstructorMixin {


    /**
     * Emulates constructor of that class, on which this annotation was add.
     * Ths method never called.
     * @param s
     * @param animals
     */
    @JsonCreator
    public ClassWithoutDefaultConstructorMixin(
            @JsonProperty("string") String s,
            @JsonProperty("animals") Collection<AbstractAnimal> animals,
            @JsonProperty("principal") Object principal
    ) {}

}
