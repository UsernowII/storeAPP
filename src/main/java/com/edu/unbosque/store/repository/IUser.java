package com.edu.unbosque.store.repository;

import com.edu.unbosque.store.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUser extends CrudRepository <User, Long> {

}
