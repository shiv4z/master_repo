package in.shiv.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public UserDao() {
		//persistenece logic to implements
		System.out.println("UserDao :: Contsructor");
	}
}
