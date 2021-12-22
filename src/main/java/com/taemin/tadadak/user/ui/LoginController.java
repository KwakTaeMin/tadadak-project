package com.taemin.tadadak.user.ui;

import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
    public String loginPage() {
        return "login";
    }
}
