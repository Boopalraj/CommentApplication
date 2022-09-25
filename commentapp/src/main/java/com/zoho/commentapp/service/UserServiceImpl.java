package com.zoho.commentapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.commentapp.model.Post;
import com.zoho.commentapp.model.User;
import com.zoho.commentapp.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userrepo;

	@Override
	public String registerUser(User user) {
		// TODO Auto-generated method stub
		if (user.getEmail().isEmpty() || user.getPassword().isEmpty() || user.getSecret().isEmpty()) {
			userrepo.save(user);
			return "register_failure";
		} else if (userrepo.findById(user.getEmail()).isEmpty()) {
			return "register_success";
		} else
			return "register_failure";
	}

	public void postComments(Post post) {
		// TODO Auto-generated method stub
		post.setemail(post.getemail());
		userrepo.save(post);
	}

}
