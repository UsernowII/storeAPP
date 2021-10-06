package com.edu.unbosque.store.service;

import com.edu.unbosque.store.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

     List<User> listar();
     Optional<User> getUserId(int id);
     int save(User user);
     void delete(int id);



}
