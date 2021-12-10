package com.example.spring13.db.repo;

import com.example.spring13.db.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dmitrii Chernykh
 */
@Repository
public interface UserRepo extends JpaRepository<UserEntity,Long> {
}
