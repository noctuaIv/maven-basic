package com.voytovych.maven.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voytovych.maven.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
