package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.demo.model.Comment;

@RepositoryRestController
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
