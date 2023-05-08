package ru.netology.authorization_service.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorization_service.model.User;
import ru.netology.authorization_service.service.Authorities;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(User user) {
        List<Authorities> authorities = new ArrayList<>();
        if (!"admin".equals(user.getUser()) && !"A321".equals(user.getPassword())) {
            return authorities;
        }
        authorities.add(Authorities.READ);
        authorities.add(Authorities.WRITE);
        authorities.add(Authorities.DELETE);
        return authorities;
    }
}
