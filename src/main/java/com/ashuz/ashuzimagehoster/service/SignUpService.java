package com.ashuz.ashuzimagehoster.service;

import com.ashuz.ashuzimagehoster.entity.UserEntity;
import com.ashuz.ashuzimagehoster.model.request.SignUpRequest;
import com.ashuz.ashuzimagehoster.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SignUpService {

    @Autowired
    UserRepo userRepo;

    public UserEntity signUp(SignUpRequest request) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(request.getEmail());
        userEntity.setFirstName(request.getFirstName());
        userEntity.setPassword(request.getPassword());
        userEntity.setLastName(request.getLastName());
        userEntity.setMobilePhone(request.getMobileNumber());
        userEntity.setRole("USER");

        return userRepo.save(userEntity);


    }
}
