package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;

//@RestController
public class PostController {

	@Autowired
	private PostRepository postRepository;

	@RequestMapping(value = "/posts", method = RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.CREATED)
	public Post createNewPost(@RequestBody Post post) {
		Post p = postRepository.save(post);
		return p;
	}

	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	@ResponseStatus(code = HttpStatus.OK)
	public List<Post> listPosts() {
		return postRepository.findAll();
	}

}
