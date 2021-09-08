package com.pivot.deals;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/Users")
public class UserController {
    @GetMapping
    public List<User> getUser(@RequestParam(name="name", required=false) String name, Model model) {
        User user = new User();
        return List.of(user);
    }

    @PostMapping
    public void addUser() {
        // userService.addUser();
    }

}
