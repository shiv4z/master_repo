package package1.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public UserDao() {
		//Some logic
		System.out.println("UserDao :: Constructor");
	}

}
