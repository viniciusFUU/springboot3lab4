package com.vinicius.springboot3lab4;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(String nome, int idade){
        User user = new User(nome, idade);
        userRepository.save(user);

        return user;
    }
}
