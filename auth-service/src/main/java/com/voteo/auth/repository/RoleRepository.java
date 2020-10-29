package com.voteo.auth.repository;

import com.voteo.auth.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
