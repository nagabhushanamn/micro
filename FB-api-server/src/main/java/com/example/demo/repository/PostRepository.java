package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Post;

@RepositoryRestController
public interface PostRepository extends JpaRepository<Post, Integer> {

	List<Post> findByAuthor(String author);

}
