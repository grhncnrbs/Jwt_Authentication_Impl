package comgrhncnrbs.jwtdemo.services;

import comgrhncnrbs.jwtdemo.dto.SignUpRequest;
import comgrhncnrbs.jwtdemo.entities.User;

public interface AuthenticationService {

    User signUp(SignUpRequest signUpRequest);
}
