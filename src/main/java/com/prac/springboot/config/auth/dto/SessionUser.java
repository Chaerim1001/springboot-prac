package com.prac.springboot.config.auth.dto;

import com.prac.springboot.domain.user.TB_User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable { // 인증된 사용자 정보
    private String name;
    private String email;
    private String picture;

    public SessionUser(TB_User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
