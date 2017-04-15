package com.github.nikit.cpp.jackson.configuration;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by nik on 15.04.17.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY)
public abstract class AbstractAnimalMixin {
}
