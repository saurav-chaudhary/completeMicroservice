package com.user.user.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.user.user.Model.User;
import com.user.user.Respository.USerRepository;
@Service
public class UserService {

    @Autowired
    USerRepository uSerRepository;
    public User saveUser(User user) {
        return uSerRepository.save(user);
    }
    public List<User> getAllUser() {
        return uSerRepository.findAll();
        
    }
    
}
