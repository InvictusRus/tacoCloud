package sia.tacocloud.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.Data;
import sia.tacocloud.domain.User;

@Data
public class RegistrationForm {

    private final String username;
    private final String password;
    private final String fullname;
    private final String street;
    private final String city;
    private final String state;
    private final String zip;
    private final String phoneNumber;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(username, passwordEncoder.encode(password), fullname, street, city, state, zip, phoneNumber);
    }
}
