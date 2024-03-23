package dev.nampd.realnote.service.impl;

import dev.nampd.realnote.jwt.request.SignUpRequest;
import dev.nampd.realnote.model.entity.Role;
import dev.nampd.realnote.model.entity.User;
import dev.nampd.realnote.repository.RoleRepository;
import dev.nampd.realnote.repository.UserRepository;
import dev.nampd.realnote.service.AuthenticationService;
import dev.nampd.realnote.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public User signup(SignUpRequest signUpRequest) {
        User user = new User();
        Role role = roleRepository.findByName("user");

        user.setName(signUpRequest.getName());
        user.setEmail(signUpRequest.getEmail());
        user.setRole(role);
        user.setPassword(passwordEncoder.encode());
    }

}
