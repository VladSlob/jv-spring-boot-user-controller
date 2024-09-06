package mate.academy.springboot.web.controller;

import mate.academy.springboot.web.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers() {
        return List.of(
            new User(1L, "bob@i.ua"),
            new User(2L, "alice@i.ua")
        );
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        return String.format("User created. Id: %s, email: %s", user.id(), user.email());
    }
}
