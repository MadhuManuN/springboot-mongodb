package com.zkteco.mongodb.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.zkteco.mongodb.collection.Photo;

@Service
public interface PhotoService {

	String addPhoto(String originalFilename, MultipartFile image);

	Photo getPhotoById(String id);

}
