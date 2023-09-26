package in.shiv.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MySqlDaoimpl implements  ReportDao{

	public MySqlDaoimpl() {
		System.out.println("MySqlDaoimpl :: Constructor");
	}
	@Override
	public String findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
