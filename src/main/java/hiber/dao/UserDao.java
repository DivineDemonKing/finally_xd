package hiber.dao;

import hiber.model.User;
import org.springframework.stereotype.Component;

import java.util.List;
public interface UserDao {
   void add(User user);
   void deleteById (long id);
   void update(User user);
   List<User> listUsers();
}
