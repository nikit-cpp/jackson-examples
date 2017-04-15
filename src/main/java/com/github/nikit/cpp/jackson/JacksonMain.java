package com.github.nikit.cpp.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.nikit.cpp.jackson.configuration.ThirdpartyModuleFactory;
import com.github.nikit.cpp.jackson.thirdparty.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

/**
 * https://reachmnadeem.wordpress.com/2016/09/23/jackson-mixin-to-the-rescue/
 * http://programmerbruce.blogspot.fr/2011/05/deserialize-json-with-jackson-into.html
 * Created by nik on 15.04.17.
 */
public class JacksonMain
{
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        /* not compiles in Jackson 2.1
        objectMapper.setVisibility(objectMapper.getSerializationConfig()
                .getDefaultVisibilityChecker()
                .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));*/

        objectMapper.registerModule(ThirdpartyModuleFactory.getThirdpartyJacksonModule());

        //objectMapper.addMixIn(ClassWithoutDefaultConstructor.class, ClassWithoutDefaultConstructorMixin.class);

        Collection<Animal> animals = Arrays.asList(new AnimalCatWithoutDefaultConstructor(1, "Tom"), new AnimalDog("Spike", 14.33));
        Principal principal = new Principal("Name", "Surname");
        ClassWithoutDefaultConstructor classWithoutDefaultConstructor = new ClassWithoutDefaultConstructor("ololo" ,animals, principal);

        String out = objectMapper.writeValueAsString(classWithoutDefaultConstructor);
        System.out.println("Serialized: " + out);

        ClassWithoutDefaultConstructor readed = objectMapper.readValue(out, ClassWithoutDefaultConstructor.class );

        System.out.println("\nDeserialized:");
        System.out.println(readed.toString());
    }
}
