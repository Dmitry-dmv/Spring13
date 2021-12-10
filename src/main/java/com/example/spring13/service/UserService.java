package com.example.spring13.service;

import com.example.spring13.db.repo.UserRepo;
import com.example.spring13.dto.UserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Dmitrii Chernykh
 */
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;

    public List<UserDetails> getAll() {
        userRepo.findAll();
        throw new RuntimeException("Not impl");
    }

    public void add(UserDetails userDetails) {
        throw new RuntimeException("Not impl");
    }

}
