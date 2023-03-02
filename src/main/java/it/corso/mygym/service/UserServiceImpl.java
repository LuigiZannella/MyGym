package it.corso.mygym.service;

import it.corso.mygym.model.User;
import it.corso.mygym.model.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository repo;

    public UserServiceImpl(final UserRepository repo) {
        this.repo=repo;
    }

    @Override
    public User save(User user) {
        //TODO controllare se la mail dell'utente è gia presente nel db?

        return repo.save(user);
    }

    @Override
    public User deleteById(Long id) {
        // TODO controllo se esiste ID altrimenti ritorno eccezione
        return null;
    }

}
