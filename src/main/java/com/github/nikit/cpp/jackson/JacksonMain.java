package com.github.nikit.cpp.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;

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
        objectMapper.registerModule(module);

        //objectMapper.addMixIn(ClassWithoutDefaultConstructor.class, ClassWithoutDefaultConstructorMixin.class);


        ClassWithoutDefaultConstructor classWithoutDefaultConstructor = new ClassWithoutDefaultConstructor("ololo");

        String out = objectMapper.writeValueAsString(classWithoutDefaultConstructor);

        ClassWithoutDefaultConstructor readed = objectMapper.readValue(out, ClassWithoutDefaultConstructor.class );

        System.out.println(readed.getString());
    }
}
