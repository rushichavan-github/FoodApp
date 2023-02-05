package com.example.onlineFood.services;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.validation.annotation.Validated;

import com.example.onlineFood.entities.Category;
import com.example.onlineFood.exceptions.NoCategoryFoundException;



@Validated
public interface CategoryService {

	Category addCategory(@Valid Category category);

	List<Category> viewAllCategory();

	Category updateCategory(@Valid Category category) throws NoCategoryFoundException;

	String deleteCategory(@Min(1)long id) throws NoCategoryFoundException;

}
