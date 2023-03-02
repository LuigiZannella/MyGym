package it.corso.mygym.service;

import it.corso.mygym.model.User;

public interface UserService {

    User save (User user);

    User findByID (Long Id);

    User findAll(User user);

    User update(Long id, User user);

    User deleteById(Long id);
}
