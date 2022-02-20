package com.boot.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.demo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
