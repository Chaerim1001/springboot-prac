package com.prac.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// Entity 클래스와 해당 Entity에 대한 Repository는 함께 있어야 한다.
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
