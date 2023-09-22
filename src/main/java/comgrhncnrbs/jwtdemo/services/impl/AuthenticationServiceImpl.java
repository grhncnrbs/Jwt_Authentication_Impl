package comgrhncnrbs.jwtdemo.services.impl;

import comgrhncnrbs.jwtdemo.dto.SignUpRequest;
import comgrhncnrbs.jwtdemo.entities.Role;
import comgrhncnrbs.jwtdemo.entities.User;
import comgrhncnrbs.jwtdemo.repository.UserRepository;
import comgrhncnrbs.jwtdemo.services.AuthenticationService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User signUp(SignUpRequest signUpRequest) {
        User user = new User();
        user.setEmail(signUpRequest.getEmail());
        user.setFirstName(signUpRequest.getFirstName());
        user.setLastName(signUpRequest.getLastName());
        user.setRole(Role.USER);
        user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));
        return userRepository.save(user);
    }
}
