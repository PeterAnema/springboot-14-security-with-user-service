package nl.gettoworktogether.security_with_user_service.repository;

import nl.gettoworktogether.security_with_user_service.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
