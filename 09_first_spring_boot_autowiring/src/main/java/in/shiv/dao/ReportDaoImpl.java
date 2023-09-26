package in.shiv.dao;

public class ReportDaoImpl implements ReportDao {
	public ReportDaoImpl() {
		System.out.println("ReportDaoImpl :: Constructor");
	}

	@Override
	public String findAll() {
		//db logic to implement here
		return "report data";
	}

}
