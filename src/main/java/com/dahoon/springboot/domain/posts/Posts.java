package com.dahoon.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity // Entity의 선언을 통해 Posts 클래스는 실제 DB의 테이블과 매칭될 클래스임을 나타냄
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=500, nullable=false)
    private String title;

    @Column(columnDefinition="Text", nullable = false)
    private String content;

    private String author;

    @Builder // Builder를 통해 Setter의 역할을 대신할 수 있음
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
