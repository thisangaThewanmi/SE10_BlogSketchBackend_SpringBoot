package com.example.demoSpring1.repository;

import com.example.demoSpring1.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    @Override
    List<Blog> findAll();
}
