package examiz;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getter method for email
    public String getEmail() {
        return email;
    }

    // Getter method for password
    public String getPassword() {
        return password;
    }
}
