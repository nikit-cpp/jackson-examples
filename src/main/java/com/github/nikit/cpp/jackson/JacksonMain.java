package com.github.nikit.cpp.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

/**
 * https://reachmnadeem.wordpress.com/2016/09/23/jackson-mixin-to-the-rescue/
 * Created by nik on 15.04.17.
 */
public class JacksonMain
{
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        /*objectMapper.setVisibility(objectMapper.getSerializationConfig()
                .getDefaultVisibilityChecker()
                .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));*/

        SimpleModule module = new SimpleModule();
        module.setMixInAnnotation(ClassWithoutDefaultConstructor.class, ClassWithoutDefaultConstructorMixin.class);
        module.setMixInAnnotation(AbstractAnimal.class, AbstractAnimalMixin.class);
        objectMapper.registerModule(module);

        //objectMapper.addMixIn(ClassWithoutDefaultConstructor.class, ClassWithoutDefaultConstructorMixin.class);

        Collection<AbstractAnimal> animals = Arrays.asList(new AnimalCat(1, "Tom"), new AnimalDog("Spike", 14.33));
        ClassWithoutDefaultConstructor classWithoutDefaultConstructor = new ClassWithoutDefaultConstructor("ololo" ,animals);

        String out = objectMapper.writeValueAsString(classWithoutDefaultConstructor);
        System.out.println("Serialized: " + out);

        ClassWithoutDefaultConstructor readed = objectMapper.readValue(out, ClassWithoutDefaultConstructor.class );

        System.out.println("\nDeserialized:");
        System.out.println(readed.toString());
    }
}
