package in.shiv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.shiv.dao.ReportDao;

@Service
public class ReportService {
	public ReportService() {
		System.out.println("ReportService :: Constructor");
	}
	
	private ReportDao reportDao;
	
	@Autowired
//	@Qualifier("oracle")
	@Qualifier("mysql")
	public void setReportDao(ReportDao reportDao) {
		this.reportDao = reportDao;
	}
	
	public void generateReport() {
		System.out.println("generateReport() :: executed");
		String reportData = reportDao.findAll();
		System.out.println(reportData);
	}

}
