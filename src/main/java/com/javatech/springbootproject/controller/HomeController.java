package com.javatech.springbootproject.controller;

import com.javatech.springbootproject.entity.Contact;
import com.javatech.springbootproject.entity.User;
import com.javatech.springbootproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.GeneratedValue;

@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/test")

    @ResponseBody
    public String test() {
        User user = new User();
        user.setName("Elle Jackson");
        user.setEmail("elleJackson2@yahoo.in");
        Contact contact = new Contact();
        user.getContacts().add(contact);
        userRepository.save(user);
        return "working";
    }
}
