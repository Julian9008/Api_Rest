package com.example.Users.Controller;

import com.example.Users.Model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/users")


public class UserController {
    private List<User> users = new ArrayList<>();

    // Método GET para obtener la lista de usuarios
    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    // Método POST para agregar un nuevo usuario
    @PostMapping
    public String addUser(@RequestBody User user) {
        users.add(user);
        return "User added successfully!";
    }

}
