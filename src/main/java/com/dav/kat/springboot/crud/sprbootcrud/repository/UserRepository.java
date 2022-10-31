package com.dav.kat.springboot.crud.sprbootcrud.repository;

import com.dav.kat.springboot.crud.sprbootcrud.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
