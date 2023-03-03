package it.corso.mygym.controller;

import it.corso.mygym.model.User;
import it.corso.mygym.model.dto.UserDTO;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RequestMapping("/users")
public interface UserController {


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    ResponseEntity<User> save(@RequestBody UserDTO userDto);

    @GetMapping("/{id}")
    ResponseEntity<User> findById(Long id);

    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/findAll")
    ResponseEntity<List<User>> findAll(boolean includeInactiveFlag);

}