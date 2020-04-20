package com.cavluni.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cavluni.course.entities.User;
import com.cavluni.course.repositories.UserRepository;
import com.cavluni.course.services.exceptions.ResourceNotFoundExceptions;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundExceptions(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}

	public void delete (Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getOne(id);
		updatedata(entity, obj);
		return repository.save(entity);
	}
	private void updatedata(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
}
