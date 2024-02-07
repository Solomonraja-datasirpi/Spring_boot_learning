package com.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class SecurityController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome! This endpoint is not secure.";
    }

    @GetMapping("/user/userProfile")
    public String userProfile() {
        return "User profile information (secured)";
    }

    @GetMapping("/admin/adminProfile")
    public String adminProfile() {
        return "Admin profile information (secured)";
    }
}
