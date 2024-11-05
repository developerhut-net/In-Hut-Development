package com.developerhut.inhutdev.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Configuration;

import com.developerhut.inhutdev.entity.Post;

import jakarta.annotation.PostConstruct;

@Configuration
public class PostRepository {

	public static Map<Integer, Post> postMap = new HashMap<>();
	
	@PostConstruct
	public void createPost() {
		
		Post post = new Post(1, "john", "Post #1", "This is my first Post");
		postMap.put(post.getId(), post);
		
		post = new Post(2, "jessica", "Post #2", "This is my second Post");
		postMap.put(post.getId(), post);
		
		post = new Post(3, "john", "Feeling happy", "feeling very happy today");
		postMap.put(post.getId(), post);
		
		post = new Post(4, "john", "Post #2", "This is my 2nd Post");
		postMap.put(post.getId(), post);
		
		post = new Post(5, "jessica", "I am certified developer", "I got new certification");
		postMap.put(post.getId(), post);
		
	}
	
}
