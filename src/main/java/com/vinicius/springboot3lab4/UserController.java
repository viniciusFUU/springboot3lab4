package com.vinicius.springboot3lab4;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/usuario")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping(name = "/create")
    public String createuser(@RequestBody String nome, int idade){
        User user = userService.createUser(nome, idade);
        String userName = user.getNome();

        return userName + " Criado com sucesso.";
    }
}
