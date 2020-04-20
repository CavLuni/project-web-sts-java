package com.cavluni.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cavluni.course.entities.Category;

public interface CategoryRepository extends JpaRepository <Category, Long> {

}
