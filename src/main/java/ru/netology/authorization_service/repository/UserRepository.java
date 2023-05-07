package ru.netology.authorization_service.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorization_service.service.Authorities;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (!"admin".equals(user) && !"A321".equals(password)) {
            return authorities;
        }
        authorities.add(Authorities.READ);
        authorities.add(Authorities.WRITE);
        authorities.add(Authorities.DELETE);
        return authorities;
    }
}
