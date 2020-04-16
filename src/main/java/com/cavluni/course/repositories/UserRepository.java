package com.cavluni.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cavluni.course.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
