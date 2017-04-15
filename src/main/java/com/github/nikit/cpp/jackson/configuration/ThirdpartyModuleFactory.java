package com.github.nikit.cpp.jackson.configuration;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.github.nikit.cpp.jackson.thirdparty.AbstractAnimal;
import com.github.nikit.cpp.jackson.thirdparty.AnimalCatWithoutDefaultConstructor;
import com.github.nikit.cpp.jackson.thirdparty.ClassWithoutDefaultConstructor;

/**
 * Created by nik on 15.04.17.
 */
public class ThirdpartyModuleFactory {
    public static Module getThirdpartyJacksonModule(){
        SimpleModule module = new SimpleModule();
        module.setMixInAnnotation(ClassWithoutDefaultConstructor.class, ClassWithoutDefaultConstructorMixin.class);
        module.setMixInAnnotation(AbstractAnimal.class, AbstractAnimalMixin.class);
        module.setMixInAnnotation(AnimalCatWithoutDefaultConstructor.class, AnimalCatMixin.class);
        return module;
    }
}
