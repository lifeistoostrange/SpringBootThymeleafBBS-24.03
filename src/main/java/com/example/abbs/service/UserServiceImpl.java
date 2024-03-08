package com.example.abbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.abbs.dao.UserDao;
import com.example.abbs.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired private UserDao uDao;
	
	@Override
	public User getUserByUid(String uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserList(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getUserCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String uid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int login(String uid, String pwd) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
