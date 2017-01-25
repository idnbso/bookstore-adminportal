package com.bookstore.adminportal.service;


import com.bookstore.adminportal.domain.User;
import com.bookstore.adminportal.domain.security.UserRole;

import java.util.Set;

public interface UserService {
    User createUser(User user, Set<UserRole> userRoles) throws Exception;

    User save(User user);
}
