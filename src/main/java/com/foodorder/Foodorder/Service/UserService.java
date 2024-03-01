package com.foodorder.Foodorder.Service;
import com.foodorder.Foodorder.Entity.UserEntity;


import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserEntity> getAllUser();
    void updateUser(UserEntity user);
    void removeUserById(int id);
    Optional<UserEntity> getUserById(int id);
    Optional<UserEntity> getUserByEmail(String email);
}
