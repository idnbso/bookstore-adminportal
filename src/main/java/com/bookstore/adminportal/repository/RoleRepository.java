package com.bookstore.adminportal.repository;


import com.bookstore.adminportal.domain.security.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByName(String name);
}
