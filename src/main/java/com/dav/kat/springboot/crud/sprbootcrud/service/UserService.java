package com.dav.kat.springboot.crud.sprbootcrud.service;

import com.dav.kat.springboot.crud.sprbootcrud.model.User;
import com.dav.kat.springboot.crud.sprbootcrud.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> listUsers() {
        return (List<User>) userRepository.findAll();
    }

    public void create(User user) {
        userRepository.save(user);
    }

    public User showUser(Long id) {
        return userRepository.findById(id).get();
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
