package com.attachment.controller;

import com.attachment.entity.User;
import com.attachment.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<?> all(){
        return ResponseEntity.ok().body(userService.all());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> byId(@PathVariable Long id){
        return ResponseEntity.ok().body(userService.byId(id));
    }

    @PostMapping()
    public ResponseEntity<?> add(@RequestBody User user){
        System.out.println(user.getName());
        User u =userService.add(user);
        return ResponseEntity.ok().body(u);
    }


}
