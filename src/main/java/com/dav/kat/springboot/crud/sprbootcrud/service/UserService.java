package com.dav.kat.springboot.crud.sprbootcrud.service;

import com.dav.kat.springboot.crud.sprbootcrud.model.User;
import java.util.List;

public interface UserService {

    List<User> listUsers();

    void create(User user);

    User showUser(Long id);

    void delete(Long id);
}
