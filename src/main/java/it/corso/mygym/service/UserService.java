package it.corso.mygym.service;

import it.corso.mygym.model.User;
import it.corso.mygym.model.dto.UserDTO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserService {

    User save(UserDTO userDto);

    User findById(Long id);

    List<User> findAll(boolean includeInactiveFlag);

    List<User> findAll();

    User update(Long id, UserDTO userDto);

    User deleteById(Long id);
}
