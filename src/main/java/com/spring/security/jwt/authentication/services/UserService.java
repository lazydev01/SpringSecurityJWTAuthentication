package com.spring.security.jwt.authentication.services;

import com.spring.security.jwt.authentication.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(), "Arpit", "arpit@jwt.com"));
        store.add(new User(UUID.randomUUID().toString(), "Banz", "banz@jwt.com"));
        store.add(new User(UUID.randomUUID().toString(), "XYZ", "xyz@jwt.com"));
    }

    public List<User> getUsers(){
        return store;
    }
}
