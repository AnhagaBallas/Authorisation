package ru.netology.authorisation.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorisation.authorities.Authorities;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authoritiesList = new ArrayList<>();
        if (user.equals("user") && password.equals("123")) {
            authoritiesList = List.of(Authorities.values());
            return authoritiesList;
        } else {
            authoritiesList = List.of();
            return authoritiesList;
        }
    }
}