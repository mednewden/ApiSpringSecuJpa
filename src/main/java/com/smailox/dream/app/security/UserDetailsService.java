package com.smailox.dream.app.security;


import com.smailox.dream.app.model.User;
import com.smailox.dream.app.model.UserPrincipal;
import com.smailox.dream.app.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepo.findByUsername(username);
        if(user==null) {
            throw new UsernameNotFoundException(username);
        }
        return new UserPrincipal(user);

        //return new UserPrincipal(new User(username));
    }
}
