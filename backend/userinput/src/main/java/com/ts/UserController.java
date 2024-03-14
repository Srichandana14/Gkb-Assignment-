package com.ts;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.dao.UserDao;
import com.model.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @GetMapping("/getUserByEmail/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userDao.getUserByEmail(email);
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userDao.addUser(user);
    }

    @GetMapping("/getUser/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userDao.getUserById(userId);
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user) {
        return userDao.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userDao.deleteUser(userId);
    }
}
