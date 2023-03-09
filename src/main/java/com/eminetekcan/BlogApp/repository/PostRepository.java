package com.eminetekcan.BlogApp.repository;

import com.eminetekcan.BlogApp.entity.Category;
import com.eminetekcan.BlogApp.entity.Post;
import com.eminetekcan.BlogApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {

    List<Post> findAllByUser(User user);
    List<Post> findAllByCategory(Category category);
}
