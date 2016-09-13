package com.example.dao;

import com.example.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Admin on 2016/9/13.
 */
public interface PersonRepository extends MongoRepository<Person,String> {

    Person findByName(String name);

    @Query("{'age':?0}")
    List<Person> findByAge(Integer age);

}
