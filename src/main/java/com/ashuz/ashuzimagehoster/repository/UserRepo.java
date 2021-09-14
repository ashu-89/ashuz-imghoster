package com.ashuz.ashuzimagehoster.repository;

import com.ashuz.ashuzimagehoster.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, UUID> {
}
