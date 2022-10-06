package fr.hstaedelin.neograph.services;

import fr.hstaedelin.neograph.model.User;
import fr.hstaedelin.neograph.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public Iterable<User> getAll() {
        return userRepository.getAllUsers();
    }
}
