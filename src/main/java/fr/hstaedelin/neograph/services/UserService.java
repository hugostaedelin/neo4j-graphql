package fr.hstaedelin.neograph.services;

import fr.hstaedelin.neograph.model.User;
import fr.hstaedelin.neograph.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Collection<User> getAll() {
        return userRepository.getAllUsers();
    }

    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }
}
