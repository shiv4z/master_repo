package in.shiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shiv.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
