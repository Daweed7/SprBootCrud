package com.dav.kat.springboot.crud.sprbootcrud.service;

import com.dav.kat.springboot.crud.sprbootcrud.model.User;
import com.dav.kat.springboot.crud.sprbootcrud.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public List<User> listUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    @Transactional
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public User showUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
