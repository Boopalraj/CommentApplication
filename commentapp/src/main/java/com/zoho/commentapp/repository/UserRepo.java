package com.zoho.commentapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zoho.commentapp.model.Post;
import com.zoho.commentapp.model.User;

@Repository
public interface UserRepo extends MongoRepository<User, String> {

	void save(Post post);

	
}
