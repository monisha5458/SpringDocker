package com.example.SpringDocker.Repository;



import com.example.SpringDocker.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
