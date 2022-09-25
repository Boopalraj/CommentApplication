package com.zoho.commentapp.service;

import org.springframework.stereotype.Service;

import com.zoho.commentapp.model.User;

@Service
public interface UserService {

	public String registerUser(User user);
}
