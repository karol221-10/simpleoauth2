package pl.kompikownia.oauth2resourceserver.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kompikownia.oauth2resourceserver.model.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/")
    public List<User> getUserList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Jan","kowalski@o2.pl"));
        users.add(new User("Maciej","maciej@o2.pl"));
        return users;
    }
}
