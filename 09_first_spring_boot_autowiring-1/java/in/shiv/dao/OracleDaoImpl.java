package in.shiv.dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleDaoImpl implements ReportDao{

	public OracleDaoImpl() {
		System.out.println("OracleDaoImpl :: Constructor");
	}
	@Override
	public String findAll() {
		// TODO Auto-generated method stub
		return "Oracle report data";
	}

}
