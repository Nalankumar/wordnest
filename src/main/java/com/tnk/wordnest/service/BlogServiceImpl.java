package com.tnk.wordnest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tnk.wordnest.entity.Blog;
import com.tnk.wordnest.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService{
	@Autowired
	private BlogRepository blogRepositoy;
	
	public Optional<Blog> findById(Long id) {
		return blogRepositoy.findById(id);		
	}
	
	public Blog post(Blog blog) {
		return blogRepositoy.save(blog);
	}
}
