package com.cognitask.cognitask_ai.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cognitask.cognitask_ai.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}