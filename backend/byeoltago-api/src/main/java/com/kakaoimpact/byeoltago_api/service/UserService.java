package com.kakaoimpact.byeoltago_api.service;

import com.kakaoimpact.byeoltago_api.model.User;
import com.kakaoimpact.byeoltago_api.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public Boolean login(String email){
        User user =  userRepository.findUserByEmail(email);
        return user.getEmail().equals("kyunghoon451@gmail.com");
    }


}
