package com.example.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Created by Admin on 2016/9/13.
 */
@Document
@Data
public class Person {
    @Id
    private String id;
    private String name;
    private Integer age;
    @Field("locs")
    private Collection<Location> locations = new LinkedHashSet<Location>();

    public Person(String name,Integer age) {
        this.name =  name;
        this.age = age;
    }

}
