package com.quizmanagement.quiz.service;

import com.quizmanagement.quiz.model.Category;

import java.util.Set;

public interface CategoryService {

    public Category addCategory(Category category);

    public Category updateCategory(Category category);

    public Set<Category> getCategory();

    public Category getCategory(Long categoryId);

    public void deleteCategory(Long categoryId);

}