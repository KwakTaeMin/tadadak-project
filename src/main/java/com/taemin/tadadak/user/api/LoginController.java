package com.taemin.tadadak.user.api;

import com.taemin.tadadak.user.domain.SessionUser;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
@AllArgsConstructor
public class LoginController {

    private final HttpSession httpSession;

    @GetMapping("/loginSuccess")
    public SessionUser loginSuccess() {
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        return user;
    }
}
