package com.bwf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bwf.entity.User;

public interface UserMapper {
	User getUserById(int id);
	
	void add(User user1);
	
	void update(User user);
	
	User login( User user );
	

	User getUserByUsernameAndPassword(User user);

	User getMenusAndOperatesByUserId(int userId);

	List<User> getAllUsers();

	void deleteUser(Integer id);

	void deleteMulti(@Param("idArr") Integer[] idArr);
}
