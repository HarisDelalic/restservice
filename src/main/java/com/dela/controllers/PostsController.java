package com.dela.controllers;

import com.dela.exceptions.PostNotFoundException;
import com.dela.exceptions.UserNotFoundException;
import com.dela.models.Post;
import com.dela.models.User;
import com.dela.repositories.PostRepository;
import com.dela.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/users/{id}/posts")
    public List<Post> getUserPosts(@PathVariable Integer id) {
        User belongsTo = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        return belongsTo.getPosts();
    }

    @GetMapping("/users/{id}/posts/{post_id}")
    public Post getUserPost(@PathVariable Integer id, @PathVariable Integer post_id) {
        return postRepository.findById(post_id).orElseThrow(() -> new PostNotFoundException(id));
    }


}
