package examiz;

import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
    public List<User> users;

    public UserDatabase() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public boolean isValidUser(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true; // Valid user
            }
        }
        return false; // Invalid user
    }
}
// i am root