package com.peace.CrudOperation.repository;

import com.peace.CrudOperation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
