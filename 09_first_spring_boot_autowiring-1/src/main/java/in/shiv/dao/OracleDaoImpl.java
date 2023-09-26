package in.shiv.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class OracleDaoImpl implements ReportDao{

	public OracleDaoImpl() {
		System.out.println("OracleDaoImpl :: Constructor");
	}
	
	@Override
	public String findAll() {
		//db logic to be implemented
		return "oracle report data";
	}

}
