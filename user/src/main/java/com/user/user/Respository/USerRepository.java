package com.user.user.Respository;

import org.springframework.stereotype.Repository;
import com.user.user.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface USerRepository extends JpaRepository<User, Long> {
    
    
}
