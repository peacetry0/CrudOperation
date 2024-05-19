package com.peace.CrudOperation.service;

import com.peace.CrudOperation.model.User;
import com.peace.CrudOperation.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository ;


    public List<User> getAllUsers(){

    return   this.userRepository.findAll() ;

    }

    public User getByUserId(final Long id) {

            Optional<User> userOptional = userRepository.findById(id);

            return userOptional.orElseThrow(() -> new RuntimeException("User not found with id: " + id));


    }

    public User createUser(final User user ){

      return   this.userRepository.save(user) ;
    }

    public User updateUserById(final Long id, final User updatedUser) {
        Optional<User> userOptional = userRepository.findById(id);

        User existingUser = userOptional.orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        existingUser.setName(updatedUser.getName());
        existingUser.setSurName(updatedUser.getSurName());
        // Add other fields to be updated here

        return userRepository.save(existingUser);
    }

    public void deleteUserById(final Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        User user = userOptional.orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        this.userRepository.delete(user);
    }














}
