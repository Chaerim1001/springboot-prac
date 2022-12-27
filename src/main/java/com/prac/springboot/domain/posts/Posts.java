package com.prac.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// Entity 클래스에는 절대 Setter를 사용하지 않는다. --> Setter를 사용하지 않고 생성자를 통해 최종갑을 채운 후 DB에 삽입한다.
@Getter
@NoArgsConstructor
@Entity // 테이블과 링크될 클래스임을 나타낸다.
public class Posts {
    @Id // 테이블의 PK 필드를 나타낸다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 스프링부트 2.0에서는 GenerationType.IDENTITY 옵션을 추가해줘야 auto incrementrk rksmdgkek.
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌더 패턴 클래스를 생성해준다. 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함된다.
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
