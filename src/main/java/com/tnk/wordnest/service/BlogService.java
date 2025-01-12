package com.tnk.wordnest.service;

import java.util.Optional;

import com.tnk.wordnest.entity.Blog;

public interface BlogService {
	public Optional<Blog> findById(Long id);
	public Blog post(Blog blog);
}
