package com.dela.repositories;

import com.dela.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findByBelongsTo(Integer id);
}
