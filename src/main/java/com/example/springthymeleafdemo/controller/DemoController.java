package com.example.springthymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping(value ="/home")
    public String home() {
        return "home";
    }

    @GetMapping(value = "/about")
    public String about() {
        return "about";
    }

    @GetMapping(value = {"/registration-ongoing", "/"})
    public String registrationOngoing() {
        return "registration-ongoing";
    }

    @GetMapping(value = "/student-sign-in")
    public String studentSignIn() {
        return "student-sign-in";
    }

    @GetMapping(value = "/student-registration-ahu")
    public String studentRegistrationAHU() {
        return "student-registration-ahu";
    }

    @GetMapping(value = "/student-registration-non-ahu")
    public String studentRegistrationNonAHU() {
        return "student-registration-non-ahu";
    }

    @GetMapping(value = "/invalid-info")
    public String invalidData() {
        return "invalid-info";
    }

    @GetMapping(value = "/existing-account")
    public String existingAccount() {
        return "existing-account";
    }

    @GetMapping(value = "/account-verification")
    public String accountVerification() {
        return "account-verification";
    }

    @GetMapping(value = "/set-password")
    public String setPassword() {
        return "set-password";
    }

    @GetMapping(value = "/registration-success")
    public String registrationSuccess() {
        return "registration-success";
    }

    @GetMapping(value = "/student-id/student-dashboard")
    public String studentDashboard() {
        return "student-dashboard";
    }

    @GetMapping(value = "/student-id/registration-progress")
    public String registrationProgress() {
        return "registration-progress";
    }

    @GetMapping(value = "/admin/dashboard")
    public String adminDashboard() {
        return "admin-dashboard";
    }

    @GetMapping(value = "/registration-window")
    public String registrationWindow() {
        return "registration-window-creation";
    }

    @GetMapping(value = "/registration-summary")
    public String registrationSummary() { return "registration-summary"; }
}
