package dev.nampd.realnote.repository;

import dev.nampd.realnote.model.entity.Role;
import dev.nampd.realnote.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String username);

    User findByRole(Role role);
}
