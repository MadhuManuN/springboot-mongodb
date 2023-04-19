package com.zkteco.mongodb.serviceImpl;

import java.io.IOException;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.zkteco.mongodb.collection.Photo;
import com.zkteco.mongodb.repository.PhotoRepository;
import com.zkteco.mongodb.service.PhotoService;

@Service
public class PhotoServiceImpl implements PhotoService {

	@Autowired
	private PhotoRepository photoRepository;
	@Override
	public String addPhoto(String originalFilename, MultipartFile image) {
		Photo photo=new Photo();
		photo.setTitle(originalFilename);
		try {
			photo.setPhoto(new Binary(BsonBinarySubType.BINARY, image.getBytes()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return photoRepository.save(photo).getId();
	}
	@Override
	public Photo getPhotoById(String id) {
		return photoRepository.findById(id).get();
	}

}
