package com.careerdevs.user.service;

import com.careerdevs.user.entity.User;
import com.careerdevs.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser( @RequestBody User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }
}
