package com.foodorder.Foodorder.Service.Imp;

import com.foodorder.Foodorder.Entity.UserEntity;
import com.foodorder.Foodorder.Repository.UserRepository;
import com.foodorder.Foodorder.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void updateUser(UserEntity user) {
        userRepository.save(user);
    }

    @Override
    public void removeUserById(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<UserEntity> getUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<UserEntity> getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
}
