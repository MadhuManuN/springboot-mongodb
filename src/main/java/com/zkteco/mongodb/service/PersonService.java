package com.zkteco.mongodb.service;

import java.util.List;

import org.bson.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.zkteco.mongodb.collection.Person;

@Service
public interface PersonService {

	String save(Person person);

	List<Person> getPersonStartWith(String name);

	void deleteById(String id);

	List<Person> getByPersonAge(Integer minAge, Integer maxAge);

	Page<Person> searchPerson(String name, Integer minAge, Integer maxAge, String city, Pageable pageable);

	List<Document> getOldestPersonByCity();

	List<Document> getPopulationByCity();

}
