package hiber.service;

import hiber.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
public interface UserService {
    void add(User user);
    void deleteById (long id);
    void update( User user);
    List<User> listUsers();
}
