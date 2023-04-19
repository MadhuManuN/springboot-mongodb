package com.zkteco.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zkteco.mongodb.collection.Photo;

@Repository
public interface PhotoRepository extends MongoRepository<Photo, String> {

}
