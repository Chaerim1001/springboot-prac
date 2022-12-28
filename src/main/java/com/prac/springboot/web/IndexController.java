package com.prac.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index"; // 컨트롤러에서 문자열을 반환하면 머스테치 스타터가 알아서 앞의 경로와 뒤의 파일 확장자를 지정해준다.
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
