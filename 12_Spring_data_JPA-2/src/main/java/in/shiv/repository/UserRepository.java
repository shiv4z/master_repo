package in.shiv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.shiv.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	/*
	public List<User> findAllByLocation(String location);
	
	public List<User> findAllByAge(Integer age);
	
	public List<User> findAllByLocationAndAge(String location,Integer age);
	
	public List<User> findAllByLocationIn(List<String> location);
	
	public List<User> findAllByGender(String gender);
	
	public List<User> findAllByLocationAndAgeAndGender(String location, Integer age, String gender);
	
	public List<User> findByLocationOrAge(String location,Integer age);
	 
	*/
	@Query(value="from User")
	public List<User> getAllUsers();
	
	@Query(value="select * from shiv.user_master ", nativeQuery=true)
	public List<User> getAllUsersBysql();
	
	@Query(value="select * from shiv.user_master where user_location=:location and user_age=:age", nativeQuery = true)
	public List<User> getAllUsersBySql1(String location, Integer age);

	@Query(value="from User where location=:location and age=:age" )
	public List<User> getAllUserByHql(String location, Integer age);
	
	@Query(value="select user_id,user_age,user_gender,user_name,user_location from shiv.user_master where user_age=:age ", nativeQuery = true)
	public List<User> getUserNameAndlocation(Integer age);
}
