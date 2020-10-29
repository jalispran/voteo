package com.voteo.auth.service;

import com.voteo.auth.domain.User;

import java.util.List;

public interface GenericService {
    List<User> findAllUsers();
}
