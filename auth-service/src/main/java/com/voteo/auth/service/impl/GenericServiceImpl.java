package com.voteo.auth.service.impl;

import com.voteo.auth.domain.User;
import com.voteo.auth.repository.UserRepository;
import com.voteo.auth.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }

}
