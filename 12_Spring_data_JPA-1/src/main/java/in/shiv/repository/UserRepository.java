package in.shiv.repository;

import org.springframework.data.repository.CrudRepository;

import in.shiv.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
