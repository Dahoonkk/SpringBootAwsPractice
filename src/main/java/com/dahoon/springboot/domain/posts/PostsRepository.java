package com.dahoon.springboot.domain.posts;

// Posts 클래스로 DB를 접근하게 하는 인터페이스
// ibatis나 MyBatis 등에서 Dao라고 불리는 DB Layer 접근자를 JPA에선 Repository라 부르며 인터페이스로 생성
// JpaRepository<Entity 클래스, PK 타입>를 상속하면 기본적인 CRUD 메소드 자동 추가

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}
