package com.attachment.service;

import com.attachment.entity.User;
import com.attachment.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public List<User> all(){
        return userRepo.findAll();
    }

    public User byId(Long id){
        return userRepo.findById(id).get();
    }

    public User add(User user){
        return userRepo.save(user);
    }

}
