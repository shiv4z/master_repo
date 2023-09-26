package in.shiv.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Repository("mysql")
@Repository
@Primary
public class MySqlDaoImpl implements ReportDao{
	
	public MySqlDaoImpl() {
		System.out.println("MySqlDaoImpl :: Constructor");
	}
	
	@Override
	public String findAll() {
		// TODO Auto-generated method stub
		return "Mysql report data";
	}

}
