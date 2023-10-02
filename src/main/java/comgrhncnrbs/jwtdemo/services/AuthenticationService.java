package comgrhncnrbs.jwtdemo.services;

import comgrhncnrbs.jwtdemo.dto.JwtAuthenticationResponse;
import comgrhncnrbs.jwtdemo.dto.RefreshTokenRequest;
import comgrhncnrbs.jwtdemo.dto.SignInRequest;
import comgrhncnrbs.jwtdemo.dto.SignUpRequest;
import comgrhncnrbs.jwtdemo.entities.User;

public interface AuthenticationService {

    User signUp(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signIn(SignInRequest signinRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
