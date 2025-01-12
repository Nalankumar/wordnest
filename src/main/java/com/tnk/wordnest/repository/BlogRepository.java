package com.tnk.wordnest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tnk.wordnest.entity.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long>{

}
