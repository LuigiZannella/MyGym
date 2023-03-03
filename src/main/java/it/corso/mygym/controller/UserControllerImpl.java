package it.corso.mygym.controller;

import it.corso.mygym.model.User;
import it.corso.mygym.model.dto.UserDTO;
import it.corso.mygym.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserControllerImpl implements UserController {

    private UserService userService;

    @Override
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public ResponseEntity<User> save(@RequestBody UserDTO UserDTO) {
        User userSaved = userService.save(UserDTO);

        return new ResponseEntity<>(userSaved, HttpStatus.CREATED);
    }

    @Override
    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") Long id) {
        User userId = userService.findById(id);

        return new ResponseEntity<>(userId, HttpStatus.FOUND);

    }

    @Override
    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll(boolean includeInactiveFlag) {
        List<User> users = userService.findAll(true);
        return new ResponseEntity<>(users, HttpStatus.FOUND);
    }

}
