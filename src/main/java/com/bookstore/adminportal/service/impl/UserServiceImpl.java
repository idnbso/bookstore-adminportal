package com.bookstore.adminportal.service.impl;

import com.bookstore.adminportal.domain.User;
import com.bookstore.adminportal.domain.security.UserRole;

import com.bookstore.adminportal.repository.RoleRepository;
import com.bookstore.adminportal.repository.UserRepository;
import com.bookstore.adminportal.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User localUser = userRepository.findByUsername(user.getUsername());

        if (localUser != null) {
            LOGGER.info("User {} already exists. Nothing will be done.", user.getUsername());
        } else {
            for (UserRole ur: userRoles) {
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);

            localUser = userRepository.save(user);
        }

        return localUser;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }


}
