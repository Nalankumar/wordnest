package com.tnk.wordnest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tnk.wordnest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
